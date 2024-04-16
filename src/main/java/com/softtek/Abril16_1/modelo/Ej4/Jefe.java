package com.softtek.Abril16_1.modelo.Ej4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Jefe implements  Empleado{
    @Autowired
    private lInforme informe;

    public Jefe() {
    }

    public Jefe(lInforme informe) {
        this.informe = informe;
    }

    @Override
    public String getTareas() {
        return "El jefe ha obtenido tareas";
    }

    @Override
    public String getInforme() {
        return "Jefe ha obtenido" + this.informe.getInforme();
    }
}
