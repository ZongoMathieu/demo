package com.chd.fgdr;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private EtudiantRepository etudiantRepository;
	@Autowired
	private FormationRepository formationRepository;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Formation f1=formationRepository.save(new Formation("PHP",50,null));
		Formation f2=formationRepository.save(new Formation("Java",60,null));
		Formation f3=formationRepository.save(new Formation("Python",30,null));
		
	etudiantRepository.save(new Etudiant("ZONG0","Mathieu", new Date(),f1));
	etudiantRepository.save(new Etudiant("ZONG0","Christine", new Date(),f1));
	etudiantRepository.save(new Etudiant("ZONG0","Merveille", new Date(),f2));
	etudiantRepository.save(new Etudiant("ZONG0","Romaric", new Date(),f3));
	System.out.println(etudiantRepository.toString());
	
	}

}
