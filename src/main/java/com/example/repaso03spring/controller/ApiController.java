package com.example.repaso03spring.controller;

import com.example.repaso03spring.modelos.Fecha;
import com.example.repaso03spring.servicios.FechaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.nio.channels.Pipe;
import java.time.DateTimeException;

@RestController
public class ApiController {
    @Autowired
    private FechaServicio fechaServicio;

    @GetMapping("/api/fecha")
    public ResponseEntity<Fecha> findFecha() {
        return ResponseEntity.ok(fechaServicio.fechaActual());
    }
    @GetMapping("/api/fecha/{increment}")
    public ResponseEntity<Fecha> incrementFecha(@PathVariable("increment") int increment) {
        return ResponseEntity.ok(fechaServicio.incrementFecha(increment));
    }
    @PostMapping(value = "/api/fecha")
    public ResponseEntity<Fecha> crearFecha(@RequestBody Fecha fecha) {
        Fecha correcta;
        try {
            correcta = fechaServicio.cambiarFecha(fecha);
        } catch (DateTimeException e) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(fechaServicio.cambiarFecha(correcta));
    }
}
