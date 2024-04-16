package com.softtek.Abril16_1.modelo.Ej3;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
public class CocheEj4 {


    private String matricula;

    private String modelo;


    public CocheEj4() {
    }

    public CocheEj4(String matricula, String modelo) {
        this.matricula = matricula;
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
