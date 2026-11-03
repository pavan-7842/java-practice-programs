package Com.globalQuest.CoreJavaBasic;

public class Dog {
	//Rule-1 making all properties as private 
	private String name;
	private String color;
	private String breed;
	private int cost;
	private int age ;
	
	//Rule 2a : Generic Setters
	void setData() {
		name = "Ramu";
		color ="brown";
		breed = "GR";
		cost = 7000;
		age =8;
	}
	//Rule 2b : Specific Setters
	void setName(String a) {
		name = a;
	}
	void setColor(String a) {
		color = a;
	}
	void setBreed(String a) {
		breed = a;
	}
	void setCost(int a) {
		cost = a;
	}
	void setAge(int a) {
		age = a;
	}
	
	// Rule 3a : Generic Getters
	void getData() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(breed);
		System.out.println(cost);
		System.out.println(age);	
	}
	// Rule 3b : Specific getters
	String getName() {
		return name;
	}
	String getColor() {
		return color;
	}
	String getBreed() {
		return breed;
	}
	int getCost() {
		return cost;
	}
	int getAge() {
		return age;
	}
//}
//public class Dog{
	public static void main(String[] args) {
		Dog d1 = new Dog();
//		d1.name = "Rocky";//It is no accessible as it is private 
//		d1.color = "Red";//It is no accessible as it is private
//		d1.breed = "pug";//It is no accessible as it is private
//		d1.cost =5000;//It is no accessible as it is private
//		d1.age = 8;//It is no accessible as it is private
//		
//		
//		System.out.println(d1.name);//It is no accessible as it is private
//		System.out.println(d1.color);//It is no accessible as it is private
//		System.out.println(d1.breed);//It is no accessible as it is private
//		System.out.println(d1.cost);//It is no accessible as it is private
//		System.out.println(d1.age);//It is no accessible as it is private
		
		d1.getData();//generic getter call
		System.out.println("----------------");
		d1.setData();//generic setter call
		d1.getData();//generic getter call
		
		
		System.out.println("----------------");
		//specific setter call
		d1.setName("Jimmy");
		d1.setColor("black");
		d1.setBreed("GS");
		d1.setCost(4000);
		d1.setAge(4);
		//Specific getter call
		System.out.println(d1.getName());
		System.out.println(d1.getColor());
		System.out.println(d1.getBreed());
		System.out.println(d1.getCost());
		System.out.println(d1.getAge());
	}

}
