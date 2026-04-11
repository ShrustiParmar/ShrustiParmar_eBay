# ShrustiParmar_eBay
A repository for the eBay Take-Home Assessment.

---

# ✈️ Flight Booking API – eBay Take-Home Assignment

This project is a Spring Boot REST API developed as part of an eBay take-home assignment.  
It allows clients to book seats on a flight using a known flight number, ensuring that flights cannot be overbooked.

---

## 🚀 Features

- Book seats for a given flight
- In-memory storage (no database used)
- Prevents overbooking using validation and thread-safe logic
- Clean layered architecture (Controller, Service, Model, DTO)
- Proper HTTP status codes:
  - 200 OK → Successful booking
  - 400 Bad Request → Invalid input
  - 404 Not Found → Flight not found
  - 409 Conflict → Overbooking attempt
- JSON-based request handling

---

## 🧠 Tech Stack

- Java 17
- Spring Boot
- Maven
- Postman

---

## ▶️ How to Run the Project

### Prerequisites
- Java 17+
- Maven installed

### Steps

```bash
mvn spring-boot:run
```

Application will start at:

```bash
http://localhost:8080
```
---

## 📌 API Endpoint

### Book Seats

```bash
POST /flights/{flightNumber}/book
```

---

## 📥 Example API Requests

### ✅ Successful Booking

```bash
POST http://localhost:8080/flights/ABC123/book
```

Body:

```json
{
  "seats": 2
}
```

---

## ❌ Invalid Input (400)

```bash
POST http://localhost:8080/flights/ABC123/book
```

Body:

```json
{
  "seats": 0
}
```

---


## ❌ Flight Not Found (404)

```bash
POST http://localhost:8080/flights/XYZ999/book
```
Body:

```json
{
  "seats": 2
}
```

---


## ❌ Overbooking (409)

```bash
POST http://localhost:8080/flights/ABC123/book
```

Body:

```json
{
  "seats": 20
}
```

---


## 📤 Example Responses

### 200 OK

```bash
Booking successful
```

### 400 Bad Request

```bash
Invalid seat count
```
### 404 Not Found

```bash
Flight not found
```

### 409 Conflict

```bash
Not enough seats available
```

---


### 🏗 Project Structure

```bash
flight_booking
 ├── controller
 │    └── FlightController.java
 ├── service
 │    └── FlightService.java
 ├── model
 │    └── Flight.java
 ├── dto
 │    └── BookingRequest.java
 ├── exception
 │    ├── OverbookingException.java
 │    └── GlobalExceptionHandler.java
```

---


## 🤖 AI-Assisted Development (Prompts + Commits)

This project was developed iteratively using AI assistance. Each step includes the prompt and corresponding commit.

## 🔹 Initial Setup

**Prompt:**
```bash
Create a Spring Boot project using Maven with:
- Java 17
- Dependencies: Spring Web, Lombok
- Simple REST controller setup
```

**Commit:**
```bash
Initial Spring Boot project setup with REST controller
Prompt: Create a Spring Boot project using Maven with Java 17, Spring Web, Lombok, and simple REST controller setup
```

---

## 🔹 Create Model

**Prompt:**
```bash
Create a Flight model with flightNumber, capacity, and bookedSeats
```

**Commit:**
```bash
Added Flight model
Prompt: Create a Flight model with flightNumber, capacity, and bookedSeats
```

---

## 🔹 Create Service Layer

**Prompt:**

```bash
Create service layer with in-memory storage and booking logic preventing overbooking
```

**Commit:**
```bash
Added FlightService with booking logic
Prompt: Create service layer with in-memory storage and booking logic preventing overbooking
```

---

## 🔹 Create Controller

**Prompt:**
```bash
Create REST controller with POST endpoint to book seats for a flight
```

**Commit:**
```bash
Added FlightController with booking endpoint
Prompt: Create REST controller with POST endpoint to book seats for a flight
```
---

## 🔹 Improve API Responses

**Prompt:**
```bash
Return meaningful HTTP status codes like 200, 400, 404, 409 for booking API
```

**Commit:**
```bash
Improved API responses with proper HTTP status codes
Prompt: Return meaningful HTTP status codes like 200, 400, 404, 409 for booking API
```
---

## 🔹 Improve API Design (DTO)

**Prompt:**
```bash
Use request body instead of query parameters for booking API
```
**Commit:**
```bash
Improved API to accept JSON request body
Prompt: Use request body instead of query parameters for booking API
```

---

## 🔹 Add Exception Handling

**Prompt:**
```bash
Create custom exception for overbooking scenario and implement global exception handling
```

**Commit:**
```bash
Added exception handling for overbooking
Prompt: Create custom exception for overbooking scenario and implement global exception handling
```

---

## 🛠 Manual Improvements (Final Step)
- Refactored controller to use ResponseEntity
- Improved API design using DTO (BookingRequest)
- Added validation for edge cases
- Improved readability and structure
- Organized project into layers

**Final Commit:**
```bash
Manual improvements:
- Improved API response handling
- Refactored controller for better readability
- Added validation and edge case handling
- Structured project into layers

Known limitations:
- No database (in-memory only)
- No distributed system support
- No authentication
```

---

## ⚠️ Known Limitations

- Uses in-memory storage (data resets on restart)
- No database integration
- No authentication or authorization
- Single instance only (not scalable)

---

## 🔧 Future Improvements

- Add database (MySQL/PostgreSQL)
- Add authentication & authorization
- Add flight retrieval APIs
- Improve scalability and concurrency handling
- Add logging and monitoring

---

# 💡 Notes

This project focuses on correctness, clarity, and clean design within the given time constraint.

---

# 👩‍💻 Author

Shrusti Parmar