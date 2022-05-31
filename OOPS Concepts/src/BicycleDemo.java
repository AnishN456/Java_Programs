
class Bicycle
{
	int cadence=0;
	int speed=0;
	int gear=1;
	
	void changeCadence(int newValue)
	{
		cadence=newValue;
	}
	
	void changeGear(int newValue)
	{
		gear=newValue;
	}
	
	void SpeedUp(int increment)
	{
		speed += increment;
	}
	
	void ApplyBrakes(int decrement)
	{
		speed -= decrement;
	}
	
	void printStates()
	{
		System.out.println("cadence: "+cadence+" Gear: "+gear+" Speed: "+speed);
	}
}
public class BicycleDemo {

	public static void main(String[] args) {
		//create two different bike objects.
		Bicycle bike1 = new Bicycle();
		Bicycle bike2 = new Bicycle();
		
		//Invoke methods of these objects
		bike1.changeCadence(50);
		bike1.SpeedUp(10);
		bike1.changeGear(2);
		bike1.printStates();
		bike1.SpeedUp(10);
		
		//Invoke methods of bike2 objects.
		bike2.changeCadence(40);
		bike2.SpeedUp(20);
		bike2.changeGear(3);
		bike2.ApplyBrakes(20);
		bike2.printStates();

	}

}
