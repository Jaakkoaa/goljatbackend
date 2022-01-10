package Goljat.backend;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import Goljat.backend.domain.*;

@SpringBootApplication
public class BackendApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}
	
	 
	    
	@Bean
	public CommandLineRunner demo(PlanRepository prepo,
			WeekRepository wrepo,
			TrainingRepository trepo,
			UserRepository urepo,
			ZoneRepository zrepo) {
		return (args) -> {
			
			
			Plan plan = new Plan();
			prepo.save(plan);
			
			Week week0 = new Week();
			week0.setPlan(plan);
			week0.setDescription("starting week");
			
			Week week1 = new Week();
			week1.setPlan(plan);
			week1.setDescription("deload");
			
			Week week2 = new Week();
			week1.setPlan(plan);
			week1.setDescription("loading weight");
		
			
			
			wrepo.save(week0);
			wrepo.save(week1);
			wrepo.save(week2);
			
			Training training0 = new Training();
			training0.setWeek(wrepo.findById(2));
			training0.setType("running");
			training0.setWeekday("mo");
			
			Training training1 = new Training();
			training1.setWeek(wrepo.findById(2));
			training1.setType("weight training");
			training1.setWeekday("fr");
			
			Training training2 = new Training();
			training2.setWeek(wrepo.findById(3));
			training2.setType("running");
			training2.setWeekday("mo");
			
			Training training3 = new Training();
			training3.setWeek(wrepo.findById(3));
			training3.setType("weigth training");
			training3.setWeekday("fr");
			
			Training training4 = new Training();
			training4.setWeek(wrepo.findById(4));
			training4.setType("running");
			training4.setWeekday("mo");
			
			Training training5 = new Training();
			training5.setWeek(wrepo.findById(4));
			training5.setType("weight training");
			training5.setWeekday("we");
			
			Training training6 = new Training();
			training6.setWeek(wrepo.findById(4));
			training6.setType("running");
			training6.setWeekday("fr");
			
			Training training7 = new Training();
			training7.setWeek(wrepo.findById(4));
			training7.setType("bouldering");
			training7.setWeekday("sa");
			
			Training training8 = new Training();
			training8.setWeek(wrepo.findById(4));
			training8.setType("running");
			training8.setWeekday("sa");
			
			trepo.save(training0);
			trepo.save(training1);
			trepo.save(training2);
			trepo.save(training3);
			trepo.save(training4);
			trepo.save(training5);
			trepo.save(training6);
			trepo.save(training7);
			trepo.save(training8);
			
			Zone zone0 = new Zone();
			zone0.setTraining(training3);
			zone0.setLength("3 sets of 6");
			zone0.setType("benchpress");
			
			Zone zone1 = new Zone();
			zone1.setTraining(training3);
			zone1.setLength("3 sets of 6");
			zone1.setType("Squat");
			
			Zone zone2 = new Zone();
			zone2.setTraining(training3);
			zone2.setLength("3 sets of 6");
			zone2.setType("pullupp");
			
			zrepo.save(zone0);
			zrepo.save(zone1);
			zrepo.save(zone2);
			
			
		};
		
		
	}
}
