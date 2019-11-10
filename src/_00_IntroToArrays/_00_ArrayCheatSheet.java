package _00_IntroToArrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] st = new String[5];
		//2. print the third element in the array
		System.out.println(st[2]);
		//3. set the third element to a different value
		st[2]="hi";
		//4. print the third element again
		System.out.println(st[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for(int i = 0; i<5; i++) {
			st[i] = "hi"+i;
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i< st.length; i++) {
			System.out.println(st[i]);
		}
		//7. make an array of 50 integers
		int[] numbs = new int[49];
		//8. use a for loop to make every value of the integer array a random number
		Random m = new Random();
		for (int i = 0; i < numbs.length; i++) {
			int mm =m.nextInt(123456);
			numbs[i] = mm;
		}
		//9. without printing the entire array, print only the smallest number on the array
		int ii = 12345678;
		for (int j = 0; j < numbs.length; j++) {
			if(numbs[j]<ii) {
				 ii = numbs[j];
			}
		}
		System.out.println(ii);
		//10 print the entire array to see if step 8 was correct
		for(int i = 0; i< numbs.length; i++) {
			System.out.println(numbs[i]);
		}
		//11. print the largest number in the array.
		int iii = 0;
		for (int j = 0; j < numbs.length; j++) {
			if(numbs[j]>iii) {
				 iii = numbs[j];
			}
		}	System.out.println(iii);
		//12. print only the last element in the array
		System.out.println(numbs[numbs.length-1]);
	}
}
