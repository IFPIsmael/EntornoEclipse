package Presentacion;

import Dominio.Estudiante;
import Dominio.Persona;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1 = new Persona("Ismael", "Garc�a", 20);
		System.out.println(p1.toString());
		
		Persona p2 = new Estudiante ("Manolo","Mu�oz",19,3000);
		
		System.out.println(((Estudiante)p2).getBeca());

	}

}
