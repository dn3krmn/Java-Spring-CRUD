package dk.enoca.api.controller;

import java.util.List;

import dk.enoca.core.utilities.results.DataResult;
import dk.enoca.core.utilities.results.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import dk.enoca.business.abstracts.DepartmentService;
import dk.enoca.entities.concretes.Department;

@RestController
@RequestMapping("/api/departments")
public class DepartmentsController {

	private DepartmentService departmentService;

	@Autowired
	public DepartmentsController(DepartmentService departmentService) {
		super();
		this.departmentService = departmentService;
	}

	@GetMapping("/getall")
	public DataResult<List<Department>> getAll(){
		return this.departmentService.getAll();
	}

	@PostMapping("/add")
	public Result add(@RequestBody Department department){
		return this.departmentService.add(department);
	}

	@PutMapping("/update")
	public Result update(@RequestBody Department department){
		return this.departmentService.update(department);
	}

	@DeleteMapping("/delete")
	public Result delete(@RequestBody Department department) {
		return this.departmentService.delete(department);
	}

}
