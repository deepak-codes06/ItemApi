# Item API – Spring Boot REST Application

This is a simple Java backend REST API built using **Spring Boot** to manage a collection of items.  
The application uses an **in-memory data store (ArrayList)** and demonstrates basic REST operations with proper layered architecture.

---

## 🌐 Live Demo

**Deployed URL:**  
https://itemapi-u3bp.onrender.com

---

## 📌 Features Implemented

- Add a new item
- Get item by ID
- Input validation
- In-memory storage
- Clean project structure (Controller → Service → Store → Model)
- Global exception handling
- Dockerized and deployed on Render

---

## 🧱 Project Structure
controller → REST endpoints
service → Business logic
store → In-memory data store (ArrayList)
model → Item class
exception → Global exception handler



---

## 🚀 API Endpoints

### ➤ Add Item

**POST** `/items`

Request Body:
```json
{
  "id": 1,
  "name": "Laptop",
  "description": "Gaming Laptop"
}


➤ Get Item By ID

GET /items/{id}

Example:
/items/1



🛠️ How to Run Locally
Prerequisites:
Java 17
Maven

Steps:
git clone https://github.com/deepak-codes06/ItemApi.git
cd ItemApi
mvn clean install
mvn spring-boot:run

App runs on:
http://localhost:8080


🐳 Docker Deployment (Used for Render)
The project includes a Dockerfile which:

Builds the project using Maven Wrapper
Runs the generated JAR file

🧪 Testing with Postman:
POST
https://itemapi-u3bp.onrender.com/items

GET
https://itemapi-u3bp.onrender.com/items/1



🧑‍💻 Author

Deepak Kumar


Save the file.

---

## ✅ Step 2 — Push README to GitHub

Open terminal in project root and run:

```bash
git add README.md
git commit -m "Added professional README documentation"
git push