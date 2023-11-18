package org.example;

import org.example.hibernate.HibernateUtil;
import org.hibernate.Session;

public class Main {
    public static void main(String[] args) {
        HibernateUtil util = HibernateUtil.getINSTANCE();
        Session session = util.getSessionFactory().openSession();
        session.close();
    }
}