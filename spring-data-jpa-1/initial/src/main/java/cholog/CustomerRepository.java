package cholog;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer,Long> {

    List<Customer> findByLastNameIgnoreCase(String lastName);

    List<Customer> findByLastNameOrderByFirstNameDesc(String firstName);

    List<Customer> findByLastName(String lastName);
}
