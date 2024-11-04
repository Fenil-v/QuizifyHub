
---

# Quiz App

This is a Java-based Quiz Application built using Spring Boot and PostgreSQL, providing a dynamic quiz-taking experience with APIs to fetch questions from various categories, randomize question selection, and evaluate answers for final scoring. The app uses JPA for seamless interaction with the database and supports a flexible many-to-many relationship structure.

## Features

- **Dynamic Question Fetching**: Retrieve quiz questions by category or in randomized sets.
- **Randomized Quiz Generation**: Use of a master table to select random questions.
- **Answer Scoring API**: Final API endpoint to calculate the user’s score by comparing answers to those stored in the database.
- **Database Integration**: PostgreSQL backend stores questions, answers, and options, ensuring data persistence and efficient querying.
- **Many-to-Many Relationships**: Supports categorization and tagging of questions to allow versatile quiz generation.

## Technologies Used

- **Java** with **Spring Boot** for the backend.
- **PostgreSQL** as the database.
- **Spring Data JPA** for database interaction.
- **RESTful APIs** to handle quiz functionality.

## Database Structure

- **Master Table**: Holds quiz metadata and connects questions to various categories.
- **Quiz Table**: Stores each question id with primary key.

## Endpoints

1. **Fetch Questions**: Retrieve quiz questions by category or random selection.
    - **GET** `/api/question/allQuestions`
    - **GET** `/api/question/category/{value}`
    - **GET** `/quiz/get/{id}`

2. **Submit Quiz Answers**: Submit answers for scoring.
    - **POST** `/api/quiz/submit`
    - **Request Body**: JSON containing question IDs and corresponding answers.

3. **Calculate Score**: Calculate the score based on user-submitted answers.
    - **POST** `/quiz/submit/{quiz id}`
    - Compares answers with the database and returns the final score.

4. **Add New questions**: Add new questions for quiz in db directly.
    - **POST** `/question/add`
    - Pass data in req.body.

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/quiz-app.git
   ```
2. Set up PostgreSQL and configure database credentials in `application.properties`.
3. Run the application:
   ```bash
   mvn spring-boot:run
   ```

## Configuration

- Update `application.properties` to connect to your PostgreSQL instance:
  ```properties
  spring.datasource.url=jdbc:postgresql://localhost:5432/quizdb
  spring.datasource.username=your-username
  spring.datasource.password=your-password
  spring.jpa.hibernate.ddl-auto=update
  ```

## Usage

- Run the server and access the endpoints to create quizzes, submit answers, and retrieve scores.
- Use Postman or similar tools to test APIs.
