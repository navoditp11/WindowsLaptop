import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.gl.entity.Employee;

public class DiverAppDemo {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		System.out.println(factory);
		Session session1 = factory.openSession(); //will help us with methods to perform the db CRUD operation
		
		Transaction tx = session1.beginTransaction();
		System.out.println(factory.isOpen());
		
		Employee e1 = new Employee();
		e1.setEno(102);
		e1.setEname("Navo");
		e1.setSal(3000);
		session1.save(e1);
		
		Employee e2 = new Employee();
		e2.setEno(104);
		e2.setEname("Rutu");
		e2.setSal(5000);
		session1.save(e2);
		
		Employee e3 = new Employee();
		e3.setEno(105);
		e3.setEname("Anju");
		e3.setSal(6000);
		session1.save(e3);
		
		tx.commit();
		
		session1.close();
		factory.close();

	}

}

