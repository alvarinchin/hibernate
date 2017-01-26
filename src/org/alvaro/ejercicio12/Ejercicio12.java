package org.alvaro.ejercicio12;

import java.io.IOException;
import java.util.List;

import static org.alvaro.ejercicio12.HibernateUtil.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Servlet implementation class Ejercicio12
 */
@WebServlet("/Ejercicio12")
public class Ejercicio12 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("view/libro/libroCrear.jsp").forward(
				request, response);

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		int isbn = Integer.parseInt(request.getParameter("isbn"));
		String titulo = request.getParameter("titulo");
		String categoria = request.getParameter("categoria");

		insertarLibro(isbn, categoria, titulo);

		List<Libro> libros = listarLibros();
		
		request.setAttribute("libros", libros);
		
		request.getRequestDispatcher("view/libro/libroListar.jsp").forward(
				request, response);

	}

	private List<Libro> listarLibros() {
		
		Session ses = getSession();
		
		 List <Libro> libros=ses.createQuery("from libro").list();
		
		return libros ;
	}

	private void insertarLibro(int isbn, String categoria, String titulo) {
		
		//recuperamos la sesion
		Session ses = getSession();

		//creamos una nueva transaccion
		Transaction tr = ses.beginTransaction();

		//creamos el pojo nuevo
		Libro l = new Libro(isbn, categoria, titulo);
		
		//guardamos y hacemos commit
		
		ses.save(l);
		tr.commit();

	}

}
