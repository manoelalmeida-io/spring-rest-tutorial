package payroll;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase (EmployeeRepository employeeRepository, OrderRepository orderRepository) {

        employeeRepository.save(new Employee("Bilbo","Baggins", "Burglar"));
        employeeRepository.save(new Employee("Frodo","Baggins", "Thief"));

        orderRepository.save(new Order("MacBook Pro", Status.COMPLETED));
        orderRepository.save(new Order("iPhone", Status.IN_PROGRESS));

        return args -> {
            employeeRepository.findAll().forEach(order -> {
                log.info("Preloaded " + order);
            });

            orderRepository.findAll().forEach(order -> {
                log.info("Preloaded " + order);
            });
        };
    }
}
