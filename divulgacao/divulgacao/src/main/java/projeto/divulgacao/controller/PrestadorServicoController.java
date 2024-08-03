package projeto.divulgacao.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
//import jakarta.validation.Valid;
import java.util.List;
import projeto.divulgacao.model.dto.PrestadorServicoDTO;
import projeto.divulgacao.service.PrestadorServicoService;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping(value = "/prestador-servico")
public class PrestadorServicoController {
  
	@Autowired
	final PrestadorServicoService service;
	
	public PrestadorServicoController(PrestadorServicoService service) {
	  this.service = service;
	}

	@GetMapping(produces =  MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<PrestadorServicoDTO>> findAll(){
		return ResponseEntity.ok(this.service.findAll());
	}
	//@Valid
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<PrestadorServicoDTO> save(@RequestBody PrestadorServicoDTO dto) {
		return ResponseEntity.ok(this.service.save(dto));
	}
	
}
