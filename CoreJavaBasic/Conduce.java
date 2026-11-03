package Com.globalQuest.CoreJavaBasic;

class Airport{
	void permit(Plane ref) {
	ref.takeoff();
	ref.fly();
	ref.land();
	}
}
public class Conduce {
	public static void main(String[] args) {
		CargoPlane cp = new CargoPlane();
		Fighterplane fp = new Fighterplane();
		Airport ap = new Airport();
		System.err.println("-------Cargo Plane-------");
		ap.permit(cp);
		cp.cargoGoods();
		System.err.println("--------");
		System.err.println("-----Fighter Plane------");
		ap.permit(fp);
		fp.cargoWeapons();
	}

}
