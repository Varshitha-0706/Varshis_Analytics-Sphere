package lab6;
import java.util.*;
import java.io.IOException;
import java.io.File;
import java.io.FileOutputStream;
public class ques5{
	public static void main(String[] args)throws IOException {
		File fi=new File("./copyxyz.txt");
		System.out.println(fi.createNewFile());
		FileOutputStream fos=new FileOutputStream(fi);
		String s="hello world ";
for (char c:s.toCharArray()) {
	fos.write((int)c);
}
fos.write(87);

		fos.flush();
		fos.close();
	}

}
//import java.util.*;
//import java.io.IOException;
//import java.io.File;
//import java.io.FileWriter;
//import java.io.FileInputStream;

//public class ques5 {
//
//	public static void main(String[] args)throws IOException {
//		File fi=new File("./append.txt");
//		System.out.println(fi.createNewFile());
//		Scanner sc=new Scanner(fi);
//		String str=new String();
//		while(sc.hasNext()) {
//			str+=sc.next()+" ";
//		}
//		String balu=str.toString();
//
//		
//		FileWriter fos=new FileWriter(fi);
//		StringTokenizer s=new StringTokenizer("hello");
//	while(s.hasMoreTokens()) {
//		balu+=s.nextToken()+" ";
//	}
//    fos.write(balu);
//
//		fos.close();
//		FileInputStream fis=new FileInputStream(fi);
//		int i;
//		while((i=fis.read())!=-1) {
//			System.out.print((char)i);
//		}
//		
//
//		fis.close();
//
//	}

//}
