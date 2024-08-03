package projeto.divulgacao.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import projeto.divulgacao.model.dto.VideosDTO;
import projeto.divulgacao.service.VideosService;
import java.util.List;
//import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping(value = "/videos")
public class VideosController {
	
	@Autowired
    final VideosService service;
	
	public VideosController(VideosService service) {
	  this.service = service;
	}
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<VideosDTO>> findAll() {
	  return ResponseEntity.ok(this.service.findAll());
	}
	
	//@Valid
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<VideosDTO> save(@RequestBody VideosDTO dto) {
	  return ResponseEntity.ok(this.service.save(dto));
	}
  
}
