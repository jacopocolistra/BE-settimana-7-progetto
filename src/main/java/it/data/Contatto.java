package it.data;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@NamedQuery(name="getContatti.bySurname", query="SELECT c FROM Contatti c WHERE c.cognome like : cognome")

@Table(name="contatti")
@Entity
public class Contatto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String cognome;
	private String nome;
	private String email;
	private Long numTelefoni;
	
	private List<NumTelefono> numeroTelefoni;
	
	public List<NumTelefono> getNumeroTelefoni() {
		return numeroTelefoni;
	}

	public void setNumeroTelefoni(List<NumTelefono> numeroTelefoni) {
		this.numeroTelefoni = numeroTelefoni;
	}

	@Id
	@Column(name="id")
	public Long getId() {return id;}
	
	public void setId(Long id) {this.id = id;}
	
	@Column(name="cognome")
	public String getCognome() {return cognome;}
	
	public void setCognome(String cognome) {this.cognome = cognome;}
	
	@Column(name="nome")
	public String getNome() {return nome;}
	
	public void setNome(String nome) {this.nome = nome;}
	
	@Column(name="email")
	public String getEmail() {return email;}
	
	public void setEmail(String email) {this.email = email;}
	
	@Column(name="num_telefoni")
	public Long getNumTelefoni() {return numTelefoni;}
	
	public void setNumTelefoni(Long numTelefoni) {this.numTelefoni = numTelefoni;}

	


}
