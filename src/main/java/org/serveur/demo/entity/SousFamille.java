package org.serveur.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class SousFamille {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long  id;
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	private String nom;
	@ManyToOne
	private Famille famille;
	
	public Famille getFamille() {
		return famille;
	}

	public void setFamille(Famille famille) {
		this.famille = famille;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SousFamille other = (SousFamille) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	

	public SousFamille(Long id, String nom, Famille famille) {
		super();
		this.id = id;
		this.famille = famille;
		this.nom = nom;
	}

	public SousFamille() {
		super();
	}
	

	
}
