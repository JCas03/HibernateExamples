import DTO.UserDetails;
import DTO.Vehicle;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


public class HibernateTestDemo {

    public static void main(String[] args) {
        UserDetails user = new UserDetails(); //create an user entity


        Vehicle vehicle = new Vehicle(); //create a vehicle entity
        Vehicle vehicle2 = new Vehicle(); //create second vehicle entity

        vehicle.setVehicleName("BMW Car"); //set BMW car
        vehicle.setUser(user); //set user for that car

        vehicle2.setVehicleName("AUDI Car"); //set second car Audi
        vehicle2.setUser(user);//set user for that car

        user.setUserName("Dinesh Rajput"); //set user property

        UserDetails user2 = new UserDetails();

        Vehicle vehicle3 = new Vehicle();
        Vehicle vehicle4 = new Vehicle();
        Vehicle vehicle5 = new Vehicle();

        vehicle3.setVehicleName("Tesla M3"); //set BMW car
        vehicle3.setUser(user2); //set user for that car

        vehicle4.setVehicleName("Tesla MX"); //set second car Audi
        vehicle4.setUser(user2);//set user for that car

        vehicle5.setVehicleName("Tesla Roadster"); //set second car Audi
        vehicle5.setUser(user2);//set user for that car

        user2.setUserName("John Doe");

        Configuration configuration = new Configuration();
        configuration.configure();
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
                configuration.getProperties()).build();
        SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);

        Session session = sessionFactory.openSession(); //create the session object
        session.beginTransaction(); //create the transaction object
        session.save(vehicle);
        session.save(vehicle2);
        session.save(user);
        session.save(vehicle3);
        session.save(vehicle4);
        session.save(vehicle5);
        session.save(user2);
        session.getTransaction().commit();
        session.close();
    }
}