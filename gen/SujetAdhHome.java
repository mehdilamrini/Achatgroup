// default package
// Generated 16 déc. 2017 20:00:18 by Hibernate Tools 5.2.6.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class SujetAdh.
 * @see .SujetAdh
 * @author Hibernate Tools
 */
public class SujetAdhHome {

	private static final Log log = LogFactory.getLog(SujetAdhHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(SujetAdh transientInstance) {
		log.debug("persisting SujetAdh instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(SujetAdh instance) {
		log.debug("attaching dirty SujetAdh instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SujetAdh instance) {
		log.debug("attaching clean SujetAdh instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(SujetAdh persistentInstance) {
		log.debug("deleting SujetAdh instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SujetAdh merge(SujetAdh detachedInstance) {
		log.debug("merging SujetAdh instance");
		try {
			SujetAdh result = (SujetAdh) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SujetAdh findById(java.lang.Integer id) {
		log.debug("getting SujetAdh instance with id: " + id);
		try {
			SujetAdh instance = (SujetAdh) sessionFactory.getCurrentSession().get("SujetAdh", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(SujetAdh instance) {
		log.debug("finding SujetAdh instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("SujetAdh").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
