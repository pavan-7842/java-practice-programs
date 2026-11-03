package Com.globalQuest.CoreJavaBasic;
class Plane{
void takeoff() {
	System.out.println("The plane take off");
}
void fly() {
	System.out.println("The plane flying");
}
void land() {
	System.out.println("The plane landing");
}
}
class CargoPlane extends Plane{
	@Override
	void fly() {
		System.out.println("cargo plane fly at low altitude");
	}
	void cargoGoods() {
		System.out.println("cargo plane carry goods");
	}
}
class Fighterplane extends Plane{
	void fly() {
		System.out.println("Fighterplane fly at low altitude");
	}
	void cargoWeapons() {
		System.out.println("Fighter plane carry Weapons");
	}
}
public class Inheritance {
	public static void main(String[] args) {
		CargoPlane cp = new CargoPlane();
		Fighterplane fp = new Fighterplane();
		System.out.println("....... cargo plane..........");
		cp.takeoff();
		cp.fly();
		cp.land();
		cp.cargoGoods();
		System.out.println("......Fighterplane......");
		fp.takeoff();
		fp.fly();
		fp.land();
		fp.cargoWeapons();
	}

}