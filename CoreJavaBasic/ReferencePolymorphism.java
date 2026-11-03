package Com.globalQuest.CoreJavaBasic;

class Plane1{
void takeoff() {
	System.err.println("The plane take off");
}
void fly() {
	System.err.println("The plane flying");
}
void land() {
	System.err.println("The plane landing");
}
}
class CargoPlane1 extends Plane1{
	@Override
	void fly() {
		System.err.println("cargo plane fly at low altitude");
	}
	void cargoGoods() {
		System.err.println("cargo plane carry goods");
	}
}
class FighterPlane1 extends Plane1{
	void fly() {
		System.err.println("Fighterplane fly at low altitude");
	}
	void cargoWeapons() {
		System.err.println("Fighter plane carry Weapons");
	}
}
public class ReferencePolymorphism {
	public static void main(String[] args) {
		CargoPlane cp = new CargoPlane();
		Fighterplane fp = new Fighterplane();
		Plane ref;//parent type reference
		System.err.println("....... cargo plane..........");
		ref=cp;
		ref.takeoff();
		ref.fly();
		ref.land();
		cp.cargoGoods();
		System.err.println("......Fighterplane......");
		ref.takeoff();
		ref.fly();
		ref.land();
		fp.cargoWeapons();
	}

}
