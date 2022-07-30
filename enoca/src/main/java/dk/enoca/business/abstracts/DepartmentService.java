package dk.enoca.business.abstracts;

import java.util.List;

import dk.enoca.core.utilities.results.DataResult;
import dk.enoca.core.utilities.results.Result;
import dk.enoca.entities.concretes.Department;

public interface DepartmentService {

	//List<Department> getAll();
	DataResult<List<Department>> getAll();

	//veri eklemek için
	//Department add(Department department);
	Result add(Department department);

	//güncellemek için
	Result update(Department department);

	//silmek için
	Result delete(Department department);
}
