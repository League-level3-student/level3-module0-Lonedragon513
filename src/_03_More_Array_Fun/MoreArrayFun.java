package _03_More_Array_Fun;

import java.sql.Array;
import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] str = new String[10];
		for (int i = 0; i < str.length; i++) {
			String s = ""+i;
			str[i]=s;
		}
		MoreArrayFun MAF = new MoreArrayFun();
		//MAF.a_method_that_takes_an_array_of_Strings_and_prints_all_the_Strings_in_the_array(str);
		//MAF.a_method_that_takes_an_array_of_Strings_and_prints_all_the_Strings_in_the_array_in_reverse_order(str);
		//MAF.a_method_that_takes_an_array_of_Strings_and_prints_every_other_String_in_the_array(str);
		MAF.a_method_that_takes_an_array_of_Strings_and_prints_all_the_Strings_in_the_array_in_a_completely_random_order(str);

		
	}
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	void a_method_that_takes_an_array_of_Strings_and_prints_all_the_Strings_in_the_array(String[] arrya) {
		for (int s = 0; s < arrya.length; s++) {
			System.out.println(arrya[s]);
		}
	}
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	void a_method_that_takes_an_array_of_Strings_and_prints_all_the_Strings_in_the_array_in_reverse_order(String[] arrya) {
		for (int s = arrya.length-1; s >-1 ; s--) {
			System.out.println(arrya[s]);
		}
	}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	void a_method_that_takes_an_array_of_Strings_and_prints_every_other_String_in_the_array (String[] arrya) {
		for (int s = 0; s < arrya.length; s+=2) {
			System.out.println(arrya[s]);
		}
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	void a_method_that_takes_an_array_of_Strings_and_prints_all_the_Strings_in_the_array_in_a_completely_random_order(String[] arrya) {
		Random r = new Random();
		Boolean[] k = new Boolean[arrya.length-1];
		for (int i = 0; i < k.length; i++) {
			k[i]=true;
		}
		boolean b=false;
		while (b==false) {
			int rr = r.nextInt(arrya.length-1);
			if(k[rr]) {
			System.out.println(arrya[rr]);
			k[rr]=false;b=true;
		}
			for (int i = 0; i < k.length; i++) {
				if(k[i]) {
				b=false;	
				}
			}	
		}
	}
	
}
