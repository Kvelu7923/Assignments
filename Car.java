package week1.day2;

public class Car {
	public void applyBreake() {
	System.out.println("applyBreak");	
  }
    public void applyGear () {
    System.out.println("äpplyGear");	
  }
    public void switchOnAc() {
    System.out.println("switchOnAc");	  
  }
    public void aplyAccelerate() {
    System.out.println("applyAccelerate");	
    }
public static void main(String[] args) {
	Car actions=new Car();
	actions.applyBreake();
	actions.applyGear();
	actions.switchOnAc();
	actions.aplyAccelerate();
  }	
}    