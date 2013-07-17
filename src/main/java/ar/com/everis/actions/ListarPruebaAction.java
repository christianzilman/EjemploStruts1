package ar.com.everis.actions;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;
import org.springframework.web.struts.ActionSupport;

import ar.com.everis.domain.Prueba;
import ar.com.everis.service.PruebaService;

@SuppressWarnings("deprecation")
public class ListarPruebaAction extends ActionSupport {	
	public ActionForward execute(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response) 
	        throws Exception {
	 		DynaActionForm dynaCustomerListForm = (DynaActionForm)form;
			
			PruebaService pruebaService =
					(PruebaService) getWebApplicationContext().getBean("pruebaService");			
			List<Prueba> list = pruebaService.listar();			
			dynaCustomerListForm.set("pruebaList", list);		        
			return mapping.findForward("success");
		  
		}

}
