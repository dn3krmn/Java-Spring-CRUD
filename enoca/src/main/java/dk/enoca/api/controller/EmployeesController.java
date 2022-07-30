package dk.enoca.api.controller;

import dk.enoca.business.abstracts.EmployeeService;
import dk.enoca.core.utilities.results.DataResult;
import dk.enoca.core.utilities.results.Result;
import dk.enoca.entities.concretes.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeesController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeesController(EmployeeService employeeService) {
        super();
        this.employeeService = employeeService;
    }

    @GetMapping("/getall")
    public DataResult<List<Employee>> getAll(){
        return this.employeeService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Employee employee){
        return this.employeeService.add(employee);
    }

    @PutMapping("/update")
    public Result update(@RequestBody Employee employee){
        return this.employeeService.update(employee);
    }

    @DeleteMapping("/delete")
    public Result delete(@RequestParam int id) {
        return this.employeeService.delete(id);
    }
}
