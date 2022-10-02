package week1.day1;

public class Mobile {
	
	public void makeCall(String mobileModel,float mobileWeight) {
	 System.out.println("model=" +mobileModel);
	 System.out.println("weight=" +mobileWeight);
	}
	public void sendMsg(boolean fullyCharged,int mobileCost) {
    System.out.println("charge=" +fullyCharged); 
	System.out.println("cost=" +mobileCost);
	}
public static void main(String[] args) {
	Mobile m= new Mobile();
	m.makeCall("Redmi", 69.25f);
	m.sendMsg(true, 320000);
	System.out.println("This is my mobile");
}
}