package org.alvaro.ejercicio12;

import static org.alvaro.ejercicio12.HibernateUtil.getSession;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

/**
 * Servlet implementation class LibroListar
 */
@WebServlet("/LibroListar")
public class LibroListar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		List<Libro> libros = listarLibros();

		request.setAttribute("libros", libros);
		request.getRequestDispatcher("/view/libro/libroListar.jsp").forward(
				request, response);

	}
	
private List<Libro> listarLibros() {
		
		Session ses = getSession();
		
		
		 List <Libro> libros=ses.createQuery("from Libro").list();
		 ses.close();
			return libros ;
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
