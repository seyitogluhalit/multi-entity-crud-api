# Multi Entity CRUD API

A simple and well-structured **Spring Boot REST API** project that demonstrates CRUD operations across multiple entities such as `Student`, `Employee`, `Customer`, and `Home`.

---

## 🚀 Technologies Used

- Java 17
- Spring Boot 3.x
- Spring Data JPA
- Hibernate
- PostgreSQL
- Lombok
- Jakarta Validation
- BeanUtils (for DTO mapping)

---

## 📦 Entities Covered

- **Student** (with course relationships)
- **Employee** (with department info)
- **Customer** (with address)
- **Home** (with rooms)

---

## 📄 Features

- 🔄 Full CRUD operations (Create, Read, Update, Delete)
- ✅ Input validation using `@Valid` annotations
- 📦 DTO usage for clean API structure
- 🧠 Global Exception Handling via `@ControllerAdvice`
- 🔗 Entity Relationships:
  - `@ManyToOne`
  - `@ManyToMany`
- 🧩 Service Layer abstraction
- 🧹 Clean architecture & package structure

---

## 📁 Project Structure

src
└── main
    └── java
        └── com.syitogluhalit.demo
            ├── controller
            │   ├── impl
            │   │   ├── AddressControllerImpl.java
            │   │   ├── CustomerControllerImpl.java
            │   │   ├── EmployeeControllerImpl.java
            │   │   ├── HomeControllerImpl.java
            │   │   └── StudentControllerImpl.java
            │   ├── IAddressController.java
            │   ├── ICustomerController.java
            │   ├── IEmployeeController.java
            │   ├── IHomeController.java
            │   └── IStudentController.java
            │
            ├── dto
            │   ├── DtoAddress.java
            │   ├── DtoCourse.java
            │   ├── DtoCustomer.java
            │   ├── DtoDepartment.java
            │   ├── DtoEmployee.java
            │   ├── DtoHome.java
            │   ├── DtoRoom.java
            │   ├── DtoStudent.java
            │   └── DtoStudentIU.java
            │
            ├── entities
            │   ├── Address.java
            │   ├── Course.java
            │   ├── Customer.java
            │   ├── Department.java
            │   ├── Employee.java
            │   ├── Home.java
            │   ├── Room.java
            │   └── Student.java
            │
            ├── exception
            │   ├── ApiError.java
            │   └── GlobalExceptionHandler.java
            │
            ├── repository
            │   ├── AddressRepository.java
            │   ├── CustomerRepository.java
            │   ├── EmployeeRepository.java
            │   ├── HomeRepository.java
            │   └── StudentRepository.java
            │
            ├── services
            │   ├── impl
            │   │   ├── AddressServiceImpl.java
            │   │   ├── CustomerServiceImpl.java
            │   │   ├── EmployeeServiceImpl.java
            │   │   ├── HomeServiceImpl.java
            │   │   └── StudentServiceImpl.java
            │   ├── IAddressService.java
            │   ├── ICustomerService.java
            │   ├── IEmployeeService.java
            │   ├── IHomeService.java
            │   └── IStudentService.java
            │
            └── DemoApplication.java



---

## ▶️ How to Run

```bash
./mvnw spring-boot:run


🔧 Database Configuration (application.properties)
Make sure your PostgreSQL is running and that the required tables exist (student, course, employee, etc.).

spring.datasource.url=jdbc:postgresql://localhost:5432/postgres
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update



💡 Future Improvements
📘 Add Swagger UI for API documentation

🔐 Integrate Spring Security & JWT authentication

🧪 Add unit and integration tests

🧰 Add Postman collection or Swagger examples

🖥️ Develop a minimal frontend (React or Thymeleaf)

👨‍💻 Author
Halit Onur Seyitoğlu
📧 shalitonur@gmail.com
🎓 Computer Engineering @ Adana Alparslan Türkeş Science and Technology University
🌍 GitHub: seyitogluhalit

🏷️ License
This project is open source and available under the MIT License.

