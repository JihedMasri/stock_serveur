package org.serveur.demo.repository;

import org.serveur.demo.entity.Famille;
import org.serveur.demo.entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface FamilleRepository  extends JpaRepository<Famille, Long>{

}
