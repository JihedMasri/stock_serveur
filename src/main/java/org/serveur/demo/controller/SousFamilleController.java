package org.serveur.demo.controller;

import org.serveur.demo.entity.Famille;
import org.serveur.demo.entity.Produit;
import org.serveur.demo.entity.SousFamille;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/famille_sous")
public class SousFamilleController extends CrudController<SousFamille, Long>{

}
