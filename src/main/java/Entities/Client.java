package Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Client {

	@Id	
	@GeneratedValue
	public Long id;

	public String field;

}
