package ar.com.everis.service.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.com.everis.domain.Prueba;
import ar.com.everis.repository.PruebaDao;
import ar.com.everis.service.PruebaService;

/**
 * 
 * @author chzilman
 * 
 */
@Service
@Transactional
public class PruebaServiceImpl implements PruebaService {
	protected final Log logger = LogFactory.getLog(getClass());
	@Autowired
	private PruebaDao pruebaDao;

	public void crear(Prueba prueba) {
		// TODO Auto-generated method stub
		try {
			pruebaDao.crear(prueba);
		} catch (RuntimeException ex) {
			logger.error(getClass().getName() + " Metodo Crear");
			throw ex;
		}
	}

	public List<Prueba> listar() {
		// TODO Auto-generated method stub
		try {
			return pruebaDao.listar();
		} catch (RuntimeException ex) {
			logger.error(getClass().getName() + "Metodo Listar " + ex);
			throw ex;
		}
	}

	public boolean getByNombre(String usuario) {
		// TODO Auto-generated method stub
		try {
			return pruebaDao.getByNombre(usuario);
		} catch (RuntimeException ex) {

			throw ex;
		}
	}

	public PruebaDao getPruebaDao() {
		return pruebaDao;
	}

	public void setPruebaDao(PruebaDao pruebaDao) {
		this.pruebaDao = pruebaDao;
	}

}
