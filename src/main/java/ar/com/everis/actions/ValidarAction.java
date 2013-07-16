package ar.com.everis.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import ar.com.everis.controller.GestionClientes;
import ar.com.everis.forms.ValidacionForm;

public class ValidarAction extends Action {
	
	
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// obtiene los datos del driver y de la cadena de 78 STRUTS © RA-MA
		// conexión de los parámetros de contexto
		GestionClientes gc = new GestionClientes();
		ValidacionForm vf = (ValidacionForm) form;		
		if (gc.validar(vf)) {
		//if(pruebaService.getByNombre(vf.getUsuario())){
			return mapping.findForward("bienvenida");
		} else {
			//vf.setMensaje("<h2>Combinación de usuario y password incorrecta!</h2>");
			return mapping.findForward("error");
		}
	}
}