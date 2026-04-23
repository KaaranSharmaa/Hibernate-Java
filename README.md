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

**************************************************************************************************
<property name="hibernate.show_sql">true</property> // to show sql querry
<property name="hibernate.hbm2ddl.auto">update</property>//to create the table if not there
**************************************************************************************************
to fetch the data
// Step 1: Hibernate configuration object create karo
// → Ye hibernate.cfg.xml file ko load karega (DB config, mapping, etc.)
Configuration conf = new Configuration();


// Step 2: Entity class register karo
// → Hibernate ko batate hain ki "Students" class DB se mapped hai
conf.addAnnotatedClass(Students.class);


// Step 3: Configuration load karo
conf.configure();


// Step 4: SessionFactory create karo
// → DB connection factory (heavy object, ideally ek hi baar banta hai)
SessionFactory sf = conf.buildSessionFactory();


// Step 5: Session open karo
// → DB ke saath interaction ke liye use hota hai
Session session = sf.openSession();


// Step 6: Data fetch karo (no transaction)
// → Primary key (23) ke basis pe record fetch karega
// → Agar record nahi mila toh null return karega
Students s2 = session.get(Students.class, 23);


// Step 7: Result print karo
// → toString() override nahi hai toh object reference print hoga
System.out.println(s2);


// Step 8: Session close karo
// → Resources free karne ke liye important
session.close();

Config → Register Class → Build Factory → Open Session →  Do Work  → Close
**************************************************************************************************
to insert
// Step 1: Hibernate configuration object create karo
// → Ye hibernate.cfg.xml file ko read karega (DB settings, mappings, etc.)
Configuration conf = new Configuration();


// Step 2: Entity class register karo
// → Hibernate ko batate hain ki "Students" class DB table se mapped hai
conf.addAnnotatedClass(Students.class);


// Step 3: Configuration load karo
// → hibernate.cfg.xml ko apply karta hai
conf.configure();


// Step 4: SessionFactory create karo (HEAVY object)
// → DB ke liye connection factory
// → Isko ideally ek hi baar create karna chahiye (singleton)
SessionFactory sf = conf.buildSessionFactory();


// Step 5: Session open karo
// → DB ke saath actual interaction yahin se hota hai
Session session = sf.openSession();


// Step 6: Transaction start karo
// → Insert/update/delete ke liye mandatory hota hai
Transaction tx = session.beginTransaction();


// Step 7: Object ko database me save karo
// → "students" object ko DB table me insert karega
// → Hibernate internally INSERT query banata hai
session.persist(students);


// Step 8: Transaction commit karo
// → Data permanently DB me save ho jayega
tx.commit();


// Step 9: Session close karo
// → Resources free karne ke liye important
session.close();

Config → Register Class → Build Factory → Open Session → Start Tx → Save → Commit → Close
**************************************************************************************************
to update
// Step 1: Hibernate configuration object create karo
// → Ye hibernate.cfg.xml (DB config + mapping) ko load karega
Configuration configuration = new Configuration();


// Step 2: Entity class register karo
// → Hibernate ko batate hain ki Students class DB table se mapped hai
configuration.addAnnotatedClass(Students.class);


// Step 3: Configuration load karo (XML file)
configuration.configure();


// Step 4: SessionFactory create karo (HEAVY object)
// → DB connection factory (ideally ek hi baar banana chahiye)
SessionFactory sessionFactory = configuration.buildSessionFactory();


// Step 5: Session open karo
// → DB ke saath interaction ke liye use hota hai
Session session = sessionFactory.openSession();


// Step 6: Transaction start karo
// → Update operation ke liye mandatory hai
Transaction transaction = session.beginTransaction();


// Step 7: merge() use karke update karo
// → Agar record exist karta hai → UPDATE hoga
// → Agar exist nahi karta → INSERT bhi ho sakta hai
session.merge(students);


// Step 8: Transaction commit karo
// → Changes DB me permanently save ho jayenge
transaction.commit();


// Step 9: Session close karo
// → Resources free karne ke liye important
session.close();
persist → only insert
merge   → insert + update
MErge dono kam krta hai if data nhi hai toh insert krega if hai toh update
**************************************************************************************************
To reomove it ek bat ki remove bs object pr hi kam krega!

// Step 1: Hibernate configuration object create karo
// → hibernate.cfg.xml load karega (DB config + mapping)
Configuration conf = new Configuration();


// Step 2: Entity class register karo
// → Hibernate ko batate hain ki Students class DB table se mapped hai
conf.addAnnotatedClass(Students.class);


// Step 3: Configuration load karo
conf.configure();


// Step 4: SessionFactory create karo (HEAVY object)
// → DB connection factory (ideally ek hi baar banana chahiye)
SessionFactory ses = conf.buildSessionFactory();


// Step 5: Session open karo
// → DB ke saath interaction ke liye use hota hai
Session session = ses.openSession();


// Step 6: Transaction start karo
// → Delete operation ke liye mandatory hai
Transaction tx = session.beginTransaction();


// Step 7: Object delete karo
// → Hibernate internally DELETE query run karega
session.remove(students);


// Step 8: Transaction commit karo
// → Delete permanently DB me apply ho jayega
tx.commit();


// Step 9: Session close karo
// → Resources free karne ke liye important
session.close();


persist → insert
get     → fetch
merge   → update
remove  → delete
**********************************************************************************************************