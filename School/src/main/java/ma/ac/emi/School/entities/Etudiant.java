package ma.ac.emi.School.entities;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Etudiant {
    @Id
    @Column(name = "matricule")
    private Integer matricule;
    @Column(name = "nom")
    private String nom;
    @Column(name = "prenom")
    private String prenom;
    @Column(name = "mail")
    private String mail;
    @Column(name = "annee")
    private Integer annee;
    @Column(name = "filiere")
    private String filiere;
    
    @ManyToMany
    @JoinColumn(name = "cours")
    List<Cours> cours;

	public Etudiant(String nom, String prenom, String mail, Integer annee, String filiere) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.annee = annee;
		this.filiere = filiere;
	}

	public Etudiant() {
	}

	public Integer getMatricule() {
		return matricule;
	}

	public void setMatricule(Integer matricule) {
		this.matricule = matricule;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Integer getAnnee() {
		return annee;
	}

	public void setAnnee(Integer annee) {
		this.annee = annee;
	}

	public String getFiliere() {
		return filiere;
	}

	public void setFiliere(String filiere) {
		this.filiere = filiere;
	}

	public List<Cours> getCours() {
		return cours;
	}

	public void setCours(List<Cours> cours) {
		this.cours = cours;
	}
    
    
}