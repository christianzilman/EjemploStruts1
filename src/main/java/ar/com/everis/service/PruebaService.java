package ar.com.everis.service;

import java.util.List;

import ar.com.everis.domain.Prueba;

public interface PruebaService {
	public void crear(Prueba prueba);
	public List<Prueba>	listar();
	public boolean getByNombre(String usuario);
}
