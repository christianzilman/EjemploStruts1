package ar.com.everis.controller;

import ar.com.everis.forms.ValidacionForm;


//@Component
public class GestionClientes {
	
	//@Autowired
	//private PruebaService pruebaService;
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
