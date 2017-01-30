package org.alvaro.ejercicio12;

import java.io.IOException;

import static org.alvaro.ejercicio12.HibernateUtil.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Servlet implementation class EditarLibro
 */
@WebServlet({"/EditarLibro","/EditarLibro/","/EditarLibro/*"})
public class EditarLibro extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		long id = Long.parseLong(request.getPathInfo().toString().substring(1, request.getPathInfo().length()));

		Libro l = getLibro(id);
		request.setAttribute("libro", l);
		request.getRequestDispatcher("/view/libro/EditarLibro.jsp").forward(request, response);
	}

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int isbn = Integer.parseInt(request.getParameter("isbn"));
		String titulo = request.getParameter("titulo");
		String categoria = request.getParameter("categoria");
		//Long id = new Long(request.getParameter("id"));
		long id = Long.parseLong(request.getParameter("id"));
		
		actualizarLibro(isbn,titulo,categoria,id);
		
		request.getRequestDispatcher("/LibroListar").forward(request, response);
		
		
		
		
	}
	
	private void actualizarLibro(int isbn, String titulo, String categoria, Long id) {
		Session s= getSession();
		Libro l = s.load(Libro.class, id);

		Transaction t = s.beginTransaction();
		l.setIsbn(isbn);
		l.setTitulo(titulo);
		l.setCategoria(categoria);
		
		s.save(l);
		t.commit();
		s.close();
	}



	private Libro getLibro(long id) {
		
		Session s= getSession();

		Libro l = (Libro) s.get(Libro.class,id);
		
		s.close();
		
		return l;
		
	}

}
