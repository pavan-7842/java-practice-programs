package Com.globalQuest.CoreJavaFileHandling.SerializationCodes;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class SerializationProgram {
	public static void main(String[] args) throws IOException {
		String path = "D:\\FileHandling\\Cricketer.txt";
		FileOutputStream fos = new FileOutputStream(path);
		ObjectOutputStream oos = new  ObjectOutputStream(fos);
		Cricketer c1 = new Cricketer("Sachin","india",35,350,20000);
		System.out.println(c1);
		System.out.println("---------------------------");
		System.out.println(c1.getName());
		System.out.println(c1.getCountry());
		System.out.println(c1.getAge());
		System.out.println(c1.getMatches());
		System.out.println(c1.getRuns());
		oos.writeObject(c1);
		System.out.println("The Object is Stored");
	}
}
