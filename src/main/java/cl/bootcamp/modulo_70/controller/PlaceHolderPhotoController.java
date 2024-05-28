package cl.bootcamp.modulo_70.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import cl.bootcamp.modulo_70.model.placeholder.Photo;

@Controller
@RequestMapping("/placeholder/photo")
public class PlaceHolderPhotoController {

	
	RestTemplate restemplate;
	
	
	public PlaceHolderPhotoController() {
		restemplate= new RestTemplate();
	}
	
	@GetMapping("/{id}")
	public ModelAndView getForId(@PathVariable int id) {
		
		String url="https://jsonplaceholder.typicode.com/photos/"+id;
		Photo photo =restemplate.getForObject(url, Photo.class);
		
	//	ResponseEntity<Photo> response =restemplate.getForEntity(url, Photo.class);
		
		ModelAndView mav= new ModelAndView("placeholder/photo.jsp");
		mav.addObject("photo", photo);
		return mav;
	}
}
