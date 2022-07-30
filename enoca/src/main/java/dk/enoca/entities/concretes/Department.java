package dk.enoca.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="departments")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","employees"})
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="department_id")
	private int id;
	
	@Column(name="department_name")
	private String dep_name;

	@OneToMany(mappedBy = "department")
	private List<Employee> employees;

	public Department() {}
	
	public Department(int id, String dep_name) {
		super();
		this.id = id;
		this.dep_name = dep_name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDep_name() {
		return dep_name;
	}
	public void setDep_name(String dep_name) {
		this.dep_name = dep_name;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
}
