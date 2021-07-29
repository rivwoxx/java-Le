//Codeacademy ex.

package exercises;

public class Droid{
	  String name;
	  int batteryLevel;

	  public Droid(String nom){
	      name = nom;
	      batteryLevel = 100;
	  }

	  public void performTask(String task){
	    if(batteryLevel > 0){
	      System.out.println(name + " is performing a task: " + task);
	      batteryLevel -= 10;
	    }else{
	      System.out.println(name + " cannot performing a task: " + task + ". Out of battery");
	    }
	    
	  }

	  public void energyReport(){
	    System.out.println(name + " have " + batteryLevel +" % battery");
	  }
	  
	  public int energyTransfer(int energyTransfered){
	      batteryLevel = batteryLevel + energyTransfered;
	      return  batteryLevel;
	  }

	  public String toString(){
	    return "My name is: " + name;
	    
	    }
	  
	  public static void main(String[] args){
	      Droid codey = new Droid("Codey");
	      System.out.println(codey);
	      codey.performTask("dancing");
	      codey.energyReport();
	      codey.performTask("playing");
	      codey.energyReport();
	      codey.energyTransfer(10);
	      codey.energyReport();
	      codey.performTask("playing");
	      codey.performTask("playing");
	      codey.performTask("playing");
	      codey.performTask("playing");
	      codey.performTask("playing");
	      codey.performTask("playing");
	      codey.performTask("playing");
	      codey.performTask("playing");
	      codey.performTask("playing");
	      codey.performTask("playing");
	      codey.performTask("playing");
	      codey.energyReport();
	  }
	}