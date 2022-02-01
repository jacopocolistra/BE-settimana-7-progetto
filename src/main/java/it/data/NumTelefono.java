package it.data;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;


@NamedQuery(name="getContatti.byNumber", query="SELECT c.num_telefoni FROM Contatti c WHERE c.num_telefoni like : numero")
@Table(name="numeri_Telefonici")
@Entity
public class NumTelefono implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String numeroTelefono;
	
	private List<Contatto> Contatti;
	
	
	
	
	@Id
	@Column(name="id")
	public Long getId() {return id;}
	
	public void setId(Long id) {this.id = id;}
	
	@Column(name="numero_Telefono")
	public String getNumeroTelefono() {return numeroTelefono;}
	
	public void setNumeroTelefono(String numeroTelefono) {this.numeroTelefono = numeroTelefono;}

	
	
	public List<Contatto> getContatti() {
		return Contatti;
	}

	public void setContatti(List<Contatto> contatti) {
		Contatti = contatti;
	}
	
	




}
