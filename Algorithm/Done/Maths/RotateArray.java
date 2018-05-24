package Done.Maths;



import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RotateArray {

	// Complete the circularArrayRotation function below.
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size : ");
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i =0; i<n ;i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter Rotations : ");
		int k = sc.nextInt();

		int[] a1 = new int[a.length];
		k = k%a.length;
		int k1=k;
		int i=0;
		System.out.println("K is : "+k);
		while(k1!=0) {
			a1[i] = a[a.length-k1];
			k1--;
			i++;
		}
		System.out.println("I is now : "+i);
		for(int j=0; j<a.length-k; j++) {
			a1[i] = a[j];
			i++;
		}
		
		System.out.println("------------------------------");
		for(int b =0; b<n ;b++) {
			System.out.println(a1[b]+"\n");
		}
sc.close();
	}


}
