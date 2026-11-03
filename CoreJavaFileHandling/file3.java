package Com.globalQuest.CoreJavaFileHandling;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class file3 {
	public static void main(String[] args) throws FileNotFoundException, IOException{
		String path1 = "D:\\FileHandling\\Input2.txt";
		String path2 = "D:\\FileHandling\\Output2.txt";
		FileInputStream fis = new FileInputStream(path1);
		int temp;
		FileOutputStream fos = new FileOutputStream(path2);
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		while((temp=bis.read())!=-1) {
			bos.write(temp);
		}
		System.err.println("File Loaded");
		bos.close();
		bis.close();
		fos.close();
		fis.close();
		
		}
}
