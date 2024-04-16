package com.softtek.Abril16_1;

import com.softtek.Abril16_1.modelo.Ej3.CocheEj4;
import com.softtek.Abril16_1.modelo.Ej3.SeguroCoche;
import com.softtek.Abril16_1.modelo.Ej3.TallerMecanica;
import com.softtek.Abril16_1.modelo.Ej3.TallerPintura;
import com.softtek.Abril16_1.modelo.Ej4.Director;
import com.softtek.Abril16_1.modelo.Ej4.Jefe;
import com.softtek.Abril16_1.modelo.Ej4.Secretario;
import com.softtek.Abril16_1.modelo.Ej5.Cliente;
import com.softtek.Abril16_1.modelo.Ej5.ClienteDao;
import com.softtek.Abril16_1.modelo.Saludo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Abril161Application implements CommandLineRunner {
/*
	@Autowired
	private Saludo saludo;
	@Autowired
	SeguroCoche seguro = new SeguroCoche();

	@Autowired
	CocheEj4 coche;
*/
	@Autowired
	Director d1;

	@Autowired
	Secretario s1;

	@Autowired
	Jefe j1;

	@Autowired
	Cliente c1;

	@Autowired
	ClienteDao cd1;

	public static void main(String[] args) {
		SpringApplication.run(Abril161Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//System.out.println(saludo.getSaludo());
		//System.out.println(seguro.reparar(coche));


		//System.out.println(j1.getInforme());
		//System.out.println(s1.);

		System.out.println(cd1.insertar(c1));



	}
}
