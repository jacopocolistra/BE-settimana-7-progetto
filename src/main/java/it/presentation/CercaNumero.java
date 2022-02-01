package it.presentation;

import jakarta.ejb.EJB;

import jakarta.servlet.ServletException;


import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import it.business.RubricaEJB;

public class CercaNumero extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	
	@EJB
    RubricaEJB rubricaEjb;
    public CercaNumero() {
      
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		rubricaEjb.getContattibyNumber(6989555984L);
	}

}
