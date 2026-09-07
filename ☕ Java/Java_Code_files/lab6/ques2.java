package lab6;
import java.util.*;
import java.io.*;



public class ques2 {

	public static void main(String[] args)throws IOException {
File f=new File("./lord.doc");
System.out.println(f.createNewFile());
//FileInputStream fout=new FileInputStream(f);
Scanner s=new Scanner(f);
int word=0,sen=0;
while(s.hasNext()) {
	word++;
	s.next();
}
while(s.hasNextLine()) {
	sen++;
	s.nextLine();
}
System.out.println(word);
System.out.println(sen);


s.close();








}

}

