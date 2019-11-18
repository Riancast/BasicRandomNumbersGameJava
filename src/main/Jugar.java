package main;

import java.util.Scanner;

public class Jugar {
	
	
	
	public void jugar() {
		int aleatorio = (int)(Math.random()*100);
		Scanner sc = new Scanner(System.in);
		
		int numero=0;
		int intentos=0;
		System.out.println("Introduce un n�mero de 0 a 100.");
		while(aleatorio!=numero){
					numero=sc.nextInt();
					intentos++;
					if(aleatorio<numero) {
						System.out.println("El n�mero introducido es mayor, int�ntelo de nuevo.");
					}else if(aleatorio>numero){
						System.out.println("El n�mero introducido es menor, int�ntelo de nuevo.");
					}else {
						System.out.println("�Enhorabuena!");
					}
				} 
				System.out.println("Has adivinado el n�mero correcto en "+intentos+" intentos.");
		}
	
	public void volverJugar() {
		jugar();
	}
}
