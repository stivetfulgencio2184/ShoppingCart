package net.java.sprintboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Client")
@Data
@NoArgsConstructor
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Integer id;
	
	@Column(name = "names", nullable = false)
	private String names;
	
	@Column(name = "surnames", nullable = false)
	private String surnames;
	
	@Column(name = "dni", nullable = false)
	private String dni;
	
	@Column(name = "phone")
	private String phone;
	
	@Column(name = "email")
	private String email;
}
