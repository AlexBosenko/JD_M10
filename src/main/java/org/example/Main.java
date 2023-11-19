package org.example;

import org.example.dao.ClientCrudService;
import org.example.entity.Klient;
import org.example.hibernate.HibernateUtil;
import org.hibernate.Session;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        HibernateUtil util = HibernateUtil.getInstance();

        Session session = util.getSessionFactory().openSession();

        ClientCrudService clientCrudService = new ClientCrudService(session);

        System.out.println("1. Create new Client");
        Long newClientId = clientCrudService.createNewKlient("Tom Smth");
        System.out.println("newClientId = " + newClientId);

        System.out.println("2. Read Client by id");
        Long klientId = 2L;
        Klient klientById = clientCrudService.getKlientById(klientId);
        System.out.println("Client by ID = " + klientId + ": " + klientById);

        System.out.println("3. Read all Clients");
        List<Klient> allKlient = clientCrudService.getAllKlient();
        allKlient.forEach(klient -> System.out.println("klient = " + klient));

        System.out.println("4. Update Client name");
        Klient updatedClient = clientCrudService.setKlientNameById(newClientId, "Tom Cruise");
        System.out.println("updatedClient = " + updatedClient);

        System.out.println("5. Delete Client by id");
        clientCrudService.deleteKlientById(newClientId);
        allKlient = clientCrudService.getAllKlient();
        allKlient.forEach(klient -> System.out.println("klient = " + klient));

        session.close();
        util.close();
    }
}