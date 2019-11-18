package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Jugar j = new Jugar();
		Scanner sc = new Scanner(System.in);
		

		System.out.println("¿Quieres jugar? Si/No");
		String play = sc.nextLine();
		if(play.equalsIgnoreCase("si")) {
			j.jugar();
		}else if (play.equalsIgnoreCase("no")) {
			System.out.println("Has salido del juego.");
			System.exit(0);
		}
		
		while (play.equalsIgnoreCase("si")){
		System.out.println("¿Quieres volver a jugar? Si/No");
		String play2 = sc.nextLine();
		if(play2.equalsIgnoreCase("si")) {
			j.volverJugar();
		}else if (play2.equalsIgnoreCase("no")) {
			System.out.println("Has salido del juego.");
			System.exit(0);
			}
		}
		sc.close();
		
	}
	
}
