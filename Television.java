/**
 * Autor: Andrés Rocher Escriva
 * Ejercicio 4 Tema 7 - Herencia
 */

package ejer4;

public class Television extends Electrodomestico {
	
	float resolucion;//variable
	boolean smartTV;//variable
	
	public Television() {//contructor por defecto
		
		resolucion=20;//valor x defecto
		smartTV=false;//valor x defecto
		
		
	}
	
	public Television(float PrecioBase, float peso) {//contructor con los parámetros de precio y peso
		
		super(PrecioBase, peso);//llamamos clase padre para obtener los datos
		resolucion=20;//definimos el valor predeterminado
		smartTV=false;
	}
	
	public Television(float PrecioBase, String color, float peso, char ConsumoEnergetico, float resolucion, boolean smartTV) {
		
		super(PrecioBase, color, peso, ConsumoEnergetico);
		this.resolucion=resolucion;
		this.smartTV=smartTV;
		
	}
//----------------------------------------------------------------------------------------------------
	//Getters / Setters
	
	public float getResolucion() {
		return resolucion;
	}

	public void setResolucion(float resolucion) {
		this.resolucion = resolucion;
	}

	public boolean getSmartTV() {
		return smartTV;
	}

	public void setSmartTV(boolean smartTV) {
		this.smartTV = smartTV;
	}
//-----------------------------------------------------------------------------------------------------
	
	public double precioFinal() {//metodo que muestra el resultado final
		
		double precios=super.precioFinal();
		
		if (resolucion >=40) {
			
			precios=precios * 1.30;
			
		}
		
		if (smartTV == true) {
			
			precios=precios+50;
			
		}
		return precios;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
