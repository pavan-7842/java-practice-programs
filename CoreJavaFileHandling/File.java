package Com.globalQuest.CoreJavaFileHandling;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
public class File {
	public static void main(String[] args) throws FileNotFoundException, IOException{
		String path1 = "D:\\FileHandling\\Input.txt";
		String path2 = "D:\\FileHandling\\Output.txt";
		FileInputStream fis = new FileInputStream(path1);
		int temp;
		FileOutputStream fos = new FileOutputStream(path2);
		while((temp = fis.read())!=-1) {
			fos.write(temp);
		}
		System.out.println("File Loaded");
		fos.close();
		fis.close();

	}
}
