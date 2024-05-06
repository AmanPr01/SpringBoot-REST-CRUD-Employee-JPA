package dev.aman.cruddemo.dao;

import dev.aman.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // that's it.....no need to write any code LOL!
    // it's all the beauty of Spring Data JPA
}
