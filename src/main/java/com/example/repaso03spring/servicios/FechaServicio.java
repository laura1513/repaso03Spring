package com.example.repaso03spring.servicios;

import com.example.repaso03spring.modelos.Fecha;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
@Service
public class FechaServicio {
    public Fecha fechaActual() {
        return new Fecha(LocalDate.now().getDayOfMonth(), LocalDate.now().getMonthValue(), LocalDate.now().getYear());
    }
    public Fecha incrementFecha(int increment) {
        LocalDate fecha2 = LocalDate.now().plusDays(increment);
        return new Fecha(fecha2.getDayOfMonth(), fecha2.getMonthValue(), fecha2.getYear());
    }
    public Fecha cambiarFecha(Fecha fech) {
        LocalDate fechaCorrect = LocalDate.of(fech.getAnyo(), fech.getMes(), fech.getDia());
        return new Fecha(fechaCorrect.getDayOfMonth(), fechaCorrect.getMonthValue(), fechaCorrect.getYear());
    }
}
