package br.unifor.apirelogios;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class RelogioService {
	
	private final RelogioRepository relogioRepository;
	
	public RelogioService(RelogioRepository relogioRepository) {
		this.relogioRepository = relogioRepository;
	}
	
	public RelogioEntity salvarRelogio(RelogioEntity novoRelogio) {
		return relogioRepository.save(novoRelogio);
	}
	
	public List<RelogioEntity> listarTodos() {
		return relogioRepository.findAll();
	}
	
	public RelogioEntity buscarRelogioPorId(Long id) {
		Optional<RelogioEntity> relogio = relogioRepository.findById(id);
		return relogio.orElseThrow();
	}
	
	public RelogioEntity atualizar(RelogioEntity relogio, Long id) {
		RelogioEntity relogioOriginal = this.buscarRelogioPorId(id);
		relogio.setId(relogioOriginal.getId());
		
		return relogioRepository.save(relogio);
	}
	
	public void deletar(Long id) {
		relogioRepository.deleteById(id);
	}

}
