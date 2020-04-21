package dmacc.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
//import all
import javax.persistence.*;


@Entity
@Table(name="student")
public class Student implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String firstname;
	private String lastname;
	
	@OneToMany(mappedBy = "student", fetch = FetchType.LAZY)
	private List<Vehicle> vehicle = new ArrayList<>();


	public Student() {
		super();
	}

	public Student(String firstname, String lastname, List<Vehicle> vehicle) {
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

	public List<Vehicle> getVehicle() {
		return vehicle;
	}

	public void setVehicle(List<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", vehicle=" + vehicle
				+ "]";
	}

	
	
}
