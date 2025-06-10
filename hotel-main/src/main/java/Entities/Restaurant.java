package Entities;


import io.quarkus.hibernate.orm.panache.PanacheEntity;

import jakarta.persistence.Entity;


@Entity
public class Restaurant extends PanacheEntity {

	private String name;

	public Restaurant() {
	}

	public Restaurant(String name) {
		super();
		this.name = name;
	}

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

	@Override
	public String toString() {
		return "Restaurant [id=" + id + ", name=" + name + "]";
	}

	

}
