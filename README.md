# Bookverse
Short Project Description (one-paragraph) A Spring Boot RESTful Bookstore API that demonstrates basic CRUD operations for managing Book entities (id, title, author, price, publishedDate). Built with Spring Boot, Spring Data JPA and Maven, it includes  logging, and configuration for MySQL. Ideal as a learning project for a simple backend service.

# Book — Spring Boot Bookstore REST API

A simple RESTful API for managing books built with Spring Boot and Spring Data JPA.  
This project demonstrates CRUD operations on a `Book` entity and includes unit tests, example configuration, and basic logging and actuator support.

---

## Features

- CRUD endpoints for `Book` resource
- Uses Spring Boot and Spring Data JPA (Maven)
- MySQL datasource configuration (example)
- Unit tests (JUnit + Mockito)
- Logging and Spring Actuator endpoints enabled
- Sample project structure suitable for extension

---

## Tech stack

- Java 17+ (compatible with Spring Boot 3.x)
- Spring Boot 3.x
- Spring Data JPA
- MySQL (example configuration)
- Maven (build)
- JUnit 5 + Mockito (tests)

---

## Quick Start / Prerequisites

- Java 17 or newer
- Maven 3.6+
- MySQL server (or change to H2/in-memory for development)
- (Optional) Docker

---

API Endpoints

Base path: /books

List all books :
GET /books


Get a book by id : 
GET /books/{id}

Create a new book :
POST /books
Content-Type: application/json

{
  "id": 1,
  "title": "Effective Java",
  "author": "Joshua Bloch",
  "price": 499.99,
  "publishedDate": "2018-01-06"
}

Delete a book: 
DELETE /books/{id}


Data model

Book entity fields:

id (Long) — identifier

title (String)

author (String)

price (BigDecimal)

publishedDate (LocalDate)

Book/
├─ src/main/java/bookstore/
│  ├─ controller/BookController.java
│  ├─ service/BookService.java
│  ├─ repository/BookRepository.java
│  └─ entity/Book.java
├─ src/main/resources/application.properties
├─ src/test/java/...
├─ pom.xml



