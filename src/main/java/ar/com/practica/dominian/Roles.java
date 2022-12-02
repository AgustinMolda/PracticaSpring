package ar.com.practica.dominian;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "roles")
public class Roles {
	
	@Id
	private Long id;
	
	@Column(name = "role",length = 50,nullable = false, unique = true)
	private String role;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "user_roles")
	private Set<Roles> roles;
	
}
