package lab6;

import java.util.*;
import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;

public class ques3 {

	public static void main(String[] args)throws IOException {
	File fi=new File("./copy.txt");
	System.out.println(fi.createNewFile());
	FileInputStream	fin=new FileInputStream(fi);
	Scanner s=new Scanner(fi);
	String str="";
	while(s.hasNext()) {
		str+=s.next()+" ";
	}
	System.out.println(str);
	
	
    fin.close();
    s.close();
	}
}

