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
@Table(name = "Sale")
@Data
@NoArgsConstructor
public class SaleDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Integer id;
	
	@Column(name = "id_sale", nullable = false)
	private Integer id_sale;
	
	@Column(name = "id_product", nullable = false)
	private Integer product;
	
	@Column(name = "quantity", nullable = false)
	private Integer quantity;
}
