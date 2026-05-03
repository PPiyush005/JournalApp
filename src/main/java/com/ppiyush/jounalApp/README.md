📓 Journal App
A RESTful Journal Application built with Spring Boot as part of the Engineering Digest – Spring Boot Mastery playlist by Vipul Tyagi.
This project is a hands-on learning exercise covering core Spring Boot concepts from basics to advanced, including REST API development, MongoDB integration, Spring Security, and more.

🚀 Features

📝 Create, Read, Update, and Delete (CRUD) journal entries
👤 User registration and authentication
🔐 Secured endpoints using Spring Security
🗃️ Data persistence with MongoDB
🏗️ Clean layered architecture — Controller → Service → Repository
⚙️ Auto-configuration with Spring Boot


🛠️ Tech Stack
TechnologyPurposeJavaCore LanguageSpring BootBackend FrameworkSpring Web (MVC)REST APISpring SecurityAuthentication & AuthorizationSpring Data MongoDBDatabase IntegrationMongoDBNoSQL DatabaseMavenBuild Tool

📁 Project Structure
src/
├── main/
│   ├── java/
│   │   └── com.example.journalApp/
│   │       ├── controller/    # REST Controllers
│   │       ├── service/       # Business Logic
│   │       ├── repository/    # MongoDB Repositories
│   │       ├── entity/        # Data Models
│   │       └── config/        # Security & App Config
│   └── resources/
│       └── application.properties

⚙️ Getting Started
Prerequisites

Java 17+
Maven
MongoDB (local or Atlas)

Run Locally
bash# Clone the repository
git clone https://github.com/your-username/journal-app.git

# Navigate to project directory
cd journal-app

# Configure MongoDB URI in application.properties
spring.data.mongodb.uri=mongodb://localhost:27017/journaldb

# Build and run
mvn spring-boot:run

📚 Learning Reference
This project is built by following the Spring Boot Mastery: From Basics to Advanced playlist on the Engineering Digest YouTube channel by Vipul Tyagi.

🙌 Acknowledgements
A big thanks to Vipul Tyagi and Engineering Digest for the clear, concise, and value-packed Spring Boot tutorials.
