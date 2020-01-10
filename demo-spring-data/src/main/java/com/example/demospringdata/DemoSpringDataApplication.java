package com.example.demospringdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class DemoSpringDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringDataApplication.class, args);
	}

}

@Entity
class Todo {

	@Id
	String todo;

	public Todo() {
	}

	public Todo(String todo) {
		this.todo = todo;
	}

	public String getTodo() {
		return todo;
	}

	public void setTodo(String todo) {
		this.todo = todo;
	}

}
