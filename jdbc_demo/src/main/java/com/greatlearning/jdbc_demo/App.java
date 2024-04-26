package com.greatlearning.jdbc_demo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	BookDAO bookDao = new BookDAO();
    	try{
    		//Creating connection
    		Connection conn = 
    				DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop","root","A9178784058a@");
    	    
    		//Access a statement
    		Statement stmt = conn.createStatement();
    		
    		int input;
    		do {
    			System.out.println("Book DAO");
    			System.out.println("1. Display");
    			System.out.println("2. Insert");
    			System.out.println("3. Delete");
    			System.out.println("4. Modify");
    			Scanner menuData = new Scanner(System.in);
    			input = menuData.nextInt();
    			switch (input) {
    			case 1:
    				bookDao.getAllBooks(stmt);
    				break;
    				
    			case 2:
    				bookDao.saveData(conn);
    				break;
    				
    			case 3:
    				bookDao.deleteBook(stmt);
    				break;
    				
    			case 4:
    				bookDao.updateBook(stmt);
    				break;
    				
    			default:
    				break;
    			
    			}
    		}while(input>0);
    	} catch(Exception ex){
    		ex.printStackTrace();
    	}
    }
}
