package OneToOne;

	import org.hibernate.*;  
	import org.hibernate.boot.Metadata;  
	import org.hibernate.boot.MetadataSources;  
	import org.hibernate.boot.registry.StandardServiceRegistry;  
	import org.hibernate.boot.registry.StandardServiceRegistryBuilder;  
	public class StoreData {
	 public static void main(String[] args) {
	  StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
	     Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
	     SessionFactory factory=meta.getSessionFactoryBuilder().build();  
	     Session session=factory.openSession();  
	     Transaction t=session.beginTransaction();   
     Emp e1=new Emp(); 
	     Addr addr1 = new Addr("PNT colony", "AndhraPradesh", "AP", "520010");
	  Addr addr2 = new Addr("MG Road", "AndhraPradesh", "AnP", "520015");
	  Emp emp1 = new Emp("Poornima", addr1);
	  Emp emp2 = new Emp("jaya", addr2);
	  session.save(emp1);
	  session.save(emp2);
	  t.commit();
	     session.close();    
     System.out.println("success");    
	 }
	}
