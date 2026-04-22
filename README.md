to create configration object //Configuration conf = new Configuration();
then once we got configruation obj then we will use it to build a sessionFactory//SessionFactory sf = conf.buildSessionFactory();
then using it we can create mutiple session so weill cretae one//Session session =  sf.openSession();
then for configuration //conf.configure();
conf.addAnnotatedClass(Students.class);
Transaction tx = session.beginTransaction();
session.save(students);
tx.commit();
session.close();


1. SessionFactory banao (one-time)
2. Session open karo
3. Transaction start karo
4. Operation karo (save/get/update/delete)
5. Commit karo
6. Session close karo