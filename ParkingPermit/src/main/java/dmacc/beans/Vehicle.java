package dmacc.beans;

import java.io.Serializable;

//import all
import javax.persistence.*;

@Entity
@Embeddable
@Table(name="vehicles")
public class Vehicle implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String make;
	private String model;
	private String color;
	private String platenumber;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name="studentid")
	private Student student;

	public Vehicle() {
		super();
	}

	public Vehicle(String make, String model, String color, String platenumber, Student student) {
		super();
		this.make = make;
		this.model = model;
		this.color = color;
		this.platenumber = platenumber;
		this.student = student;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPlatenumber() {
		return platenumber;
	}

	public void setPlatenumber(String platenumber) {
		this.platenumber = platenumber;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", make=" + make + ", model=" + model + ", color=" + color + ", platenumber="
				+ platenumber + ", student=" + student + "]";
	}

}
