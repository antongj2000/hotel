package Entities;

import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.ManyToOne;

@Entity
public class Hotel {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hotel_seq")
	private Long id;
	private String name;

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
		return "Hotel " + name;
	}
	
	   @OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL, orphanRemoval = true)
	    private List<Room> rooms;

	   @OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL, orphanRemoval = true)
	    private List<Reservation> reservations;
	

}
