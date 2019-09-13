package fr.formation.inti.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/*@Entity
@Table(name="DEPARTMENT")*/
public class Departement /*implements Serializable*/{
	private int dept_id;
	private String name;
//	private List<Employee> employees = new ArrayList();
	
	
	// get et set
	/*@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="DEPT_ID")*/
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "dept_id")
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	public List<Employee> getEmployees() {
//		return employees;
//	}
//	public void setEmployees(List<Employee> employees) {
//		this.employees = employees;
//	}
}