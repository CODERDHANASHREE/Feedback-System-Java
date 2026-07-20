# FeedbackApp - AI Integrated Feedback Management System

## Overview

This is a web-based feedback management system where users can submit feedback through a form. The system stores feedback in MySQL and analyzes feedback using an AI service layer to generate sentiment, summary, and suggestions.

## Features

- User submits name, email, rating, and comments
- Data is processed using Java Servlet
- Feedback stored in MySQL database using JDBC
- AI analysis of feedback
- Generates:
  - Sentiment analysis
  - Feedback summary
  - Improvement suggestions
- Stores AI analysis along with original feedback

## Technologies Used

- Java
- Jakarta Servlet
- JDBC
- MySQL
- HTML
- JavaScript
- Apache Tomcat
- JSON Processing
- AI Service Integration

## Project Flow

User submits feedback
↓
HTML Form
↓
FeedbackServlet
↓
JDBC stores feedback
↓
AIService analyzes comments
↓
AI result stored in MySQL
↓
Analysis displayed to user

## Database

Feedback table contains:

- id
- name
- email
- rating
- comments
- ai_analysis

## How to Run

1. Run `schema.sql` in MySQL
2. Add MySQL connector and JSON JAR files
3. Configure database credentials
4. Deploy project on Apache Tomcat
5. Open:

http://localhost:8080/FeedbackApp/feedback.html