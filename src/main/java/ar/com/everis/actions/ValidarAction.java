package ar.com.everis.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import org.springframework.web.struts.ActionSupport;
import ar.com.everis.forms.ValidacionForm;
import ar.com.everis.service.PruebaService;

@SuppressWarnings("deprecation")
public class ValidarAction extends ActionSupport {	
	
	
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// obtiene los datos del driver y de la cadena de 78 STRUTS � RA-MA
		// conexi�n de los par�metros de contexto
		//GestionClientes gc = new GestionClientes();
		ValidacionForm vf = (ValidacionForm) form;		
		PruebaService pruebaService =
				(PruebaService) getWebApplicationContext().getBean("pruebaService");
		if (pruebaService.getByNombre(vf.getUsuario().trim())) {
		//if(pruebaService.getByNombre(vf.getUsuario())){
			return mapping.findForward("bienvenida");
		} else {
			//vf.setMensaje("<h2>Combinaci�n de usuario y password incorrecta!</h2>");
			return mapping.findForward("error");
		}
	}
}