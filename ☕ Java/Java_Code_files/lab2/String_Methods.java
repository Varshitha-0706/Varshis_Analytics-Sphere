package lab2;

public class String_Methods {
	public static void main(String[] args) {
		String s1="varshi";
		String s2="varshi";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		String str="Molabantivarshitha";
		String str1="Molabantivarshitha";
		System.out.println("character at index 5 is "+ str.charAt(5));
		System.out.println("Concatination of the string is "+ str.concat("harinadh"));
		System.out.println(str);
		System.out.println("Is String varshi contains in str---"+ str.contains("varshi"));
		System.out.println("Is String ends with varshi---"+str.endsWith(" "));
		System.out.println("Is string starts with Molabanti---"+str.startsWith("Molabanti"));
		System.out.println("Is str==str1 "+str==str1);
		System.out.println("Is str==str1(using equals)"+ str.equals(str1));
		System.out.println("Is str==str1(using ignore case)"+ str.equalsIgnoreCase(str1));
		
		
		
		char c[]=new char[10];
		str.getChars(0, 6, c, 2);
		for(int i=0;i<c.length;i++) {
			System.out.println("Index-"+i+":"+c[i]);
		}
		
		System.out.println("the hash code of the string is "+str.hashCode());
		System.out.println("Index of a is "+str.indexOf('a'));
		System.out.println("Is string empty "+str.isEmpty());
		System.out.println("The last index of a is "+str.lastIndexOf('a'));
		System.out.println("the length of the string is "+str.length());
	//	System.out.println("Region matches "+str.regionMatches(0, str1, 5, 5));
		System.out.println("the replaced string is "+str.replace('a','A'));
		
		String s="anjali@nagalingam@kataru";
		String[] arr=s.split("@",2);
		for(String t : arr){
			System.out.println(t);
		}
		
		System.out.println("the substring of the string is "+str.substring(0,6));
		System.out.println("String to new character array "+str.toCharArray());
		System.out.println("lower case of str is "+str.toLowerCase());
		System.out.println("upper case of str is "+str.toUpperCase());
		System.out.println("the string object is "+str.toString());
		System.out.println("string representation of specified value is "+str.valueOf(5));
		
		String str2="     anjali     ";
		System.out.println("before trimming, the string is "+str2);
		System.out.println("after trimming, the string is "+str2.trim());
		
		
		
		
		
		
		
		
	}
	

	

}
