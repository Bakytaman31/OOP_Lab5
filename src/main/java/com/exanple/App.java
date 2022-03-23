package com.exanple;
import com.exanple.utils.HibernateUtil;
import org.hibernate.Session;

public class App {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.close();
        HibernateUtil.shutdown();
    }
}
