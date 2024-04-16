package com.softtek.Abril16_1.modelo.Ej3;

import org.springframework.stereotype.Component;

@Component
public class TallerPintura implements lTaller {

    public TallerPintura() {
    }

    @Override
    public String reparar(CocheEj4 coche) {
        return "El coche con matrícula " + coche.getMatricula() +
                " y modelo " + coche.getModelo() + " ha sido pintado";
    }
}
