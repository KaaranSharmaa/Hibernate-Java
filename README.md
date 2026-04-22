to create configration object //Configuration conf = new Configuration();
then once we got configruation obj then we will use it to build a sessionFactory//SessionFactory sf = conf.buildSessionFactory();
then using it we can create mutiple session so weill cretae one//Session session =  sf.openSession();
then for configuration //conf.configure();
conf.addAnnotatedClass(Students.class);