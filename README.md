# Dockerized Spring Boot Application with MySQL using Docker Compose

This repository contains a Dockerized Spring Boot application with MySQL configured using Docker Compose. It demonstrates how to run a Spring Boot application with a MySQL database in Docker containers and manage them using Docker Compose.

## Prerequisites

- Download and install Docker Desktop from [Docker's official website](https://docs.docker.com/desktop/install/).

## Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/tksuren/spring-mysql-docker-compose.git
## Usage

1. **Navigate to the cloned directory:**

    ```bash
    cd spring-mysql-docker-compose
    ```

2. **Start the Docker containers:**

    ```bash
    docker-compose up
    ```

3. **Access the application:**

    Open your web browser and go to [http://localhost:8080](http://localhost:8080) to view the application.

- Once the Docker containers are up and running, you can access the Spring Boot application at [http://localhost:8080](http://localhost:8080).
- The MySQL database is also running in a Docker container and is accessible to the Spring Boot application.
