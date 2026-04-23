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
        students.setRollNo(104);
        students.setSid(4);
        students.setSname("Meet");


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
//


//        // to fetch
//        Students s2 = null;
//        Configuration conf = new Configuration();
//        conf.addAnnotatedClass(Students.class);
//        conf.configure();
//        SessionFactory sf = conf.buildSessionFactory();
//        Session session =  sf.openSession();
//
//
//        s2=session.get(Students.class,23);
//        System.out.println(s2);
//
//        session.close();


        //toUpdate
//        Configuration configuration = new Configuration();
//        configuration.addAnnotatedClass(Students.class);
//        configuration.configure();//for xml file
//        SessionFactory sessionFactory = configuration.buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
//        session.merge(students); MErge dono kam krta hai if data nhi hai toh insert krega if hai toh update
//        transaction.commit();
//        session.close();

//          to remove
//          Configuration conf =new Configuration();
//        conf.addAnnotatedClass(Students.class);
//        conf.configure();
//        SessionFactory ses=conf.buildSessionFactory();
//        Session session =ses.openSession();
//        Transaction tx=session.beginTransaction();
//        session.remove(students);
//
//        tx.commit();
//        session.close();





    }}
