package ar.com.everis.repository.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.com.everis.domain.Prueba;
import ar.com.everis.repository.PruebaDao;

@Repository
public class PruebaDaoImpl implements PruebaDao {

	@Autowired
	private SessionFactory sessionFactory; 
	
	public void crear(Prueba prueba) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(prueba);
	}

	public List<Prueba> listar() {
		// TODO Auto-generated method stub
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Prueba.class);
		return criteria.list();
	}

	public boolean getByNombre(String usuario) {
		// TODO Auto-generated method stub
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Prueba.class);
		criteria.add(Restrictions.eq("nombre",usuario));		
		criteria.setProjection(Projections.rowCount());
        Integer totalNumberOfElements = Integer.valueOf(criteria.uniqueResult().toString());
        return (totalNumberOfElements >0);		
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
