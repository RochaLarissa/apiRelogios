package br.unifor.apirelogios;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("relogios")
public class RelogioController {
	
	private final RelogioService relogioService;

	public RelogioController(RelogioService relogioService) {
		this.relogioService = relogioService;
	}
	
	@GetMapping
	public ResponseEntity<List<RelogioEntity>> buscarTodosOsRelogios() {
		
		return ResponseEntity.ok(relogioService.listarTodos());
	}
	
	@PostMapping
	public ResponseEntity<RelogioEntity> salvarRelogio(@RequestBody RelogioEntity relogioEntity) {
		
		return ResponseEntity.ok(relogioService.salvarRelogio(relogioEntity));
	}
	
	@GetMapping("{id}")
    public ResponseEntity<RelogioEntity> buscarRelogioPorId(@PathVariable Long id) {   

		return ResponseEntity.ok(relogioService.buscarRelogioPorId(id));
	} 
    	
	@PutMapping("{id}")
    public ResponseEntity<RelogioEntity> alterarRelogio(@PathVariable Long id, @RequestBody RelogioEntity relogioEntity) {
        
        return ResponseEntity.ok(relogioService.atualizar(relogioEntity, id));            
    }

	@DeleteMapping("{id}")
	public ResponseEntity<RelogioEntity> deletarRelogio(@PathVariable Long id) {
		
		relogioService.deletar(id);
		return ResponseEntity.ok().build();            
	}

}
