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
import org.hibernate.Transaction;

@WebServlet({ "/BorrarLibro", "/BorrarLibro/", "/BorrarLibro/*" })
public class BorrarLibro extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		long id = Long.parseLong(request.getPathInfo().substring(1, request.getPathInfo().length()));

		BorrarDeLaBase(id);
		
	 request.setAttribute("libros", listarLibros());

		request.getRequestDispatcher("PruebasHibernate/Ejercicio12").forward(request, response);

	}

	private List<Libro> listarLibros() {

		Session ses = getSession();

		List<Libro> libros = ses.createQuery("from Libro").list();

		return libros;
	}

	private void BorrarDeLaBase(long id) {
		Session s = getSession();

	Transaction t = s.beginTransaction();
	//TODO
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
