package ma.ac.emi.School.entities;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Cours {
	
    @Id
    @GeneratedValue
    @Column(name = "idCours")
    private Integer idCours;
    @Column(name = "intitule")
    private String intitule;
    @Column(name = "description")
    private String description;
    
    @ManyToMany( cascade = {CascadeType.ALL})    
    @JoinColumn(name = "etudiants")
    List<Etudiant> etudiants;
    
    @ManyToOne
    @JoinColumn(name = "enseignant")
    Enseignant ens;
    
	public Cours(String intitule, String description) {
		super();
		this.intitule = intitule;
		this.description = description;
	}
	public Cours() {
	}
	public Integer getIdCour() {
		return idCours;
	}
	public void setIdCour(Integer idCour) {
		this.idCours = idCour;
	}
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Etudiant> getEtudiants() {
		return etudiants;
	}
	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}
	public Enseignant getEns() {
		return ens;
	}
	public void setEns(Enseignant ens) {
		this.ens = ens;
	}
    
	
    
    
}