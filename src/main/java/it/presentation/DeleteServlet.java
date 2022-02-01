package it.presentation;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;


import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import it.business.RubricaEJB;
import it.data.Contatto;


public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	 @EJB
	    RubricaEJB rubricaEjb;
    public DeleteServlet() {
        
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Long id = Long.valueOf(request.getParameter("id"));
		
		
		Contatto c = new Contatto();
		c.setId(id);
		
		
		rubricaEjb.delete(c);
	}

	

}
