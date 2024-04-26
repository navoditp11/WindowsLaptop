package com.greatlearning.jdbc_T;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        Savepoint savepoint1 = null;
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop","root","A9178784058a@");
        try {
        	Statement stmt = conn.createStatement();
        	conn.setAutoCommit(false);
        	savepoint1 = conn.setSavepoint("Savepoint1");
        	System.out.println("Save point 1");
        	String sql = "INSERT into books (id,title,author) values (3001,'The Earth','john')";
        	stmt.executeUpdate(sql);
        	savepoint1 = conn.setSavepoint("Savepoint2");
        	System.out.println("Save point 2");
        	sql = "INSERTED into books (id,title,author) values (3002,'The Earth','john')";
        	stmt.executeUpdate(sql);
        	
        	conn.commit();
        }catch(Exception e) {
        	System.out.println("Roll back");
        	conn.rollback(savepoint1);
        	//e.printStackTrace();
        }
    }
}
