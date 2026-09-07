package lab6;
import java.util.*;
import java.io.IOException;
import java.io.File;
import java.io.FileOutputStream;
public class ques4 {

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
