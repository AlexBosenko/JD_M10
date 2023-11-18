package org.example.hibernate;

import lombok.Getter;
import org.example.entity.*;
import org.example.properties.PropertyReader;
import org.flywaydb.core.Flyway;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final HibernateUtil INSTANCE;
    static {
        INSTANCE = new HibernateUtil();
    }
    @Getter
    private SessionFactory sessionFactory;

    private HibernateUtil() {
        String url = PropertyReader.getInstance().getConnectionUrl();
        String user = PropertyReader.getInstance().getUser();
        String password = PropertyReader.getInstance().getPassword();
        Flyway flyway = Flyway
                .configure()
                .dataSource(url, user, password)
                .load();
        flyway.migrate();

        sessionFactory = new Configuration()
                .addAnnotatedClass(Client.class)
                .buildSessionFactory();
    }

    public static HibernateUtil getINSTANCE() {
        return INSTANCE;
    }

    public void close() {
        sessionFactory.close();
    }
}
