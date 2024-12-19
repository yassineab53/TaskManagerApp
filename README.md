# Spring Boot Task Manager

A robust and secure Task Manager application built with Spring Boot, Thymeleaf, and Spring Security. This app enables users to efficiently manage tasks with features like task creation, assignment, and progress tracking, along with user authentication and account management.


## Features

- **CRUD Operations**: Users can create, read, update, and delete tasks.
- **Account Creation**: New users can register and create their accounts.
- **User Authentication**: Secure login functionality using Spring Security.
- **Password Hashing**: User passwords are securely hashed for storage.
- **Thymeleaf Templating**: Frontend views are rendered using Thymeleaf templates.

## Technologies Used

- **Spring Boot**: Framework for creating standalone, production-grade Spring-based applications.
- **Thymeleaf**: Modern server-side Java template engine for web and standalone environments.
- **Spring Security**: Powerful and customizable authentication and access control framework.
- **Spring Data JPA**: Simplifies data access and persistence using the Java Persistence API.
- **Hibernate**: Object-relational mapping tool for the Java programming language.
- **MySQL/PostgreSQL/H2 Database**: Choose your preferred relational database for storage.

## Getting Started

### Prerequisites

- Java JDK (8 or higher)
- Maven
- Your preferred IDE (IntelliJ IDEA, Eclipse, etc.)
- MySQL/PostgreSQL/H2 Database (Make sure you have it installed and running)

### Installation

1. Clone this repository:

   ```bash
   git clone https://github.com/yassineab53/TaskManagerApp
   ```

2. Navigate to the project directory:

   ```bash
   cd TaskManagerApp
   ```

3. Update `application.properties` with your database configuration:

   ```properties
   server.port=8085
   spring.datasource.url=jdbc:mysql://localhost:3306/task-db?createDatabaseIfNotExist=true
   pring.datasource.username=root
   spring.datasource.password=root
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
   spring.jpa.show-sql=true
   ```

4. Build the project:

   ```bash
   mvn clean package
   ```

5. Run the application

6. Open your browser and visit `http://localhost:8085` to access the application.

## Usage

1. **Create an Account**: Click on the "Sign Up" link to register and create your account.
2. **Login**: After creating an account, log in with your credentials.
3. **Manage Tasks**: Add, edit, delete tasks from your task manager.

## Contributing

Contributions are welcome! Please feel free to open an issue or submit a pull request.

