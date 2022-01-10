package Goljat.backend.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import Goljat.backend.domain.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Training {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	private Week week;
	
	@OneToMany(mappedBy="training")
	List<Zone> zones = new ArrayList<>();
	
	private String type;
	
	private String weekday;

}
