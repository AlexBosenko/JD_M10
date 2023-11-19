package org.example;

import org.example.entity.Client;
import org.example.entity.Planet;
import org.example.hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        HibernateUtil util = HibernateUtil.getInstance();

        Session session = util.getSessionFactory().openSession();

//        List<Client> clients = session.createQuery("from Client", Client.class).list();
//        System.out.println("clients = " + clients);

//        Transaction transaction = session.beginTransaction();
//            Client newClient = new Client();
//            newClient.setName("John Wick");
//            session.persist(newClient);
//        transaction.commit();
        Transaction transaction = session.beginTransaction();
            Planet newPlanet = new Planet();
            newPlanet.setName("Mercury");
            session.persist(newPlanet);
        transaction.commit();
        session.close();
    }
}