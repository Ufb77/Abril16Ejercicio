package com.softtek.Abril16_1.modelo.Ej4;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
public class Director implements Empleado {
    @Autowired
    private lInforme informe;

    public Director() {
    }

    public Director(lInforme informe) {
        this.informe = informe;
    }

    @Override
    public String getTareas() {
        return "Director ha obtenido tareas";
    }

    @Override
    public String getInforme() {
        return "Director ha obtenido" + this.informe.getInforme();
    }
}
