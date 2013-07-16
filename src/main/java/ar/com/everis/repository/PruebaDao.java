package ar.com.everis.repository;

import java.util.List;

import ar.com.everis.domain.Prueba;

/**
 * 
 * @author chzilman
 *
 */
public interface PruebaDao {
	public void crear(Prueba prueba);
	public List<Prueba> listar();
	public boolean getByNombre(String usuario);
}
