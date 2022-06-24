package fr.dawan.javapoo.object_;

import java.util.Objects;

public class CompteBancaire {
	
	private String nomProprietaire;
	private String numeroCompte;
	private double solde;
	
	public CompteBancaire() {
		super();
	}

	public CompteBancaire(String nomProprietaire, String numeroCompte, double solde) {
		super();
		this.nomProprietaire = nomProprietaire;
		this.numeroCompte = numeroCompte;
		this.solde = solde;
	}
	
	public String getNomProprietaire() {
		return this.nomProprietaire;
	}
	
	public void setNomProprietaire(String nomProprietaire) {
		this.nomProprietaire = nomProprietaire;
	}

	public String getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	@Override
	public String toString() {
		return "Compte bancaire de : " + this.nomProprietaire + "." +
				"\nNumero de compte : " + this.numeroCompte + 
				"\nSolde actuel : " + this.solde + "€";
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(nomProprietaire, numeroCompte, solde);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompteBancaire other = (CompteBancaire) obj;
		return Objects.equals(this.nomProprietaire, other.nomProprietaire)
				&& Objects.equals(this.numeroCompte, other.numeroCompte)
				&& Double.doubleToLongBits(this.solde) == Double.doubleToLongBits(other.solde);
	}
	
	
	

}
