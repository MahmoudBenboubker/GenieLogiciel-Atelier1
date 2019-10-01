package ma.ac.emi.School.controllers;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import ma.ac.emi.School.dao.EnseignantRepository;
import ma.ac.emi.School.entities.Enseignant;

@RestController
public class EnseignantController {
	@Autowired
	private EnseignantRepository ensRep;
	
	@PostMapping("/enseignants/add")
	@ResponseStatus(HttpStatus.CREATED)
	public void addEnseignant(@RequestBody Enseignant ens) {
		this.ensRep.save(ens);
	}
	
	@GetMapping("/enseignants")
	public List<Enseignant> findAllCours() {
			return ensRep.findAll();
	} 
	@GetMapping("/enseignants/{id}")
	public Optional<Enseignant> findEnsbyId(@PathVariable Integer id) {
			return ensRep.findById(id);
	} 
	
	@DeleteMapping("/enseignants/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public void deleteEnseignant(@PathVariable Integer id) {
		this.ensRep.deleteById(id);
	}
	
}
