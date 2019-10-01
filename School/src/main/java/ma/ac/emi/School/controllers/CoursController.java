package ma.ac.emi.School.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import ma.ac.emi.School.dao.CoursRepository;
import ma.ac.emi.School.entities.Cours;
import ma.ac.emi.School.entities.Etudiant;

@RestController
public class CoursController {
	@Autowired
	private CoursRepository cRep;
	
	@PostMapping("/cours/add")
	@ResponseStatus(HttpStatus.CREATED)
	public void addEtudiant(@RequestBody Cours crs) {
		this.cRep.save(crs);
	}
	
	@GetMapping("/cours")
	public List<Cours> findAllCours() {
			return cRep.findAll();
	} 
	@GetMapping("/cours/{id}")
	public Optional<Cours> findEtbyId(@PathVariable Integer id) {
			return cRep.findById(id);
	} 
	
	@DeleteMapping("/cours/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public void deleteEtudiant(@PathVariable Integer id) {
		this.cRep.deleteById(id);
	}
}
