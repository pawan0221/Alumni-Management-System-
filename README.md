
# 🎓 AlumVerse - Alumni Management System

A full-stack web application to connect, manage, and engage college alumni. Built with **Spring Boot** (backend) and **HTML/CSS/JavaScript** (frontend).

---

## 🚀 Features

### 👤 Authentication
- Secure login with role-based access (ADMIN / USER)
- Protected pages — redirects to login if not authenticated
- Logout functionality

### 🔍 Discover Alumni
- Browse all registered alumni
- Search/filter by name, batch year, department, company, location
- Send connection requests
- **ADMIN only:** Add and delete alumni

### 💼 Job Board
- Any logged-in alumni can post job openings
- Filter jobs by title, company, or type (Full-Time / Internship / Remote / Contract)
- Apply directly via email link
- **ADMIN only:** Delete job postings

### 👤 My Profile
- View and edit personal profile (name, batch, department, company, location, bio, LinkedIn)
- See your connections list
- Data saved locally per user

### 📊 Admin Dashboard *(ADMIN only)*
- Live stats: Total Alumni, Total Users, Job Postings, Latest Batch
- Charts: Alumni by Batch Year, by Department, Top Locations, Top Companies
- Recent alumni table with delete option
- Export all alumni data to CSV

### 📰 News & Events
- Latest college news and announcements
- Upcoming events with dates

### 🏆 Achievements
- Spotlight on notable alumni achievements and milestones

### 💬 Engagement Platform
- Discussion topics and mentorship program info

### 💰 Fundraising
- Information on fundraising initiatives and how to contribute

---

## 🛠️ Tech Stack

| Layer | Technology |
|-------|-----------|
| Frontend | HTML, CSS, JavaScript |
| Backend | Java, Spring Boot |
| Database | MySQL / H2 |
| ORM | Spring Data JPA / Hibernate |
| Build Tool | Maven |
| Charts | Chart.js |
| Version Control | Git & GitHub |

---

## 📁 Project Structure

```
alumni-management/
├── src/
│   └── main/
│       ├── java/alumni_management/
│       │   ├── controller/
│       │   │   ├── AlumniController.java
│       │   │   ├── AuthController.java
│       │   │   └── JobController.java
│       │   ├── model/
│       │   │   ├── Alumni.java
│       │   │   ├── User.java
│       │   │   └── Job.java
│       │   └── repository/
│       │       ├── AlumniRepository.java
│       │       ├── UserRepository.java
│       │       └── JobRepository.java
│       └── resources/
│           ├── static/
│           │   ├── login.html
│           │   └── Prototype.html
│           └── application.properties
└── pom.xml
```

---

## ⚙️ Setup & Run

### Prerequisites
- Java 17+
- Maven
- MySQL (or use H2 for testing)

### 1. Clone the repository
```bash
git clone https://github.com/pawan0221/Alumni-Management-System-.git
cd Alumni-Management-System-/alumni-management
```

### 2. Configure database
Edit `src/main/resources/application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/alumnidb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
```

### 3. Run the application
```bash
.\mvnw.cmd spring-boot:run
```

### 4. Open in browser
```
http://localhost:8080/login.html
```

---

## 🔑 API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/auth/login` | Login with username & password |
| GET | `/auth/users/count` | Get total user count |
| GET | `/alumni` | Get all alumni |
| POST | `/alumni` | Add new alumni |
| DELETE | `/alumni/{id}` | Delete alumni by ID |
| GET | `/alumni/count` | Get total alumni count |
| GET | `/jobs` | Get all job postings |
| POST | `/jobs` | Post a new job |
| DELETE | `/jobs/{id}` | Delete job by ID |

---

## 📸 Screenshots

> Login Page · Home Page · Discover Alumni · Job Board · Admin Dashboard

---

## 👨‍💻 Developer

**Pawan** — [@pawan0221](https://github.com/pawan0221)


---

## 📄 License

This project is for educational purposes.
