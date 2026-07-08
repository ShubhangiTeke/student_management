# Student Management System

## Overview

The Student Management System is a Java console application developed using JDBC and MySQL. It provides a simple way to manage student records by performing CRUD (Create, Read, Update, Delete) operations. The project follows the DAO (Data Access Object) design pattern to separate business logic from database operations.

## Features

- Add a new student
- View all students
- Search a student by ID
- Update student information
- Delete a student record
- MySQL database integration using JDBC
- DAO-based architecture

## Technologies Used

- Java 11
- JDBC
- MySQL
- Maven
- Spring Tool Suite (STS)

## Project Structure

```
demo03db
│── src
│   └── main
│       ├── java
│       │   └── demo03db
│       │       ├── DbUtil.java
│       │       ├── Program.java
│       │       ├── Student.java
│       │       ├── StudentDao.java
│       │       └── StudentDaoImpl.java
│       └── resources
│
├── pom.xml
└── README.md
```

## Prerequisites

- Java JDK 11 or later
- MySQL Server
- Spring Tool Suite (STS) or Eclipse
- Maven

## Database Configuration

Update the database credentials in `DbUtil.java`.

```java
DB_URL = "jdbc:mysql://localhost:3306/test";
DB_USER = "root";
DB_PASSWORD = "your_password";
```

Ensure the required database and tables are created before running the application.

## How to Run

1. Clone the repository.
2. Open the project in Spring Tool Suite (STS).
3. Update the database credentials in `DbUtil.java`.
4. Create the MySQL database.
5. Run `Program.java`.

## Future Enhancements

- User authentication
- Input validation
- Exception handling improvements
- Student attendance management
- Export records to CSV or PDF

## Author

Shubhangi Teke
