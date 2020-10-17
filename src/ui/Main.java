package ui;
import model.Championship;
import java.util.Scanner;

public class Main{
	
	public static Scanner sc = new Scanner(System.in);
	public static Championship champion;
	
	public static void main(String[] args){
		int year = 0;
		int races = 0;
		int pilots = 0;
		System.out.print("Ingrese el anio en el que se celebra el campeonato: ");
		year = sc.nextInt();
		System.out.print("Ingrese la cantidad de gran premios que habra este campeonato: ");
		races = sc.nextInt();
		System.out.print("Ingrese la cantidad de pilotos que estan participando: ");
		pilots = sc.nextInt();
		sc.nextLine();
		champion = new Championship(year,races,pilots);
		for(int i = 0; i < champion.getAmountPilots();i++){
			createPilot();
		}//End for
		System.out.print("\n"+champion.showAverageTimes());
	}//End main
	
	public static void createPilot(){
		String name = new String();
		int age = 0;
		String team = new String();
		int[] scores = new int[champion.getRaces()];
		System.out.print("\nIngrese el nombre del piloto: ");
		name = sc.nextLine();
		System.out.print("\nIngrese la edad del piloto: ");
		age = sc.nextInt();
		sc.nextLine();
		System.out.print("\nIngrese el equipo al que pertenece el piloto: ");
		team = sc.nextLine();
		
		while(!Championship.checkTeam(team)){
			System.out.println("Ese equipo no existe en el campeonato!!");
			System.out.print("\nIngrese el equipo al que pertenece el piloto: ");
			team = sc.nextLine();
		}//End while
		for(int i = 0; i < scores.length; i++){
			System.out.print("\nIngrese el tiempo en segundos del gran premio " + (i+1)+": " );
			scores[i] = sc.nextInt();
			sc.nextLine();
		}//End for
		champion.addPilot(name,age,team,scores);
	}//End createdPilot
	
	
}//End Main