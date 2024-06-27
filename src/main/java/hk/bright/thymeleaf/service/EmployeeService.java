package hk.bright.thymeleaf.service;

import hk.bright.thymeleaf.model.Employee;
import org.springframework.data.domain.Page;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployee();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(Long id);
    void deleteEmployeeById(Long id);
    Page<Employee> findPaginatedd(int pageNo,int pageSize,String sortField,String sortDirection);
}
