package model;
import java.io.IOException;
import java.nio.charset.StandardCharsets;


import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.InputStreamSource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import fr.univrouen.stb23v1.controllers.Item;
public class TestSTB {
	public TestSTB(int i, String string, String string2) {
		// TODO Auto-generated constructor stub
	}

	public String loadFileXML() {
		try {
		      InputStreamSource resource =new DefaultResourceLoader().getResource("classpath:xml/test0.xml");
			return StreamUtils.copyToString(resource.getInputStream(), StandardCharsets.UTF_8);
		    } catch (IOException e) {
		      return "Error while reading file: " + e.getMessage();
		    }
	}
	
	@PostMapping(value = "/poststb", produces =  MediaType.APPLICATION_XML_VALUE)
	@ResponseBody
	public String postSTB() {
	TestSTB stb = new TestSTB(0, null, null);
	return stb.loadFileXML();
	}
	@RequestMapping(value = "/xml", produces = MediaType.APPLICATION_XML_VALUE)
	public @ResponseBody TestSTB getXML() {
	TestSTB stb = new TestSTB(123,"Test STB","2023-04-01T14:22:33");
	return stb;
	}
}
