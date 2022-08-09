package HashTables;
import java.util.Scanner;

import Functions.Functions;

public class Test {
		  
	    public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter size of hash table");
	  
	 
	        Functions table
	            = new Functions(sc.nextInt());
	        boolean exit = false;
	  
	       
	        while (!exit) {
	            System.out.println("Operations");
	            System.out.println("1. Insert ");
	            System.out.println("2. Remove");
	            System.out.println("3. Print");
	            System.out.println("4. Get");
	            System.out.println("5. Clear");
	            System.out.println("6. Size");
	            System.out.println("Enter your choice");
	  
	            int choice = (int) sc.nextInt();
	            switch (choice) {
	            
	            case 1:
	            	System.out.println("Enter key &value");
	                String key = sc.next();
	                int value = (int) sc.nextInt();
	                table.insert(key, value);
	                System.out.println("Inserted successfully");	                
	                break;
	  
	            case 2:
	                System.out.println("Enter key");
	                String key2 = sc.next();
	                table.remove(key2);
	                System.out.println("Removed Successfully");
	                break;
	  
	            case 3:
	                System.out.println( "Key-value pairs are");
	                table.printHashTable();
	                break;
	  
	            case 4:
	                System.out.println("Enter key");
	                String key3 = sc.next();
	                System.out.println("Key = " + key3+ " Value = " + table.get(key3));
	                break;
	  
	            case 5:
	                table.makeEmpty();
	                System.out.println("Cleared Successfully");
	                break;
	  
	            case 6:
	                System.out.println("Size of the table is = "+ table.getSize());
	                break;
	  
	            default:
	                exit = true;
	                System.out.println("Exited");
	            }
	        }
	        sc.close();
	    }
	}
