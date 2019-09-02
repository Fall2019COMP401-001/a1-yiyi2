package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int num_items = scan.nextInt();
		
		String[] name_item = new String[num_items];
		double[] unit_price = new double[num_items];
		
		//because we need to use the items and unit prices in the second for loop and 
		// it needs to know which item comes first or etc -> and so, we need to 
		//STORE these values in two arrays (one for item names and one for unit prices)
		
		//scanning is just assigning values to it -> NOT THE SAME AS DECLARING IT 
		//DECLARING IT IS INITIALIZING IT and if you declare it within the for loop, it
		//can't be used in another for loop 
		//so make sure you declare it outside of the for loop and then scan it within 
		//a for loop (if needed)
		
		for(int i=0; i<num_items; i++){
			name_item[i] = scan.next();
			unit_price[i] = scan.nextDouble();
					
		}
		int num_ppl = scan.nextInt();
		
		String[] f_names = new String[num_ppl];
		String[] l_names = new String[num_ppl];
		
		double total_spent;
		double[] total = new double[num_ppl];
		//this is an array of the "total_spent" amounts of every customer 
		
		for(int a = 0; a<num_ppl; a++) {
			String first_names = scan.next();
			f_names[a] = first_names;
			String last_names = scan.next();
			l_names[a] = last_names;
			int num_item = scan.nextInt();
			//num_item is the number of types of items the customer has
			total_spent = 0.0;
			//starts at 0 b/c each customer spent a different amount of money
			for(int b = 0; b<num_item; b++) {
				int num_product = scan.nextInt();
				//num_product is the quantity of a particular item a customer bought
				String name_product = scan.next();
				for(int c = 0; c < num_items;  c++) {
					if(name_product.equals(name_item[c])) {
						total_spent += unit_price[c]*num_product; 
					}
				}
			total[a] = total_spent;
					}
				}
		double min = findValueMin(total);
		int min_indx = findIndxMin(total);
		double max = findValueMax(total);
		int max_indx = findIndxMax(total);
		double sum = calculateValueSum(total);
		double average = sum/num_ppl;
		
		//can't do == 
		//a-b < 0.000001 
		//min - i < 0.0001
		
		System.out.println("Biggest: " + f_names[max_indx] + " "+ l_names[max_indx] + "("+ String.format("%.2f", max) +")");	
		System.out.println("Smallest:  " + f_names[min_indx] + " " + l_names[min_indx] + "(" + String.format("%.2f", min) + ")");
		System.out.println("Average: " + String.format("%.2f", average));
		//System.out.println(total[2]);
	}
	
	static double findValueMin(double[] vals) {
		
		// Initialize current minimum to first value in array.
		double cur_min = vals[0];
		
		// Starting with second value (if any), compare each value
		// in array with current minimum and replace if smaller.
		
		for (int i=1; i < vals.length; i++) {
			if (vals[i] < cur_min) {
				cur_min = vals[i];
			}
		}
		
		return cur_min;
	}
	static int findIndxMin(double[] vals) {
		
		// Initialize current minimum to first value in array.
		double cur_min = vals[0];
		
		// Starting with second value (if any), compare each value
		// in array with current minimum and replace if smaller.
		int min_index = 0;
		for (int i=1; i < vals.length; i++) {
			if (vals[i] < cur_min) {
				cur_min = vals[i];
				min_index = i;
			}
			//return min_index;
		}
		return min_index;
		
		//return min_index;
	}
	static double findValueMax(double[] vals) {
			
		// Initialize current minimum to first value in array.
		double cur_max = vals[0];
			
		// Starting with second value (if any), compare each value
		// in array with current minimum and replace if smaller.
			
		for (int i=1; i < vals.length; i++) {
			if (vals[i] > cur_max) {
				cur_max = vals[i];
			}
		}
		return cur_max;
	}
	static int findIndxMax(double[] vals) {
		
		// Initialize current minimum to first value in array.
		double cur_max = vals[0];
			
		// Starting with second value (if any), compare each value
		// in array with current minimum and replace if smaller.
			
		int max_index = 0;
		
		for (int i=1; i < vals.length; i++) {
			if (vals[i] > cur_max) {
				cur_max = vals[i];
				max_index = i;
			}
		}
		return max_index;
	}
	static double calculateValueSum(double[] vals) {
		
		double sum = 0;
		
		for (int i=0; i<vals.length; i++) {
			sum += vals[i];
		}
		return sum;
	}
}