package Com.globalQuest.CoreJavaBasic.DataTypes;


	class Tiger{
		String name;
		String color;
		int age;
		void allocateData() {
			name = "Pavan";
			color="white";
			age =3;
		}
		void displayData() {
			System.out.println(name);
			System.out.println(color);
			System.out.println(age);
		}	
	}
	public class InstanceVariable {
		public static void main(String[] args) {
		Tiger t = new Tiger();
		t.displayData();
		System.out.println("-----------");
		t.allocateData();
		t.displayData();
		t.name="Rahul";
		t.color="Black";
		t.age=7;
		System.out.println("------------");
		System.out.println(t.name);
		System.out.println(t.color);
		System.out.println(t.age);
	}
	}

	
