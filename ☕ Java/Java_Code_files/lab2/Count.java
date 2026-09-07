package lab2;
//import java.util.*;
//import java.util.StringTokenizer;

public class Count {
		public static void main(String[] args)
		{
			int i;
			int vowels=0,cons=0,space=0,words=1,sp=0,nums=0;
			String str="I $#Am && 123vAR sH@i 711tha";
			System.out.println(str);
		   // Count  ss=new Count();
			//Scanner st=new Scanner(System.in);
			//System.out.println("Enter a string:");
			//String s=st.nextLine();
			char[] a=str.toCharArray();
			for(i=0;i<a.length;i++)
			{
				if(a[i]=='a'||a[i]=='e'|| a[i]=='i'||a[i]=='o'||a[i]=='u'||a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U')
						{ 
					vowels++;
						}
				else if(a[i]==' ') {
					words++;
					space++;
				}
				else if(a[i]>='0' && a[i]<='9') {
					nums++;
				}
				else if(a[i]>='a' && a[i]<='z' || a[i]>='A' && a[i]<='Z') {
					cons++;
				}
				 //else if(think of string tokenizer)
				else {
					sp++;
				}
			}
			System.out.println("No.of vowels in the string:"+vowels);
			System.out.println("No.of consonants in the string:"+cons);
			System.out.println("No.of numbers in the string:"+nums);
			System.out.println("No.of words in the string:"+words);
			System.out.println("No.of spaces in the string:"+space);
			System.out.println("No.of special characters in the string:"+sp);
		}
	}
