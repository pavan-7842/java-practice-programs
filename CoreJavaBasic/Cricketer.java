package Com.globalQuest.CoreJavaBasic;

public class Cricketer {
	private String name;
	private String country;
	private int runs;
	private int wickets;
	private int catches;
	//Zero Parameterized
	Cricketer(){
		super();
		this.name="Virat";
		this.country="ind";
		this.runs=7000;
		this.wickets=7;
		this.catches=70;
		System.out.println(this.name);
		System.out.println(this.runs);
		System.out.println(this.country);
		System.out.println(this.wickets);
		System.out.println(this.catches);
	}
	//One parameterized
	Cricketer(String name){
		this();
		this.name=name;
		System.out.println(this.name);
		System.out.println(this.country);
		System.out.println(this.runs);
		System.out.println(this.wickets);
		System.out.println(this.catches);
	}
	//Two Parameterized
	Cricketer(String name,String country){
		this("Smith");
		this.name=name;
		this.country=country;
		System.out.println(this.name);
		System.out.println(this.country);
		System.out.println(this.runs);
		System.out.println(this.wickets);
		System.out.println(this.catches);
	}
	//Three Parameterized
	Cricketer(String name,String country,int runs){
		this("ABD","SA");
		this.name=name;
		this.country=country;
		this.runs=runs;
		System.out.println(this.name);
		System.out.println(this.country);
		System.out.println(this.runs);
		System.out.println(this.wickets);
		System.out.println(this.catches);
	}
	//Four Parameterized
		Cricketer(String name,String country,int runs,int wickets){
			this("Abhi","ind",9000);
			this.name=name;
			this.country=country;
			this.runs=runs;
			this.wickets=wickets;
			System.out.println(this.name);
			System.out.println(this.country);
			System.out.println(this.runs);
			System.out.println(this.wickets);
			System.out.println(this.catches);
		}
		//Five Parameterized
				Cricketer(String name,String country,int runs,int wickets,int catches){
					this("Rohith","ind",6000,30);
					this.name=name;
					this.country=country;
					this.runs=runs;
					this.wickets=wickets;
					this.catches=catches;
					System.out.println(this.name);
					System.out.println(this.country);
					System.out.println(this.runs);
					System.out.println(this.wickets);
					System.out.println(this.catches);
				}
	public static void main(String[] args) {
		Cricketer c =new Cricketer("sachin","ind",23000,200,400);
		
	}
}
