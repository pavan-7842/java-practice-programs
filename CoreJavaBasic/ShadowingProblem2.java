package Com.globalQuest.CoreJavaBasic;

public class ShadowingProblem2 {

		//Rule-1: making all properties as private
		private String name;
		private String color;
		private String breed;
		private int cost;
		private int age; 
		
		//Rule -2a:Generic Setters
		void setData(String name,String color,String breed,int cost,int age) {
			name=name;
			color=color;
			breed=breed;
			cost=cost;
			age=age;
		}
		
		//Rule-2b:Specific Setters
		void setName(String name) {
			name=name;	
		}
		void setColor(String color) {
			color=color;
		}
		void setBreed(String breed) {
			breed=breed;
		}
		void setCost(int cost) {
			cost=cost;
		}
		void setAge(int age) {
			age=age;
		}
		
		//Rule 3a:generic getters
		void getData() {
			System.out.println(name);
			System.out.println(color);
			System.out.println(breed);
			System.out.println(cost);
			System.out.println(age);
		}
		//Rule 3b:Specific Getters
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
//	}
//	public class Launch2 {
		public static void main(String[] args) {
			ShadowingProblem2 d=new ShadowingProblem2();
			
			d.getData();
			System.out.println("-----------");
			d.setData("Jimmy", "Red", "GK", 8777, 9);
			d.getData();
			System.out.println("------------");
			d.setName("Tiger");
			d.setColor("Black");
			d.setBreed("GS");
			d.setCost(5500);
			d.setAge(6);
			System.out.println(d.getName());
			System.out.println(d.getColor());
			System.out.println(d.getBreed());
			System.out.println(d.getCost());
			System.out.println(d.getAge());
		}
	}