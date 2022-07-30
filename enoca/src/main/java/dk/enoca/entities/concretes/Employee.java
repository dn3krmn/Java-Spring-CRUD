package dk.enoca.entities.concretes;

import javax.persistence.*;

@Entity
@Table(name="employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="employee_id")
    private int id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="salary")
    private String salary;

    //@Column(name="department_id")
   // private int department_id;

    @ManyToOne()
    @JoinColumn(name="department_id")
    private Department department;

    //no-args constructor
    public Employee() {}

    public Employee(int id, String firstName, String lastName, String salary, Department department) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.department = department;
    }

    public int getId() { return id; }

    public void setEmp_id(int emp_id) {this.id = id;}

    public String getFirst_name() {return firstName;}

    public void setFirst_name(String first_name) {this.firstName = first_name;}

    public String getLast_name() {return lastName;}

    public void setLast_name(String last_name) {this.lastName = last_name;}

    public String getSalary() {return salary;}

    public void setSalary(String salary) {this.salary = salary;}

    //public int getDepartment_id() {return department_id;}

    //public void setDepartment_id(int department_id) {this.department_id = department_id;}

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
