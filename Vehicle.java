package surya;

interface vechicle {
	void key();
	void start();
	void stop();
	void run();
}


class car implements vechicle {
	public void key() {
	System.out.println("a driver");	
}
public void start() {
	System.out.println("driver start a engine");
}
public void stop() {
	System.out.println("driver stop a engine ");
}
public void run() {
	System.out.println("driver drive a car");
}
}
 class flight implements vechicle {
 	 public void key() {
 		 System.out.println("a driver");
 	 }
  
 	 public void start() {
 		 System.out.println("driver start a engine");
 	 }
 	 public void stop() {
 		 System.out.println("driver stop a engine");
 	 }
 	 public void takeoff() {
 		 System.out.println("driver takeoff a plane");
 	 }
 	public void run() {
 		System.out.println("driver drive a car");

 	}
 }
 	class Mechanic {
		 void check(car c){
			 System.out.println("checking");
			c.start();
			c.run();
			c.stop();
			c.key();
		}
	} 

public class Vehicle {

	public static void main(String[] args) {

		car c=new car();
		car obj=new car();
		flight obj1=new flight();
		Mechanic m =new Mechanic();		
		m.check(c);
		
		obj.key();
		obj1.key();
		obj.start();
		obj1.start();
		obj.stop();
		obj1.stop();
		obj1.takeoff();
		}
}