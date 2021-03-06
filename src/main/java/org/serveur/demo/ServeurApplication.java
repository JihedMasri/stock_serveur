package org.serveur.demo;

import java.util.Arrays;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import org.serveur.demo.entity.Produit;
import org.serveur.demo.entity.Role;
import org.serveur.demo.entity.User;
import org.serveur.demo.repository.ProduitRepository;
import org.serveur.demo.repository.RoleRepository;
import org.serveur.demo.repository.UserRepository;
import org.serveur.demo.util.RoleEnum;

@SpringBootApplication
public class ServeurApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext ctx=SpringApplication.run(ServeurApplication.class, args);
	ProduitRepository produitRepository=ctx.getBean(ProduitRepository.class);
	
	
	RoleRepository roleRepository = ctx.getBean(RoleRepository.class);
	
	Role roleUser = new Role(RoleEnum.ROLE_USER);
	Role roleAdmin = new Role(RoleEnum.ROLE_ADMIN);
	
	roleRepository.save(roleUser);
	roleRepository.save(roleAdmin);
	
	UserRepository userRepository = ctx.getBean(UserRepository.class);
	
	User user = new User("user", "user", true);
	user.setRoles(Arrays.asList(roleUser));
	
	userRepository.save(user);
	
	User admin = new User("admin", "admin", true);
	admin.setRoles(Arrays.asList(roleUser, roleAdmin));
	
	userRepository.save(admin);
	
	}
}