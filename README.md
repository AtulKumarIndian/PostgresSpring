# Creating the content for the README.md file
readme_content = """
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


