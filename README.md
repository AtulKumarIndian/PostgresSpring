# 🐘 PostgresSpring Boot CRUD with Docker & Swagger

This project demonstrates how to connect a **PostgreSQL** database with **Spring Boot**, using **CRUD operations** and testing the flow via **Swagger UI**. The PostgreSQL database is hosted in a **Docker** container, ensuring easy setup and deployment. 🛠️

## 🚀 Project Overview

The application uses Spring Boot with the following features:
- **PostgreSQL** database integration via Docker 🐳
- **CRUD operations** using Spring Data JPA
- **Swagger UI** for testing and documenting API endpoints
- **Lombok** to reduce boilerplate code for entity models

## 🗂️ Tech Stack

- **Spring Boot** (with Spring Data JPA)
- **PostgreSQL** (via Docker)
- **Lombok**
- **Swagger UI**

## 🛠️ Setup and Installation

### 1. 🐳 Setting Up PostgreSQL with Docker

To get started, create a PostgreSQL database inside a Docker container. Run the following command to pull and start the latest PostgreSQL image from DockerHub:

```bash
docker run --name my-postgres-db \\
  -e POSTGRES_DB=mydb \\
  -e POSTGRES_USER=postgresatul \\
  -e POSTGRES_PASSWORD=atul \\
  -v pgdata:/var/lib/postgresql/data \\
  -p 5432:5432 \\
  -d postgres
```
### 2. 🐚 Interacting with the Docker Container

```bash
docker exec -it my-postgres-db bash
docker ps
docker kill <container_id>
```
### 3. 🚦 Spring Boot Configuration
Add the following dependencies to your pom.xml for Spring Boot:

spring-boot-starter-data-jpa
postgresql
lombok

### 4. ⚙️ Application Properties

Configure your application.properties or application.yml for the PostgreSQL connection:

```bash
spring.datasource.url=jdbc:postgresql://localhost:5432/mydb
spring.datasource.username=postgresatul
spring.datasource.password=atul
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```
### 5. 🏗️ Building and Running the Project

# 1. Start the PostgreSQL container:

```bash
docker start my-postgres-db
```

# 2. Run the Spring Boot application:

```bash
mvn spring-boot:run
```

### 6. 🧪 Testing with Swagger

Once the application is running, visit the Swagger UI to interact with the API and perform CRUD operations.

Swagger will be available at:

```bash
http://localhost:8080/swagger-ui.html
```
Happy Coding! ✨


