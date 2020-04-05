/**
 * Autor: Andrés Rocher Escriva
 * Ejercicio 4 Tema 7 - Herencia
 */

package ejer4;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double PreElec=0;
		double PreLava=0;
		double PreTele=0;
		
		//procedemos a crear los objetos y definirlos
		
		
		Electrodomestico [] Electrodomestico=new Electrodomestico[10];
		
		//ELECTRODOMÉSTICOS
				Electrodomestico E1=new Electrodomestico();
				
				Electrodomestico E2=new Electrodomestico();

				Electrodomestico E3=new Electrodomestico();
				
				//LAVADORAS
				Lavadora L1=new Lavadora();
				
				Lavadora L2=new Lavadora();
				
				Lavadora L3=new Lavadora();
				
				Lavadora L4=new Lavadora();
				
				//TELEVISIÓN
				Television T1=new Television();
				
				Television T2=new Television();
				
				Television T3=new Television();
		
		Electrodomestico[0] = E1;
		Electrodomestico[1] = E2;
		Electrodomestico[2] = E3;
		Electrodomestico[3] = L1;
		Electrodomestico[4] = L2;
		Electrodomestico[5] = L3;
		Electrodomestico[6] = L4;
		Electrodomestico[7] = T1;
		Electrodomestico[8] = T2;
		Electrodomestico[9] = T3;
		
		
		for (int i = 0;i < 10;i++) {
			
			System.out.println("Producto "+ (i+1));
			
			if (Electrodomestico[i] instanceof Electrodomestico) {
				
				PreElec = PreElec + Electrodomestico[i].precioFinal();
			}
			
			if (Electrodomestico[i] instanceof Lavadora) {
				
				PreLava = PreLava + Electrodomestico[i].precioFinal();
			}
			
			if (Electrodomestico[i] instanceof Television) {
				
				PreTele = PreTele + Electrodomestico[i].precioFinal();
			}
			
			System.out.println(Electrodomestico[i].precioFinal());
			
		}
		
		System.out.println("El resultado de los electrodomesticos es de "+PreElec+" euros.");
		System.out.println("El resultado de las lavadoras es de "+PreLava+" euros.");
		System.out.println("Y el resultado de las televisiosnes es de "+PreTele+" euros");
		
		
		
		
		
	}
			
			
}		

