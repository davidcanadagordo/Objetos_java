package edu.upc.eetac.dsa.davidcanadagordo.Objetos_java;

public class Arbol {
	
	int altura;
	String nombre;

	Arbol(int num) {
		altura = num;
		System.out.println("Un árbol de " + altura + " metros");
	}

	Arbol(String arbol) {
		nombre = arbol;
		System.out.println("Un " + nombre);
	}

	Arbol() {
		System.out.println("Un árbol genérico");
	}

	Arbol(int num, String arbol) {
		altura = num;
		nombre = arbol;

		System.out.println("Un " + nombre + " de " + altura + " metros");
	}
}
