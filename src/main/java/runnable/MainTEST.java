package runnable;

import models.Salaries;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Optional;

public class MainTEST {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();

        Salaries salaries = new Salaries();
        salaries.setEmpName("Rahul");
        salaries.setBasic(10000);
        salaries.setConveyance(3000);
        salaries.setHra(7000);
        session.save(salaries);

        session.save(salaries);
        session.getTransaction().commit();
        session.beginTransaction();

        Salaries d=  (Salaries)session.get(Salaries.class, 0L);
        System.out.println(d);

        session.getTransaction().commit();
        session.close();
    }

}
