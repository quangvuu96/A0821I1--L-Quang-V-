package case_study.services.Impl;

import case_study.models.Customer;
import case_study.services.CustomerService;

import java.util.List;
import java.util.Optional;

public class CustomerServiceImpl implements CustomerService {
    @Override
    public void save(Customer customer) {

    }

    @Override
    public List<Customer> getAll() {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Optional<Customer> get(int id) {
        return Optional.empty();
    }
}
