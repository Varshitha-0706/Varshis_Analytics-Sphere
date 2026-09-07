//package files;
import java.io.File;
public class fileopen {
	public static void main(String args[]){
		
		File f=new File("File.java");
		try {
	System.out.println("File exist:"+f.exists());
	System.out.println("New File created:"+f.createNewFile());
	System.out.println("File exists:"+f.exists());
	System.out.println(" New File created:"+f.createNewFile());
}
		catch(Exception e)
		{
			System.out.println("No problem");
		}
}
}
