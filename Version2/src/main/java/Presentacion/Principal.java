package main.java.Presentacion;

import main.java.Dominio.Estudiante;
import main.java.Dominio.Persona;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1 = new Persona("Ismael", "García", 20);
		System.out.println(p1.toString());
		
		Persona p2 = new Estudiante ("Manolo","Muñoz",19,3000);
		
		System.out.println(((Estudiante)p2).getBeca());

	}

}
