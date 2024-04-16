package com.softtek.Abril16_1.modelo.Ej3;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
public class SeguroCoche {

    @Autowired
    private lTaller taller;
    private String aseguradora;

    public SeguroCoche() {
    }

    public SeguroCoche(lTaller taller, String aseguradora) {
        this.taller = taller;
        this.aseguradora = aseguradora;
    }

    public String reparar(CocheEj4 coche){
        return taller.reparar(coche);
    }
}
