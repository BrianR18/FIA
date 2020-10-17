package model;

public class Championship{
	int year;
	int races;
	Pilot[] pilots;
	
	public Championship(int year, int races, int pilots){
		this.year = year;
		this.races = races;
		this.pilots = new Pilot[pilots];
	}//End constructor1.
	
	public Championship(int pilots){
		this(0,0,pilots);
	}//End constructor2.
	
	
	public void addPilot(String name,int age,String team,int[] scores){
		boolean a = false;
		for(int i = 0; i < pilots.length && !a; i++){
			if(pilots[i] == null){
				team = team.toUpperCase();
				pilots[i] = new Pilot(name,age,team,scores);
				a = true;
			}//End if.
		}//End for.
	}//End addPilot.
	
	public boolean checkTeam(String team){
		boolean checked = false;
		team = team.toUpperCase();
		Pilot.Team[] tm = Pilot.Team.values();
		for(int i = 0; i < tm.length && !checked; i++ ){
			if(tm[i].toString().equals(team)){
				checked = true;
			}//End if
		}//End for
		return checked;
	}//End checkTeam.
	
	public boolean findPilot(String name){
		boolean found = false;
		for(int i = 0; i < pilots.length && !found; i++){
			if(pilots[i] != null && pilots[i].getName().equalsIgnoreCase(name)){
				found = true;
			}//End if
		}//End for
		return found;
	}//End findPilot.
	
	public String showAverageTimes(){
		String averageTimes = new String();
		double average = 0;
		double seconds = 0;
		double minutes = 0;
		double hours = 0;
		
		averageTimes = "\nMostrando tiempos...\n";
		for(int i = 0; i < pilots.length; i++){
			if(pilots[i] != null ){
				averageTimes += "Nombre: " + pilots[i].getName() + "  escuderia: " + pilots[i].getTeam() + "   tiempo promedio: " ;
				average = pilots[i].calculateAverage();
				seconds = average % 60;
				minutes = (int) average / 60;
				if(minutes >= 60){
					hours = minutes / 60;
					minutes = minutes % 60;
				}//End if
				averageTimes += String.format("%.00f:%.00f:%.00f\n",hours,minutes,seconds);
			}//End if
		}//End for
		return averageTimes;
	}//End showAverageTimes.
	
	public String showTeams(){
		String teamsName = new String();
		Pilot.Team[] tm = Pilot.Team.values();
		for(Pilot.Team n: tm ){
			teamsName += "-" + n.toString() + "\n";
		}//End for
		teamsName = teamsName.toLowerCase();
		return teamsName;
	}//End showTeams
	
	//Set and Get methods
	public void setYear(int year){
		this.year = year;
	}//End setYear.
	public int getYear(){
		return year;
	}//End getYear.
	public void setRaces(int races){
		this.races = races;
	}//End setRaces.
	public int getRaces(){
		return races;
	}//End getRaces
	public int getAmountPilots(){
		return pilots.length;
	}
}//End Championship.