package com.core.app.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.springframework.transaction.annotation.Transactional;

import com.core.app.model.User;
import com.core.app.util.AbstractDao;
import com.core.app.util.DataAccessLayerException;
import com.core.app.util.HibernateFactory;

@Transactional
public class UserDao extends AbstractDao {

	/**
	 * Insert a new User into the database.
	 * 
	 * @param user
	 */
	public void create(User user) throws DataAccessLayerException {
		super.saveOrUpdate(user);
	}

	/**
	 * Delete a detached User from the database.
	 * 
	 * @param user
	 */
	public void delete(User user) throws DataAccessLayerException {
		super.delete(user);
	}

	/**
	 * Find an User by its primary key.
	 * 
	 * @param id
	 * @return
	 */
	public User find(Long id) throws DataAccessLayerException {
		return (User) super.find(User.class, id);
	}

	/**
	 * Updates the state of a detached User.
	 *
	 * @param user
	 */
	public void update(User user) throws DataAccessLayerException {
		super.saveOrUpdate(user);
	}

	/**
	 * Finds all Users in the database.
	 * 
	 * @return
	 */
	public List<?> findAll() throws DataAccessLayerException {
		return super.findAll(User.class);
	}

	public User findByUsernameAndPassword(String username, String pwd) throws DataAccessLayerException {
		User user = null;

		try {
			super.startOperation();
			Query query = session.createQuery("from User u where u.username = :username and u.password = :pwd");
			query.setString("username", username);
			query.setString("pwd", pwd);
			
			System.out.println("masuk gak uya");
			user = (User) query.uniqueResult();
			tx.commit();

		} catch (HibernateException e) {
			handleException(e);
		} finally {
			HibernateFactory.close(session);
		}

		return user;
	}
}
