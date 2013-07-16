package ar.com.everis.forms;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.*;

/**
 * 
 * @author chzilman
 *
 */
public class ValidacionForm extends ActionForm {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// datos miembro
	private String usuario;
	private String password;

	// métodos de acceso
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String nombre) {
		this.usuario = nombre;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}