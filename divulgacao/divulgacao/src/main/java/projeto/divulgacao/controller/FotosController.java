package projeto.divulgacao.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import projeto.divulgacao.model.dto.FotosDTO;
import projeto.divulgacao.service.FotosService;
import java.util.List;
//import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/fotos")
public class FotosController {
	
	final FotosService service;
	
	public FotosController(FotosService service) {
	  this.service = service;
	}
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<FotosDTO>> findAll() {
	  return ResponseEntity.ok(this.service.findAll());
	}
	
	//@Valid
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<FotosDTO> save(@RequestBody FotosDTO dto) {
	  return ResponseEntity.ok(this.service.save(dto));
	}
	
}
