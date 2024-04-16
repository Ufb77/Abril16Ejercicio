package com.softtek.Abril16_1.modelo.Ej4;

import org.springframework.stereotype.Component;

@Component
public class InformeTrimestre1 implements lInforme {
    @Override
    public String getInforme() {
        return "Informe 1";
    }
}
