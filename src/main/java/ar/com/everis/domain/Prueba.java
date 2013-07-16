package ar.com.everis.domain;

import javax.persistence.*;

/**
 * 
 * @author chzilman
 * 16/07/2013
 *
 */
@Entity
@Table(name="prueba")
public class Prueba {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idprueba")
	private int id;
	
	@Column(name="nombre")
	private String nombre;
	
	public Prueba() {
		// TODO Auto-generated constructor stub
	}	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
