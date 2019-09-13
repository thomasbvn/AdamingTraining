package fr.formation.inti.entities;

//import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.ForeignKey;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="Employee")
/* penser à mettre les @column sur chaque colonne */
public class Employee /*implements Serializable*/{
	
	private  int emp_id;
	private Date end_date;
	private String last_name;
	private String firs_name;
	private Date start_date;
	private String title;
	private Departement departement;
	private Employee manager;
	private Set<Employee> employees = new HashSet();
	public SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	
	//constructeur
	public Employee(int emp_id, Date end_date, String last_name, String firs_name, Date start_date, String title,
			Departement departement, Employee manager, Set<Employee> employees, SimpleDateFormat sdf) {
		super();
		this.emp_id=emp_id;
		this.end_date = end_date;
		this.last_name = last_name;
		this.firs_name = firs_name;
		this.start_date = start_date;
		this.title = title;
		this.departement = departement;
		this.manager = manager;
		this.employees = employees;
		this.sdf = sdf;
	}
	
	public Employee(){
	}

	// methode 
	
	public String toString() {
		return "Employee [emp_id = "emp_id +", end_date = "+end_date+", last_name=" + last_name + ", firs_name=" + firs_name
				+ ", start_date=" + start_date + ", title=" + title + ", departement=" + departement + ", manager="
				+ manager + ", sdf=" + sdf + "]";
	}
	
	// getters et setters
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="EMP_ID")
	public  int getEmp_id() {
		return emp_id;
	}
	public  void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	
	@Column(name="End_Date")
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	
	@Column(name="Last_Name")
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	@Column(name="Firs_Name")
	public String getFirs_name() {
		return firs_name;
	}
	public void setFirs_name(String firs_name) {
		this.firs_name = firs_name;
	}
	
	@Column(name="Start_date")
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	
	@Column(name="Title")
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "DEPT_ID", nullable = true, foreignKey = @ForeignKey(name = "EMPLOYEE_DEPARTMENT_FK"))
	public Departement getDepartement() {
		return departement;
	}
	public void setDepartement(Departement departement) {
		this.departement = departement;
	}
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="SUPERIOR_EMP_ID")
	public Employee getManager() {
		return manager;
	}

	public void setManager(Employee manager) {
		this.manager = manager;
	}
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy = "manager")
	//@JoinColumn(name="EMP_ID",mapped by manager)
	public Set<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

	
}
