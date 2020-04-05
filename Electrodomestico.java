/**
 * Autor: Andrés Rocher Escriva
 * Ejercicio 4 Tema 7 - Herencia
 */

package ejer4;

public class Electrodomestico {
	
	 float PrecioBase;//variables
	 String color;//variables
	 float peso;//variables
	 char ConsumoEnergetico;//variables
		



public Electrodomestico() {//contructor por defecto
	
	color="blanco";//valor x defecto
	ConsumoEnergetico= 'F';//valor x defecto
	PrecioBase=100;//valor x defecto
	peso=5;//valor x defecto		
}

public Electrodomestico(float PrecioBase, float peso) {//contructor con dops parámetros
	
	this.PrecioBase=PrecioBase;//parametro
	this.peso=peso;//parametro
	
}

public Electrodomestico(float PrecioBase, String color, float peso, char ConsumoEnergetico) {//contructor con todos los parámetros
	
	this.color = "blanco";
	this.ConsumoEnergetico = 'F';
	this.PrecioBase = PrecioBase;
	this.peso = peso;
	
}

//---------------------------------------------------------------------------------------------------
//Getters/Setters

public float getPrecioBase() {
	return PrecioBase;
}

public void setPrecioBase(float PrecioBase) {
	this.PrecioBase = PrecioBase;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public float getPeso() {
	return peso;
}

public void setPeso(float peso) {
	this.peso = peso;
}

public char getConsumoEnergetico() {
	return ConsumoEnergetico;
}

public void setConsumoEnergetico(char ConsumoEnergetico) {
	this.ConsumoEnergetico = ConsumoEnergetico;
}
//----------------------------------------------------------------------------------------------

private void comprobarConsumo(char letra) {//comprovador si la letra es correcta con if
	
	if (letra=='A' || letra=='B' || letra=='C' || letra=='D' || letra=='E' || letra=='F') {
		ConsumoEnergetico = letra;
	}else ConsumoEnergetico ='F';
	
}

private void comprobarColor(String color) {
	
	if (color=="gris" || color =="azul" || color=="rojo" || color=="negro" || color=="blanco") {
		this.color = color;
	}else this.color = "blanco";
	
}

public double precioFinal() {//metodo el cual muestra el incremento del precio segun consumo energetuico
	double precios=0;
	
	switch (ConsumoEnergetico) {//switch para poder separar los caos de aumento
	
	case 'A':
		precios = precios + 100;
		break;
		
	case 'B':
		precios = precios + 80;
		break;
		
	case 'C':
		precios= precios+ 60;
		break;
		
	case 'D':
		precios = precios + 50;
		break;
		
	case 'E':
		precios = precios + 30;
		break;
		
	case 'F':
		precios = precios + 10;
		break;
}	
	
	if (peso <= 19) {//perteneciente al mismo metodo pero muestra el aumento del precio segur el peso.
		precios = precios + 10;
	}
	
	if (peso >= 20 && peso <= 49) {
		precios = precios + 50;
	}
	
	if (peso >= 50 && peso <= 79) {
		precios = precios + 80;
	}
	
	if (peso >= 79) {
		precios = precios + 100;
	}
	return precios;
	}
}








