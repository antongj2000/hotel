package Entities;

import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.ManyToOne;

@Entity
public class Hotel {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hotel_seq")
	private Long id;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String location;

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
	
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Hotel " + name + ", lokacija: "+location;
	}
	
	
	
	   @OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL, orphanRemoval = true)
	    private List<Room> rooms;

	   @OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL, orphanRemoval = true)
	    private List<Reservation> reservations;
	
	   @ManyToMany
	   @JoinTable(
	       name = "hotel_service",
	       joinColumns = @JoinColumn(name = "hotel_id"),
	       inverseJoinColumns = @JoinColumn(name = "service_id")
	   )
	   private List<Service> services;

}
