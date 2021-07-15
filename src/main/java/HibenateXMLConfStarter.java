
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import java.util.Arrays;
import java.util.HashSet;

public class HibenateXMLConfStarter {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cnf.xml");

        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();

        SessionFactory factory = configuration.buildSessionFactory(serviceRegistry);

        Session session = factory.openSession();

        Transaction transaction = session.beginTransaction();

        Cart cart = new Cart("15", "Andrey");

        Item item = new Item("zero");
        Item item1 = new Item("one");
        Item item2 = new Item("two");
        Item item3 = new Item("tree");

        cart.setItems(new HashSet<Item>(Arrays.asList(item,item2,item1,item3)));
        System.out.println(cart);
        session.persist(cart);

        transaction.commit();

        session.close();

    }
}
