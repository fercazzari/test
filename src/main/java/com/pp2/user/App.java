package com.pp2.user;

import org.hibernate.Session;

import com.pp2.persistence.HibernateUtil;
import com.pp2.user.DBUser;

/*** Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    		
    	Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();
		
		DBUser user = new DBUser();

		user.setUserId(002);
		user.setUsername("Clyde");

		session.save(user);
		session.getTransaction().commit();
		
		System.out.println("saved ok");
    }
}
