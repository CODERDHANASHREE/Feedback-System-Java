# Feedback System (Servlet + JDBC + MySQL)

This is a web-based feedback system where users can submit their feedback using a form.

## Features
- User enters name, email, rating, and comments
- Data is sent to Java Servlet using POST method
- Servlet processes the request
- Data is stored in MySQL database using JDBC

## Technologies Used
- Java
- Servlet (Jakarta Servlet API)
- JDBC
- MySQL
- HTML

## Project Flow
1. User fills feedback form (HTML)
2. Data is sent to FeedbackServlet
3. Servlet retrieves data using request.getParameter()
4. JDBC is used to connect to MySQL
5. Data is inserted into database using PreparedStatement

## How to Run
1. Run schema.sql in MySQL
2. Add MySQL connector JAR
3. Deploy project on Apache Tomcat
4. Open browser:
   http://localhost:8080/MyExpenseApp/feedback.html
