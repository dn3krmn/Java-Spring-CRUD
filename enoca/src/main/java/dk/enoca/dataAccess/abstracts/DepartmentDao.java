package dk.enoca.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import dk.enoca.entities.concretes.Department;

public interface DepartmentDao extends JpaRepository<Department,Integer>{

}
