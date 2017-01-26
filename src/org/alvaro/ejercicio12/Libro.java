package org.alvaro.ejercicio12;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity


public class Libro {
	

	private int isbn;
	private String titulo;
	private String categoria;
	private long id;
	
	
	

	public Libro(){
		
	}
	
	
	
	public Libro(int isbn, String titulo, String categoria) {

		this.isbn = isbn;
		this.categoria = categoria;
		this.titulo = titulo;

	}
	@Id
	@GeneratedValue
	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

}
