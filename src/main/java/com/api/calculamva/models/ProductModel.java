package com.api.calculamva.models;

import java.time.LocalDateTime;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_PRODUCT")
public class ProductModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String description;
	@Column(nullable = false)
	private LocalDateTime registrationDate;
	@Column(nullable = false)
	private double unitaryValue;
	
	
	/* Constructor */
	
	public ProductModel() {
		super();
	}


	public ProductModel(Long id, String name, String description, LocalDateTime registrationDate, double unitaryValue) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.registrationDate = registrationDate;
		this.unitaryValue = unitaryValue;
	}

	/* Accessor Methods */

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public LocalDateTime getRegistrationDate() {
		return registrationDate;
	}


	public void setRegistrationDate(LocalDateTime registrationDate) {
		this.registrationDate = registrationDate;
	}


	public double getUnitaryValue() {
		return unitaryValue;
	}


	public void setUnitaryValue(double unitaryValue) {
		this.unitaryValue = unitaryValue;
	}


	@Override
	public String toString() {
		return "ProductModel [id=" + id + ", name=" + name + ", description=" + description + ", registrationDate="
				+ registrationDate + ", unitaryValue=" + unitaryValue + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(description, id, name, registrationDate, unitaryValue);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductModel other = (ProductModel) obj;
		return Objects.equals(description, other.description) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name) && Objects.equals(registrationDate, other.registrationDate)
				&& Double.doubleToLongBits(unitaryValue) == Double.doubleToLongBits(other.unitaryValue);
	}
	
	
	
	
}
