package ma.ac.emi.School.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import ma.ac.emi.School.dao.EtudiantRepository;
import ma.ac.emi.School.entities.*;

@RestController
public class EtudiantController {
	@Autowired
	private EtudiantRepository etRep;
	
	
	@PostMapping("/etudiants/add")
	@ResponseStatus(HttpStatus.CREATED)
	public void addEtudiant(@RequestBody Etudiant etu) {
		this.etRep.save(etu);
	}
	
	@GetMapping("/etudiants")
	public List<Etudiant> findAllCours() {
			return etRep.findAll();
	} 
	@GetMapping("/etudiants/{id}")
	public Optional<Etudiant> findEtbyId(@PathVariable Integer id) {
			return etRep.findById(id);
	} 
	
	@DeleteMapping("/etudiants/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public void deleteEtudiant(@PathVariable Integer id) {
		this.etRep.deleteById(id);
	}
	
}
