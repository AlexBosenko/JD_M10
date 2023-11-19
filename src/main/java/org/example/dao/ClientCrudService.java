package org.example.dao;

import org.example.entity.Klient;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class ClientCrudService {
    private final Session session;

    public ClientCrudService(Session session) {
        this.session = session;
    }

    public Long createNewKlient(String name) {
        Transaction transaction = session.beginTransaction();

        Klient newClient = new Klient();
        newClient.setName(name);
        session.persist(newClient);

        transaction.commit();

        return newClient.getId();
    }

    public Klient getKlientById(long id) {
        return session.get(Klient.class, id);
    }

    public List<Klient> getAllKlient() {
        return session.createQuery("from Klient", Klient.class).list();
    }

    public Klient setKlientNameById(Long id, String newName) {
        Transaction transaction = session.beginTransaction();

        Klient klient = session.get(Klient.class, id);
        klient.setName(newName);
        session.persist(klient);

        transaction.commit();

        return klient;
    }

    public void deleteKlientById(Long id) {
        Transaction transaction = session.beginTransaction();

        Klient klient = session.get(Klient.class, id);
        session.remove(klient);

        transaction.commit();
    }
}
