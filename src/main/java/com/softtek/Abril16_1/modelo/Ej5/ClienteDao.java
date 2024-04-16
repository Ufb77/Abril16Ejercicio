package com.softtek.Abril16_1.modelo.Ej5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClienteDao {

    @Autowired
    lDAO conexion;

    public ClienteDao() {
    }

    public ClienteDao(lDAO conexion) {
        this.conexion = conexion;
    }

    public String insertar(Cliente c1){
        return conexion.insertar(c1);
    }
}
