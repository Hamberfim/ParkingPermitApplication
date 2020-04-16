package dmacc.beans;

import java.util.Set;
//import all
import javax.persistence.*;


@Entity
@Table(name="student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String firstname;
	private String lastname;
	
	@OneToMany(mappedBy = "student", fetch = FetchType.LAZY)
	private Set<Vehicle> vehicle;

	public Student() {
		super();
	}

	public Student(String firstname, String lastname, Set<Vehicle> vehicle) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.vehicle = vehicle;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Set<Vehicle> getVehicle() {
		return vehicle;
	}

	public void setVehicle(Set<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", vehicle=" + vehicle
				+ "]";
	}
	
}
