package lab2;
import java.util.*;

public class Arrayreverse {
		public static void main(String[] args)
		{
			int i,n;
			int arr[];
			int arr1[];
			Scanner s=new Scanner(System.in);
			//String str="Hello I am varshitha";
			//String s=str.substring("varshi");
			System.out.print("Enter array length:");
			n=s.nextInt();
			arr=new int[n];
			arr1=new int[n];
			for(i=0;i<n;i++)
			{
				System.out.printf("arr["+i+"]=");
				arr[i]=s.nextInt();
			}
			/*for(i=0;i<arr.length;i++) {
				System.out.print("arr["+i+"]="+arr[i]);
				System.out.print("\n");
			}*/
			System.out.print("\n");
			int c=arr.length/2;
			/*for(i=0;i<c;i++) {
				arr[i]=arr[c-(i+1)];
				System.out.println("arr["+i+"]="+arr[i]);
			}*/
			for(i=0;i<arr.length/2;i++)
			{
				arr1[i]=arr[c-(i+1)];
			}
			for(i=0;i<c;i++) {
				arr[i]=arr1[i];
				System.out.println("arr["+i+"]="+arr[i]);
			}
			for(i=c;i<arr.length;i++) {
				System.out.println("arr["+i+"]="+arr[i]);
			}
		}

	}

