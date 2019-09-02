package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		//String[] names = {"Carrie","Brownstein"
		
		//String[] first_names = new String[num_ppl];
		//String first_names = "";
		//names[0] = "" 
		//first_names[0] = scan.next();
		
		//String last_names = "";
		//String[] last_names = new String[num_ppl];
		//last_names[0] = scan.next();
		// can also create a for loop as a shorter way to create
		//arrays for first and last names
		
		//int num_item = scan.nextInt();
		//int[] items = new int[num_item];
		
		//we don;t need the name of the item in the output so we can 
		//just write scan.next() to read the item but NOT STORE IT
		
		int num_ppl = scan.nextInt();
		double total_price;
		
		for(int i=0; i<num_ppl; i++){
			String first_names = scan.next(); 
			String last_names = scan.next();
			int num_item = scan.nextInt();
			total_price = 0.0;
			for(int a = 0; a<num_item; a++) {
				int num_product = scan.nextInt();
				scan.next();
				double unit_price = scan.nextDouble();
				total_price += num_product*unit_price;
		
			}
			System.out.println(first_names.substring(0,1)+". "+ last_names+": " + String.format("%.2f", total_price));
			
		}
		//calculating the total price outside of the for loop would be
		//more complicated 
	scan.close();	
	}
}
