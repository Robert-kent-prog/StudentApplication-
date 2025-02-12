# Student Management API

A RESTful CRUD API built with Spring Boot and MongoDB for managing student data.

## Features
- Create, read, update, and delete student records.
- Custom exception handling for robust error responses.
- Integrated with MongoDB for flexible and scalable storage.

## Technologies
- **Spring Boot**: For building the backend API.
- **MongoDB**: As the NoSQL database for storing student data.
- **Java**: Programming language used for development.
- **Maven**: Build tool for dependency management.

## File Structure
- `model/Student.java`: Defines the student entity.
- `repository/StudentRepository.java`: Handles database interactions.
- `service/StudentApplication.java`: Implements business logic.
- `exception/`: Contains custom exception classes and handlers.

## Endpoints
| Method | Endpoint          | Description                          |
|--------|-------------------|--------------------------------------|
| POST   | `/students`       | Create a new student record.         |
| GET    | `/students/{id}`  | Retrieve a student by ID.            |
| GET    | `/students`       | List all students.                   |
| PUT    | `/students/{id}`  | Update an existing student record.   |
| DELETE | `/students/{id}`  | Delete a student record by ID.       |

## How to Run
1. Clone the repository.
2. Install dependencies using `mvn install`.
3. Start the application with `mvn spring-boot:run`.
4. Test the API using tools like Postman or cURL.

---

This description is concise, highlights the key aspects of your project, and provides enough detail for others to understand its purpose and functionality. Let me know if you'd like further refinements! 😊
