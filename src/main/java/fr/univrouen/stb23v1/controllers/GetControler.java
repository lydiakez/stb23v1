package fr.univrouen.stb23v1.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class GetControler {
	
	@GetMapping("/resume")
	public String getListRSSinXML() {
		return "Envoi de la liste des STB";
	}
	
	@GetMapping("/stbid")
	public String getRSSinXML() {
		return "Détail du contenu STB demandé";
	}
}