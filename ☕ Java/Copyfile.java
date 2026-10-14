package streamdemo;
import java.io.*;

public class Copyfile {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		FileInputStream fin=null;
		FileOutputStream fout=null;
		try {
			fin=new FileInputStream("test.txt");
			fout= new FileOutputStream("output.txt");
			int c;
	         while ((c = fin.read()) != -1) {
	            fout.write(c);
	         }
	         System.out.println("successfully completed");
	      }finally
		{
	         if (fin != null) {
	            fin.close();
	                }
	         if (fout != null) {
	            fout.close();
					}
	      }
	}
}
	
