🐾 Tony’s Tribe – Pet Adoption Platform (Backend)

This is the backend API for the Tony's Tribe Pet Adoption Platform, built using Spring Boot, MySQL, JWT Authentication, and Spring Security.

The backend is fully deployed and connected to the production database.

🌍 Live Backend Deployment

🔹 Base URL:
📌 https://pet-adoption-backend-s9k3.onrender.com


🔹 API Base Path:
📌 https://pet-adoption-backend-s9k3.onrender.com/api

✔ Fully hosted on Render
✔ Connected to Aiven MySQL
✔ CORS enabled for Vercel frontend



🚀 Features

User authentication (register / login)

JWT-based authorization

Admin module (manage pets, view adoption applications)

Seller dashboard (upload pets)

Adoption module (application workflow)

Database persistence with JPA + Hibernate

Global Exception Handling

Image upload via Base64

Secure password hashing (BCrypt)

Role-based access control (ADMIN / USER / SELLER)


🛠 Tech Stack

Backend:

Spring Boot 3.x

Spring Security (JWT)

Hibernate + JPA

MySQL (Aiven cloud)

Maven

Render Deployment


⚙️ Environment Variables (Required for Deployment)

These are configured inside Render:

DB_HOST=<Aiven MySQL host>
DB_PORT=3306
DB_NAME=<your-db-name>
DB_USER=<your-db-user>
DB_PASSWORD=<your-db-password>

JWT_SECRET=<your-secret-key>



Run Backend Locally
1️⃣ Install dependencies

mvn clean install

mvn spring-boot:run

http://localhost:8080


| Method | Endpoint             | Description          |
| ------ | -------------------- | -------------------- |
| POST   | `/api/auth/register` | Create account       |
| POST   | `/api/auth/login`    | Login & receive JWT  |
| GET    | `/api/auth/me`       | Fetch logged-in user |
| PUT    | `/api/auth/profile`  | Update contact info  |


| Method | Endpoint         | Description            |
| ------ | ---------------- | ---------------------- |
| GET    | `/api/pets`      | List all pets          |
| GET    | `/api/pets/{id}` | Get pet details        |
| POST   | `/api/pets`      | Add pet (Admin/Seller) |
| PUT    | `/api/pets/{id}` | Update pet             |
| DELETE | `/api/pets/{id}` | Delete pet (Admin)     |


| Method | Endpoint         | Description                 |
| ------ | ---------------- | --------------------------- |
| POST   | `/api/adoptions` | Submit adoption form        |
| GET    | `/api/adoptions` | Admin view all applications |


🔐 Roles in System

ADMIN → Full access (pets, users, applications)

SELLER → Can upload/manage own pets

USER → Can browse and apply for adoption



📜 License

Made for portfolio & educational use.


🐾 Tony’s Tribe – Connecting pets with loving families.
Let me know if you want:

✅ Combined README for whole project
✅ API documentation in Swagger-style
✅ Architecture diagram
✅ ER diagram
✔ I can generate them for you!
