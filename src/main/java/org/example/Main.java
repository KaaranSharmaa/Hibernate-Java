package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main() {
        Students students = new Students();
        students.setRollNo(12);
        students.setSid(23);
        students.setSname("Karansharma");
        Configuration conf = new Configuration();
        conf.addAnnotatedClass(Students.class);
        conf.configure();
        SessionFactory sf = conf.buildSessionFactory();
        Session session =  sf.openSession();


    }
}
