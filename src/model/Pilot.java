package model;


public class Pilot{
	
	public enum Team {SCUDERIAFERRARI,MCLARENF1,REDBULL,MERCEDEZAMG,RACINGPOINT,ALFAROMEO,RENAULT,WILLIAMS,
					  TEAMLOTUS,ALPHATAURI,HAASF1,SAUBERF1,SAHARA,TOROROSSO,VERYFAST};
	
	Team team;
	String name;
	int age;
	int[] score;
	
	public Pilot(int fields){
		score = new int[fields];
		name = new String();
		age = 0;
	}//End constructor1
	
	public Pilot(String name,int age, String team,int[] score){
		this.name = name;
		this.age = age;
		this.score = score;
		this.team = Team.valueOf(team);
	}//End constructor2
	
	public double calculateAverage(){
		double average = 0;
		for(int i = 0; i < score.length; i++){
			average += score[i];
		}//End for
		if(score.length > 0){
			average /= score.length;
		}//End if
		return average;
	}//End calculateAverage.
	
	//Get and Set methods
	
	public void setName(String name){
		this.name = name;
	}//End setName
	public String getName(){
		return name;
	}//End getName
	public void setAge(int age){
		this.age = age;
	}//End setAge
	public int getAge(){
		return age;
	}//End getAge.
	public void setScore(int[] s){
		score = s;
	}//End setScore.
	public int[] getScore(){
		return score;
	}//End getScore.
	public void setTeam(String team){
		this.team = Team.valueOf(team);
	}//End team.
	public String getTeam(){
		return team.toString();
	}//End getTeam.
	
}//End Pilot.