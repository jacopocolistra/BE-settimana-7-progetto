package it.presentation;

import jakarta.ejb.EJB;



import jakarta.servlet.ServletException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


import it.business.RubricaEJB;
import it.data.Contatto;


public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    @EJB
    RubricaEJB rubricaEjb;
	public MyServlet() {
     
     }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long id = Long.valueOf(request.getParameter("id"));
		String cognome = request.getParameter("cognome");
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		Long numTelefoni = Long.valueOf(request.getParameter("numTelefoni"));
		
		Contatto c = new Contatto();
		c.setId(id);
		c.setCognome(cognome);
		c.setNome(nome);
		c.setEmail(email);
		c.setNumTelefoni(numTelefoni);
		rubricaEjb.inserisci(c);
		
		
		
		
		
		
		
	}
	


}
