package Com.globalQuest.CoreJavaBasic;

class OS{
	String name;
	double version;
	public OS(String name, double version) {
		super();
		this.name = name;
		this.version = version;
	}
	public String getName() {
		return name;
	}
	public double getVersion() {
		return version;
	}
	
}
class Mobile{
	OS os = new OS("os-1",3.7);
	void hasCharger(Charger c) {
		System.err.println(c.getCompany());
		System.err.println(c.getVersion());
	}
}
class Charger{
	String company;
	double version;
	public Charger(String company, double version) {
		super();
		this.company = company;
		this.version = version;
	}
	public String getCompany() {
		return company;
	}
	public double getVersion() {
		return version;
	}
	
}
public class AggregationAndComposition {
	public static void main(String[] args) {
		Mobile m = new Mobile();
		Charger c = new Charger("Apple",4.5);
		//getting os details
		System.err.println(m.os.getName());
		System.err.println(m.os.getVersion());
		System.out.println("-------------");
		//getting charger details
		m.hasCharger(c);
		//killing mobile
		m=null;
		//getting os details
//		System.err.println(m.os.getName());
//		System.err.println(m.os.getVersion());
//		System.err.println("--------------");
//		System.err.println(c.getCompany());
//		System.err.println(c.getVersion());
	}
}