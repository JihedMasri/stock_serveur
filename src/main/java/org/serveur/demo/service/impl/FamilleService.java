package org.serveur.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.serveur.demo.entity.Famille;
import org.serveur.demo.repository.FamilleRepository;
import org.serveur.demo.service.ICrudService;

@Service
@Primary
public class FamilleService implements ICrudService<Famille, Long>{

	@Autowired
	private FamilleRepository familleRepository;
	
	@Override
	public List<Famille> getAll() {
		return familleRepository.findAll();
	}

	@Override
	public void add(Famille famille) {
		familleRepository.save(famille);
	}

	@Override
	public void update(Famille famille) {
		familleRepository.save(famille);
	}

	@Override
	public void delete(Long id) {
		Famille famille = new Famille();
		famille.setId(id);
		familleRepository.delete(famille);
	}
	
	@Override
	public void saveAll(Iterable<Famille> iterable) {
		familleRepository.saveAll(iterable);	
	}

}