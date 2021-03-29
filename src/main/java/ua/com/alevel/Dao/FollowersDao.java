package ua.com.alevel.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import ua.com.alevel.Util.HibernateSessionFactoryUtil;
import ua.com.alevel.model.Subscriptions;
import ua.com.alevel.model.User;

import java.util.List;

public class FollowersDao {
    private static SessionFactory sessionFactory = HibernateSessionFactoryUtil.getSessionFactory();

//    public static List<Subscriptions> getAllFollowers(Integer user_id) {
//        try (Session session = sessionFactory.openSession()) {
//            session.beginTransaction();
//            Query<Subscriptions> query = session.createQuery(" SELECT follower_id  FROM  Subscriptions JOIN " +
//                    "User WHERE Subscriptions.user_id = User.user_id" , Subscriptions.class);
//            List<Subscriptions> resultList = query.getResultList();
//            session.getTransaction().commit();
//            return resultList;
//        }
//    }
}
