package dk.enoca.business.concretes;

import dk.enoca.business.abstracts.EmployeeService;
import dk.enoca.core.utilities.results.DataResult;
import dk.enoca.core.utilities.results.Result;
import dk.enoca.core.utilities.results.SuccessDataResult;
import dk.enoca.core.utilities.results.SuccessResult;
import dk.enoca.dataAccess.abstracts.EmployeeDao;
import dk.enoca.entities.concretes.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeManager implements EmployeeService {

    private EmployeeDao employeeDao;

    @Autowired
    public EmployeeManager(EmployeeDao employeeDao) {
        super();
        this.employeeDao = employeeDao;
    }

    @Override
    public DataResult<List<Employee>> getAll() {
        return new SuccessDataResult<List<Employee>>(this.employeeDao.findAll(),"Çalışanlar Listelendi.");
    }

    @Override
    public Result add(Employee employee) {
        this.employeeDao.save(employee);
        return new SuccessResult("Çalışan eklendi.");
    }

    @Override
    public Result update(Employee employee) {
        this.employeeDao.save(employee);
        return new SuccessResult("Güncelleme başarılı!");
    }

    @Override
    public Result delete(int id) {
        employeeDao.deleteById(id);
        return new SuccessResult("Silindi!");
    }

}
