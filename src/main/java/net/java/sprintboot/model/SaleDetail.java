package net.java.sprintboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "SaleDetail")
@Data
@NoArgsConstructor
public class SaleDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Integer id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_sale", referencedColumnName = "id", nullable = false, foreignKey = @ForeignKey(name = "FK_Sale_SaleDetail"))
	private Sale sale;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_product", referencedColumnName = "id", nullable = false, foreignKey = @ForeignKey(name = "FK_Product_SaleDetail"))
	private Product product;
	
	@Column(name = "quantity", nullable = false)
	private Integer quantity;
}
