package org.serveur.demo.controller;

import org.serveur.demo.entity.Famille;
import org.serveur.demo.entity.Produit;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/famille")
public class FamilleController extends CrudController<Famille, Long>{

}
