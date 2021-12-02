package org.serveur.demo.repository;

import org.serveur.demo.entity.SousFamille;
import org.serveur.demo.entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface SousFamilleRepository  extends JpaRepository<SousFamille, Long>{

}
