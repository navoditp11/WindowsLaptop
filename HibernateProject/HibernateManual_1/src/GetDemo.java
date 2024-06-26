import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.gl.entity.Employee;

public class GetDemo {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session session1 = factory.openSession();
		
		Employee e1 = (Employee)session1.get(Employee.class, 101); 
		System.out.println(e1);
		//will i see select query in the console? Yes
		
		Employee e2 = (Employee)session1.get(Employee.class, 101); 
		System.out.println(e2);
		//will the object be found in the cache? Yes
		//will it query the db? No
		//will i see select query in the console? Yes
		
		System.out.println(e1 == e2); //true
		
		Employee e3 = (Employee)session1.get(Employee.class, 109); 
		System.out.println(e3);
		
		session1.close();
		factory.close();

	}

}
