# 🏆 Premier Zone - Premier League Player Statistics API

A **Spring Boot REST API** for managing and querying **Premier League player statistics** with full **PostgreSQL** integration.
---
## ⚙️ TODO ⚙️
- **Apply Spring Security JWT** — User Sign Up + Login with Email Verification
- 
---

## 🚀 Features

- **Full CRUD Operations** — Create, read, update, and delete player records
- **Advanced Filtering** — Search players by team, position, nation, or name
- **RESTful API** — Clean endpoints following REST conventions
- **PostgreSQL Integration** — Robust database storage with JPA/Hibernate
- **Production Ready** — Proper error handling and validation

---

## 🛠 Tech Stack

- ☕ **Java 17** + **Spring Boot 3.5.6**
- 🐘 **PostgreSQL** — Database
- 🧩 **Spring Data JPA** — ORM layer
- ⚙️ **Gradle** (primary build tool)
- 🧱 **Maven** (optional alternative)

---

## 📋 Prerequisites

- Java 17 or higher
- PostgreSQL 12+
- Gradle 7+ or Maven 3.6+

---

## ⚙️ Setup Instructions

### 1️⃣ Database Setup

```sql
-- Create database
CREATE DATABASE desired-database-name;

-- ⚠️ Common issue: Data might be in a database named after your username
-- Verify using: \l  (list databases)
```
### 2️⃣ Configuration

Edit **`src/main/resources/application.properties`**:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/prem_stats
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

### 3️⃣ Build and Run

**Using Gradle:**
```bash
./gradlew build
./gradlew bootRun
```

**Using Maven:**
```bash
mvn clean install
mvn spring-boot:run
```

---

## 🌐 API ENDPOINTS

**Base URL:** `http://localhost:8080/api/v1/player`

| Method | Endpoint | Description |
|--------|-----------|-------------|
| GET | `/` | Get all players (optional filters: team, position, nation, name) |
| POST | `/` | Create new player (send Player JSON in body) |
| PUT | `/` | Update player (send Player JSON in body) |
| DELETE | `/{playerName}` | Delete player by name |

### 🧠 Example Requests

**Get all Arsenal players**
```bash
GET http://localhost:8080/api/v1/player?team=Arsenal
```

**Search players by name**
```bash
GET http://localhost:8080/api/v1/player?name=saka
```

**Create a new player**
```bash
POST http://localhost:8080/api/v1/player
Content-Type: application/json

{
  "name": "Player Name",
  "nation": "Country",
  "position": "Position",
  "age": 25,
  "mp": 10,
  "starts": 8,
  "min": 900.0,
  "goals": 5.0,
  "ast": 3.0,
  "pk": 1.0,
  "crdy": 2.0,
  "crdr": 0.0,
  "xg": 4.5,
  "xag": 2.8,
  "team": "Team Name"
}
```

---

## 🧱 DATABASE SCHEMA

**Table:** `player_statistic`

| Column | Type | Description |
|--------|------|-------------|
| player_name | VARCHAR | Primary key |
| nation | VARCHAR | Player nationality |
| position | VARCHAR | Playing position |
| age | INTEGER | Player age |
| matches_played | INTEGER | Matches played |
| starts | INTEGER | Games started |
| minutes_played | DOUBLE | Minutes on pitch |
| goals | DOUBLE | Goals scored |
| assists | DOUBLE | Assists provided |
| penalties_scored | DOUBLE | Penalties scored |
| yellow_cards | DOUBLE | Yellow cards |
| red_cards | DOUBLE | Red cards |
| expected_goals | DOUBLE | xG metric |
| expected_assists | DOUBLE | xA metric |
| team_name | VARCHAR | Current team |

---

## 🧩 COMMON ISSUES & SOLUTIONS

### ❌ No players returned
✅ **Fix:**
- Check DB connection in `application.properties`
- Verify with:
```sql
SELECT current_database();
SELECT COUNT(*) FROM player_statistic;
```

### ⚠️ Database Connection Errors
✅ **Fix:**
- Ensure PostgreSQL is running
- Check credentials and DB name

### ⚙️ Column Mapping Errors
✅ **Fix:**
- Verify `@Column` names match DB columns (case-sensitive)

### 🔥 Port Already in Use
✅ **Fix:** Change in `application.properties`:
```properties
server.port=8081
```

### 💡 "Constructor not used" warnings
✅ **Fix:** Safe to ignore or add:
```java
@SuppressWarnings("unused")
```

---

## 🧪 DEBUGGING TIPS

Enable SQL Logging:
```properties
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
logging.level.org.hibernate.SQL=DEBUG
```

Test DB connection:
```
GET http://localhost:8080/api/v1/player/test-mapping
```

---

## 📂 PROJECT STRUCTURE

```
src/main/java/com/pl/premier_zone/
│
├── PremierZoneApplication.java
└── player/
    ├── Player.java             # Entity
    ├── PlayerRepository.java   # DAO
    ├── PlayerService.java      # Business Logic
    └── PlayerController.java   # REST Controller

src/main/resources/
└── application.properties
```

---

## 🚢 DEPLOYMENT

**Build for production:**
```bash
./gradlew clean build
java -jar build/libs/premier-zone-0.0.1-SNAPSHOT.jar
```

**Use environment variables (recommended):**
```properties
spring.datasource.url=${DATABASE_URL}
spring.datasource.username=${DB_USERNAME}
spring.datasource.password=${DB_PASSWORD}
```

---

## 🤝 CONTRIBUTING

1. Fork the repo 🍴  
2. Create your feature branch 🔧  
3. Commit your changes 📝  
4. Push to the branch 🚀  
5. Open a Pull Request 🎉  

---

## 📜 LICENSE

This project is licensed under the **MIT License** — see [LICENSE](LICENSE) for details.

---

⭐ **If you like this project, give it a star on GitHub!** ⭐
