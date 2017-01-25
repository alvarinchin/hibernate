package org.pruebas.app1.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class Persona {
	private long id;
	
	private String nombre;
	private String apellido;
	private String anyoNacimiento;
	
	
	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public Persona(){
		
	}


	public Persona(String nombre, String apellido, String anyoNacimiento) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.anyoNacimiento = anyoNacimiento;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getAnyoNacimiento() {
		return anyoNacimiento;
	}


	public void setAnyoNacimiento(String anyoNacimiento) {
		this.anyoNacimiento = anyoNacimiento;
	}
	
	

}
