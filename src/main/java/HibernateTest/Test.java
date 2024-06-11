package HibernateTest;

import org.Models.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.utility.HibernateUtil;


public class Test {
    public static void main(String[] args) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
//        Names pn =  new Names("Prince", "Louis", "Junior");
        Names cn = new Names("Michael", "Bob", "Arnaud");
//        Player p1 = new Player(pn, 2005, "prince@example.com", "timberwolves");
//        HeadCoach c1 = new HeadCoach(200000);
//        c1.setNames(cn);
//        c1.setTeam("clippers");
//        c1.setSalary(3000000);
//        Ball b1 = new Ball("molten", 29);
//        b1.setCoach(c1);
//        p1.setBall(b1);
//
//        session.persist(c1);
//        session.persist(b1);
//        session.persist(p1);
        Coach c1 = session.get(Coach.class, 1);
        c1.setNames(cn);
        session.merge(c1);

        tx.commit();
        session.close();
    }
}
/*
* creating a new student/teacher
* Student s1 = new Student(3, "Boffaine", "Luka");
* Teacher t1 = new Teacher(1, "Agreste", "Gabriel");
* session.persist(s1/t1);
*
* update student
* Student s2;
* s2 = session.get(Student.class, 3);
* s2.setFirstname("Alya");
* session.merge(s2);
*
* retrieve all students
* System.out.println("Students:");
        for (Student student : session.createQuery("from Student", Student.class).list()) {
            System.out.println("Student: " + student.getId() + ", " + student.getFirstname() + " " + student.getLastname());
        }

* deleting a user
* Student s2 = session.get(Student.class, 3);
  if (s2 != null) {
        session.delete(s2);
        System.out.println("Student deleted successfully.");
  } else {
        System.out.println("Student not found with ID: " + 3);
  }
 */