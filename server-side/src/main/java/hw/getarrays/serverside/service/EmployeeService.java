package hw.getarrays.serverside.service;

import hw.getarrays.serverside.model.Employee;
import hw.getarrays.serverside.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {
    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee addEmployee(Employee employee) {
        employee.setEmployeeCode(UUID.randomUUID().toString());
        System.out.println( "000" + UUID.randomUUID().toString());
        return employeeRepository.save(employee);
    }

     public List<Employee> findAllEmployees() {
        return  employeeRepository.findAll();
     }

     public Employee updateEmployee(Employee employee) {
         return employeeRepository.save(employee);
     }

     public void deleteEmployee(Long id) {
            employeeRepository.deleteById(id);
     }
}
