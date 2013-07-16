package ar.com.everis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ar.com.everis.forms.ValidacionForm;
import ar.com.everis.service.PruebaService;


@Component
public class GestionClientes {
	
	@Autowired
	private PruebaService pruebaService;
	public GestionClientes() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean validar(ValidacionForm vf) {
		boolean estado = false;
		
		try {
		/*	if(pruebaService.getByNombre(vf.getUsuario())){
				estado = true;
			}*/
			
			if (vf.getUsuario().equals("admin") && vf.getPassword().equals("admin")) {
				estado = true;
			}
		} catch (Exception ex) {
		}
		return estado;
	}
}
