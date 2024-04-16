package com.softtek.Abril16_1.modelo.Ej5;

import org.springframework.stereotype.Component;

@Component
public class AccesoDesarrollo implements lDAO{
    @Override
    public String insertar(Cliente c1) {
        return "El cliente " + c1.getClass() + " tiene" +
                " acceso a desarrollo";
    }
}
