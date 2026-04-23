package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Students students = new Students();
        students.setRollNo(12);
        students.setSid(23);
        students.setSname("Ravi");
        // for insertion
//        Configuration conf = new Configuration();
//        conf.addAnnotatedClass(Students.class);
//        conf.configure();
//        SessionFactory sf = conf.buildSessionFactory();
//        Session session =  sf.openSession();
//        Transaction tx = session.beginTransaction();
//        session.persist(students);
//        tx.commit();
//        session.close();

        // to fetch
        Students s2 = null;
        Configuration conf = new Configuration();
        conf.addAnnotatedClass(Students.class);
        conf.configure();
        SessionFactory sf = conf.buildSessionFactory();
        Session session =  sf.openSession();


        s2=session.get(Students.class,23);
        System.out.println(s2);

        session.close();


    }
}
