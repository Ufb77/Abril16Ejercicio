package com.softtek.Abril16_1.modelo.Ej4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Secretario implements  Empleado{

    @Autowired
    private lInforme informe;
    private String empresa;
    private String email;


    public Secretario() {
    }

    public Secretario(lInforme informe, String empresa, String email) {
        this.informe = informe;
        this.empresa = empresa;
        this.email = email;
    }

    @Override
    public String getTareas() {
        return "Secretario ha obtenido tareas";
    }

    @Override
    public String getInforme() {
        return "Secretario ha obtenido" + this.informe.getInforme();
    }

    public void setInforme(lInforme informe) {
        this.informe = informe;
    }
}
