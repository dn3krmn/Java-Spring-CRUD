package dk.enoca.business.abstracts;

import dk.enoca.core.utilities.results.DataResult;
import dk.enoca.core.utilities.results.Result;
import dk.enoca.entities.concretes.Employee;

import java.util.List;

public interface EmployeeService {
    //listelemek için
    DataResult<List<Employee>> getAll();
    //ekleme işlemi için
    Result add(Employee employee);

    //güncellemek için
    Result update(Employee employee);

    //silmek için
    Result delete(int id);

}
