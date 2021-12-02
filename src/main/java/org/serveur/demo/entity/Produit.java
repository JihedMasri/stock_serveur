package org.serveur.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Produit {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long  id;
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	private String ref;
	private int quantite;
	private float prixUnitaire;
	
	@ManyToOne
	private SousFamille sousfamille;
	
	
	

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
		Produit other = (Produit) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	

	

	public Produit(Long id, String ref, int quantite, float prixUnitaire, SousFamille sousfamille) {
		super();
		this.id = id;
		this.ref = ref;
		this.quantite = quantite;
		this.prixUnitaire = prixUnitaire;
		this.sousfamille = sousfamille;
	}

	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public float getPrixUnitaire() {
		return prixUnitaire;
	}
	public void setPrixUnitaire(float prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}
	public SousFamille getSousfamille() {
		return sousfamille;
	}

	public void setSousfamille(SousFamille sousfamille) {
		this.sousfamille = sousfamille;
	}
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
}
