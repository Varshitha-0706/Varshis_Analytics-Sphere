package lab2;
import java.util.*;
public class Capitalise {
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			//String str="varshi";
			/*char[] a=str.toCharArray();
			for(int i=0;i<a.length;i++)
			{
				a[0]=Character.toUpperCase(a[0]);
			}
			str=String.valueOf(a);
			System.out.println("string:"+str);*/
			//CAPITALISING FIRST LETTER (having one word)
			/*String firstletter=str.substring(0,1);
			firstletter=firstletter.toUpperCase();
			String remainingletters=str.substring(1);
			String word=firstletter+remainingletters;
			System.out.println("Capitalisedword:"+word);
			
			//CAPITALISING FIRST LETTER(having multiple words)
			int i;
			String str1=" hello i am a java program.";
			String[] word=str1.split(" ");
			String capital="";
			for(i=0;i<word.length;i++)
				//for(String word:words)
			{
				String s=word[i].substring(0,1);
				//s=s.toUpperCase();
				String p=word[i].substring(1);
				//words[i]=s+p;
				capital+=s.toUpperCase()+p;
			}
			//String result=String.join(" ",words);
			System.out.println("Capitalized string"+capital);
			//System.out.println("Capitalisedstring is:\n"+result);*/
			System.out.println("Enter string");
			String str=sc.nextLine();
			String[] words=str.split(" ");
			for(int i=0;i<words.length;i++)
			{
				System.out.println(words[i]);
			}
			String capital=" ";
			for(String x:words) {
				String first=x.substring(0,1);
				String afterfirst=x.substring(1);
				capital+=first.toUpperCase()+afterfirst.toUpperCase()+" ";
				
			}
			System.out.println("capitalized word"+capital);
			
			
 		}

	}
