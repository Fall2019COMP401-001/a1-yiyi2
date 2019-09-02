package a1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int num_items = scan.nextInt();
		//num_items is the number of all the different kinds of items 
		
		String[] name_item = new String[num_items];
		double[] unit_price = new double[num_items];
		
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
		
		//int[] num_product = new int[num_items];
		int[] total_item = new int[num_items];
		int[] total_customers = new int[num_items];
		
		
		for(int a = 0; a<num_ppl; a++) {
		//	boolean flag = false;
			String first_names = scan.next();
			f_names[a] = first_names;
			String last_names = scan.next();
			l_names[a] = last_names;
			int num_item = scan.nextInt();
			//num_item is the number of types of items the customer has
			total_spent = 0.0;
			List<String> names_product = new ArrayList<String>();
			//starts at 0 b/c each customer spent a different amount of money
			for(int b = 0; b<num_item; b++) {
				int num_product = scan.nextInt();
				//int num_product = scan.nextInt();
				//num_product is the quantity of a particular item a customer bought
				String name_product = scan.next();
				
				boolean flag = false;
				
				if(!names_product.contains(name_product)) {
					names_product.add(name_product);
					flag = true;
				}
				
				for(int c = 0; c < num_items;  c++) {
					if(name_product.equals(name_item[c])) {
						total_spent += unit_price[c]*num_product; 
						total_item[c] += num_product;
//						for(int d = 0; d< total_item.length; d++) {
//							if(t.equals(name_item[d])) {
//								total_customers[c] = total_customers[d];
//							}
//						}
						
						if(flag) {
							total_customers[c] += 1;
						}
						
					}
					
				}
				
			total[a] = total_spent;
			}
		}
		for(int i = 0; i<num_items; i++) {
			if(total_customers[i] == 0) {
				System.out.println("No customers bought " + name_item[i]);
			}
			else {
				System.out.println(total_customers[i] + " customers bought " + total_item[i] + " " + name_item[i]);
			}
			
		}
		
		//int num_customers = 0;
		//int total_item = 0; 
		
		//for(int i = 0; i<num_items; i++) {
			//for(int a = 0; a<num_ppl; a++) {
				//if num_ppl[a] 
			//}
			//for(int b = 0; b<num_item; b++)
				//num_product 
			//if(num_customers = 0) {
				//System.out.println("No customers bought " + name_item[i]);
				//}
			//if(num_customers > 0) {
				//System.out.println(num_customers + " customers bought " + total_item);
				//}
		//}
		//else if
			
	} 
}
