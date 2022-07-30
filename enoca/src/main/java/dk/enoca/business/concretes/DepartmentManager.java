package dk.enoca.business.concretes;

import java.util.List;

import dk.enoca.core.utilities.results.DataResult;
import dk.enoca.core.utilities.results.Result;
import dk.enoca.core.utilities.results.SuccessDataResult;
import dk.enoca.core.utilities.results.SuccessResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dk.enoca.business.abstracts.DepartmentService;
import dk.enoca.dataAccess.abstracts.DepartmentDao;
import dk.enoca.entities.concretes.Department;

@Service
public class DepartmentManager implements DepartmentService{

	private DepartmentDao departmentDao;
	
	@Autowired
	public DepartmentManager(DepartmentDao departmentDao) {
		super();
		this.departmentDao = departmentDao;
	}

	@Override
	public DataResult<List<Department>> getAll() {
		
		return new SuccessDataResult<List<Department>>(this.departmentDao.findAll(),"Departmentlar Listelendi.");

	}

	@Override
	public Result add(Department department) {
		this.departmentDao.save(department);
		return new SuccessResult("Department eklendi.");
	}

	@Override
	public Result update(Department department) {
		//Department depart = departmentDao.findById(department.getId()).orElse(null);
		//depart.setDep_name(department.getDep_name());
		//this.departmentDao.save(depart);
		this.departmentDao.save(department);
		return new SuccessResult("Güncelleme başarılı");
	}

	@Override
	public Result delete(Department department) {
		departmentDao.deleteById(department.getId());
		return new SuccessResult("Silme Başarılı!");
	}



}
