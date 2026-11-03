package Com.globalQuest.CoreJavaFileHandling;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
public class File2 {
	public static void main(String[] args) throws FileNotFoundException, IOException{
		String path1 = "D:\\FileHandling\\Input1.txt";
		String path2 = "D:\\FileHandling\\Output1.txt";
		FileReader fr = new FileReader(path1);
		int temp;
		FileWriter fw = new FileWriter(path2);
		while((temp = fr.read())!=-1) {
			fw.write(temp);
		}
		fw.close();
		fr.close();
		System.out.println("File Loaded");
	}

}
