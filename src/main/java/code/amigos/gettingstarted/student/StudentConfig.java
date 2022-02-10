package code.amigos.gettingstarted.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepo) {
        return args -> {
            Student jan = new Student(
                    "Jan Kowalski",
                    "jankowalski@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 1)
            );
            Student zbigniew = new Student(
                    "Zbigniew Młyński",
                    "zbysiu@gmail.com",
                    LocalDate.of(1990, Month.APRIL, 21)
            );

            studentRepo.saveAll(
                    List.of(jan, zbigniew)
            );
        };
    }

}
