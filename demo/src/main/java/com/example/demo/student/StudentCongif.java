//package com.example.demo.student;
//
//import org.springframework.beans.factory.annotation.Configurable;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.time.LocalDate;
//import java.time.Month;
//import java.util.ArrayList;
//import java.util.List;
//
//@Configuration
//public class StudentCongif {
//
//    @Bean
//    CommandLineRunner commandLineRunner(StudentRepository repository) {
//        return args -> {
//            List<Student> studentList = new ArrayList<>();
//            Student marco = new Student(
//                        "Marco",
//                        "marco.rossi@gmail.com",
//                        LocalDate.of(1998, Month.AUGUST,25));
//            Student francesco = new Student(
//                    "Francesco",
//                    "francesco.bianchi@gmail.com",
//                    LocalDate.of(1980, Month.AUGUST,12));
//
//            studentList.add(marco);
//            studentList.add(francesco);
//            repository.saveAll(studentList);
//        };
//    }
//}
