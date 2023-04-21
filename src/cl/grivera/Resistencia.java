package cl.grivera;
import java.util.*;

public class Resistencia {

	public static void main(String[] args) {
	
		
		Scanner ingreso = new Scanner(System.in);
		System.out.println("Ingrese Resistencia 1:");
		int r1= ingreso.nextInt();
		System.out.println("Ingrese Resistencia 2:");
		int r2= ingreso.nextInt();
		System.out.println("Ingrese Resistencia 3:");
		int r3= ingreso.nextInt();
		
		
		if (r1>=1 && r2 >=1 && r3 >= 1) {
			float rt = 1/((1/(float)r1)+(1/(float)r2)+(1/(float)r3));
			
			System.out.println("La resistencia total es de " + String.format("%.2f",rt));
		}else {
			System.out.println("El valor de las resistencias debe ser mayor a 1");
		}
		ingreso.close();
	}

}
