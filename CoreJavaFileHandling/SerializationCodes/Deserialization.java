package Com.globalQuest.CoreJavaFileHandling.SerializationCodes;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String path = "D:\\FileHandling\\Cricketer.txt";
		FileInputStream fis = new FileInputStream(path);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Cricketer c1 = (Cricketer) ois.readObject();
		System.out.println(c1);
		System.out.println("--------");
		System.out.println(c1.getName());
		System.out.println(c1.getCountry());
		System.out.println(c1.getAge());
		System.out.println(c1.getMatches());
		System.out.println(c1.getRuns());
	}

}
