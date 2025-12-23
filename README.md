# Spring Boot REST API – Basic GET Controllers

## 📌 Overview

This project is a **basic Spring Boot REST API** demonstrating how to create and expose **HTTP GET endpoints** using `@RestController`. It is designed to showcase foundational Spring Boot concepts such as request mapping, query parameters, and running APIs on an embedded server.

The application contains **two REST controllers** and is suitable as a **starter project**, **learning reference**, or **resume-level demonstration** of Spring Boot fundamentals.

---

## 🚀 Key Features

* Spring Boot RESTful application
* Two GET endpoints
* Request handling using `@GetMapping`
* Query parameter support with `@RequestParam`
* Embedded Tomcat server (runs on `localhost:8080`)
* Clean and simple project structure

---

## 🛠️ Technology Stack

* **Java**
* **Spring Boot**
* **Spring Web (REST)**
* **Maven**

---

## 📂 Project Structure

```
src/main/java
└── com/codewith/basic-getController
    ├── Basic_GetControllerApplication.java
    └── Controller
        ├── HelloController.java
        └── NewOrderController.java
```

---

## 📖 API Endpoints

### 🔹 1. Hello API

Returns a simple greeting message to verify that the application is running.

**Endpoint**

```
GET /
```

**Response**

```
Hello From Controller
```

---

### 🔹 2. New Order API

Accepts an item name as a request parameter and returns an order confirmation message.

**Endpoint**

```
GET /order?item={itemName}
```

**Example Request**

```
http://localhost:8080/order?item=Laptop
```

**Response**

```
Your order Laptop has been delivered
```

---

## ▶️ Running the Application

### Prerequisites

* Java installed
* Maven installed

### Steps

1. **Clone the repository**

```bash
git clone <repository-url>
```

2. **Navigate to the project directory**

```bash
cd project-folder
```

3. **Run the application**

```bash
mvn spring-boot:run
```

4. **Access the APIs**

* [http://localhost:8080/](http://localhost:8080/)
* [http://localhost:8080/order?item=Book](http://localhost:8080/order?item=Book)

---

## 🧠 Key Concepts Demonstrated

* REST controller creation using `@RestController`
* Handling HTTP GET requests with `@GetMapping`
* Passing query parameters using `@RequestParam`
* Running Spring Boot applications locally

---

## 🔮 Possible Enhancements

* Add POST, PUT, DELETE APIs
* Introduce Service layer for business logic
* Return JSON responses using DTOs
* Add Swagger/OpenAPI documentation
* Implement validation and global exception handling
* Add unit tests

---

## 👨‍💻 Author

**Ashish Deo Pandey**
Java Developer (3+ Years Experience)

---

## 📄 License

This project is intended for learning and demonstration purposes.
