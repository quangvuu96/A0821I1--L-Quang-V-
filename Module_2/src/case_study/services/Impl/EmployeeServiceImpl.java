package case_study.services.Impl;

import case_study.models.Employee;
import case_study.services.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeeServiceImpl implements EmployeeService {
    static List<Employee> employees = new ArrayList<>();
    @Override
    public void save(Employee employee) {

    }

    @Override
    public List<Employee> getAll() {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Optional<Employee> get(int id) {
        return Optional.empty();
    }
}
