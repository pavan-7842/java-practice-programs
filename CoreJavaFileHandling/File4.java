package Com.globalQuest.CoreJavaFileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File4 {
	public static void main(String[] args) throws FileNotFoundException, IOException{
		String path1 = "D:\\FileHandling\\Input3.txt";
		String path2 = "D:\\FileHandling\\Output3.txt";
		FileReader fr = new FileReader(path1);
		int temp;
		FileWriter fw = new FileWriter(path2);
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw);
		while((temp=br.read())!=-1){
			bw.write(temp);
		}
		bw.close();
		br.close();
		fw.close();
		fr.close();
		System.err.println("File Loaded");
	}

}
