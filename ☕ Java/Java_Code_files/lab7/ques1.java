package lab6;
import java.io.File;
import java.io.FileInputStream; 
import java.io.IOException; 


public class ques1 {

	public static void main(String[] args)throws IOException {
File f=new File("./lab.txt");
System.out.println(f.createNewFile());
FileInputStream fout=new FileInputStream(f);
int i,vowels=0,con=0,others=0;
while((i=fout.read())!=-1) {
	if(i==65||i==(65+32)||i==69||i==69+32||i==73||i==73+32||i==79||i==79+32||i==85||i==85+32) {
         vowels++;
	}else if(i>=65&&i<=90 || i>=97&&i<=122){
	     con++;
	}else {
	    	 others++;
	     }
	  }

System.out.println(vowels+" "+con+" "+others);
}
}