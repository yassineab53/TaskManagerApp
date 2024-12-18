package net.yassine.taskmanagerapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TaskManagerAppApplication {

    public static void main(String[] args) {

        SpringApplication.run(TaskManagerAppApplication.class, args);
        System.out.println("test");
    }

}
