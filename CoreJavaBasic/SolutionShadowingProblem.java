package Com.globalQuest.CoreJavaBasic;

public class SolutionShadowingProblem {
	//Rule-1: making all properties as private
			private String name;
			private String color;
			private String breed;
			private int cost;
			private int age; 
			
			//Rule -2a:Generic Setters
			void setData(String name,String color,String breed,int cost,int age) {
				this.name=name;
				this.color=color;
				this.breed=breed;
				this.cost=cost;
				this.age=age;
			}
			
			//Rule-2b:Specific Setters
			void setName(String name) {
				this.name=name;	
			}
			void setColor(String color) {
				this.color=color;
			}
			void setBreed(String breed) {
				this.breed=breed;
			}
			void setCost(int cost) {
				this.cost=cost;
			}
			void setAge(int age) {
				this.age=age;
			}
			
			//Rule 3a:generic getters
			void getData() {
				System.err.println(name);
				System.err.println(color);
				System.err.println(breed);
				System.err.println(cost);
				System.err.println(age);
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
//		}
//		public class Launch2 {
			public static void main(String[] args) {
				ShadowingProblem d=new ShadowingProblem();
				
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
				System.err.println(d.getName());
				System.err.println(d.getColor());
				System.err.println(d.getBreed());
				System.err.println(d.getCost());
				System.err.println(d.getAge());
			}
		}
