package org.serveur.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.serveur.demo.entity.SousFamille;
import org.serveur.demo.repository.SousFamilleRepository;
import org.serveur.demo.service.ICrudService;

@Service
@Primary
public class SousFamilleService implements ICrudService<SousFamille, Long>{

	@Autowired
	private SousFamilleRepository sousfamilleRepository;
	
	@Override
	public List<SousFamille> getAll() {
		return sousfamilleRepository.findAll();
	}

	@Override
	public void add(SousFamille sousfamille) {
		sousfamilleRepository.save(sousfamille);
	}

	@Override
	public void update(SousFamille sousfamille) {
		sousfamilleRepository.save(sousfamille);
	}

	@Override
	public void delete(Long id) {
		SousFamille sousfamille = new SousFamille();
		sousfamille.setId(id);
		sousfamilleRepository.delete(sousfamille);
	}
	
	@Override
	public void saveAll(Iterable<SousFamille> iterable) {
		sousfamilleRepository.saveAll(iterable);	
	}

}