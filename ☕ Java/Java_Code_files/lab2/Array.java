package lab2;

import java.util.Scanner;

public class Array {
	public static void main() {
		Scanner sc=new Scanner(System.in);
		//frequency of chararcters
		
		int freq[]=new int[256];
		String str="anjali nagalingam";
		char[] ch=str.toCharArray();
		for(int i=0;i<str.length();i++){
			freq[i]=1;
			for(int j=i+1;j<str.length();j++) {
				if(ch[i]==ch[j]) {
					freq[i]++;
					ch[j]=0;
				}
			}
		}
		
		//printing
		for(int i=0;i<freq.length;i++) {
			if(ch[i]!=' ' && ch[i]!='\0') {
				System.out.println(ch[i]+"---"+freq[i]);
			}
		}
		
		//remove all characters except characters
		/*
		System.out.println("enter a string");
		String s=new String();
		
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<sb.length();i++) {
			char c=s.charAt(i);
			if(Character.isLetter(c)) {
				sb.append(c);
			}
		}
		System.out.println("the new string is "+sb.toString());
		*/
		
		//6;
		/*String mail="n210697rguktn.ac.in";
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<mail.length();i++) {
			char ch=mail.charAt(i);
			if(Character.isLetter(ch)) {
				sb.append(ch);	
			}
		}
		System.out.println("New String is "+sb.toString());
		System.out.println("Count of Characters : "+sb.length());
		*/
		
		
		//7
		
		/*
		String mail="n210697rguktn.ac.in";
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<mail.length();i++) {
			char ch=mail.charAt(i);
			if(Character.isLetter(ch)) {
				continue;
			}
			else if(Character.isDigit(ch)) {
				continue;
			}
			else {
				sb.append(ch);
			}
		}
		System.out.println("New String is "+sb.toString());
		System.out.println("Count of Characters : "+sb.length());
		*/
		
		//reverse a string
		/*
		System.out.println("enter a string");
		String string=sc.next();
		
		StringBuilder sb=new StringBuilder(string);
		sb=sb.reverse();
		System.out.println("The reverse of the String is "+sb.toString());
         */
		
		
		
		
		
		
		
		
		
		
		
		
	}	
}