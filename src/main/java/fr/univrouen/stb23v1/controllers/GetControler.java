package fr.univrouen.stb23v1.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class GetControler {
	
	@GetMapping("/resume")
	public String getListRSSinXML() {
		return "Envoi de la liste des STB";
	}
	
	@GetMapping("/stbid")
	public String getRSSinXML(
	@RequestParam(value = "id") String texte) {
	return ("Détail de la STB n°" + texte);
	}
	@GetMapping("/test")
	public String testMethod(@RequestParam(value = "id") String id, @RequestParam(value = "titre") String titre) {
	   return ("Test :\n" + "id = " + id + "\n" + "titre = " + titre);
	}
} 
