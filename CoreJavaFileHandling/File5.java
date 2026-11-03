package Com.globalQuest.CoreJavaFileHandling;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
public class File5 {
	public static void main(String[] args) throws FileNotFoundException, IOException{
		String path1 = "D:\\FileHandling\\kl.jpg";
		String path2 = "D:\\FileHandling\\kl-dup1-jpg";
		FileInputStream fis = new FileInputStream(path1);
		int temp;
		FileOutputStream fos = new FileOutputStream(path2);
		byte[] bt = new byte[4096];
		while((temp = fis.read())!=-1) {
			fos.write(bt,0,temp);
			fos.write(temp);
		}
		System.err.println("File Loaded");
		fos.close();
		fis.close();
	}
}
