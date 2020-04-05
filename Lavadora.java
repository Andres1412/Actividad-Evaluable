/**
 * Autor: Andrés Rocher Escriva
 * Ejercicio 4 Tema 7 - Herencia
 */

package ejer4;

public class Lavadora extends Electrodomestico {
	
	float carga;//variable
	
	public Lavadora() {//contructor por defecto
		
		carga=5;//valor x defecto
		
	}
	
	public Lavadora(float PrecioBase, float peso) {//contructor con precio y el peso
		
		super(PrecioBase, peso);//Codigo para llamar al padre
		this.carga=5;//definimos valor x defecto
		
	}
	
	public Lavadora(float PrecioBase, String color, float peso, char ConsumoEnergetico, float carga) {//constructor con todos los parámetros
		
		super(PrecioBase, color, peso, ConsumoEnergetico);//codigo pata llamar a la clase padre
		this.carga=carga;
		
	}
//----------------------------------------------------------------------------------------------------
	//Getters / Setters
	public float getCarga() {
		return carga;
	}

	public void setCarga(float carga) {
		this.carga = carga;
	}
//-------------------------------------------------------------------------------------------------------
	
	public double PrecioFinal() {//metodo que incrementa el resultado dependiendo de las características
		
		double precios = super.precioFinal();
				
		if (30 <= carga) {
			
			precios=precios + 50;
			
		}
		
		return precios;
	}

}
