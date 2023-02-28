package com.example.repaso03spring.servicios;

import com.example.repaso03spring.modelos.Fecha;

import java.time.LocalDate;

public class FechaServicio {
    public Fecha fechaActual() {
        return new Fecha(LocalDate.now().getDayOfMonth(), LocalDate.now().getMonthValue(), LocalDate.now().getYear());
    }
    public Fecha incrementFecha(int increment) {
        LocalDate fecha2 = LocalDate.now().plusDays(increment);
        return new Fecha(fecha2.getDayOfMonth(), fecha2.getMonthValue(), fecha2.getYear());
    }
}
