package co2103.hw2.repo;


import org.springframework.data.repository.CrudRepository;

import co2103.hw2.model.Customers;

public interface CustomersRepository extends CrudRepository<Customers, Integer> {

}
