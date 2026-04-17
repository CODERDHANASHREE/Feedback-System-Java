-- Create Database
CREATE DATABASE IF NOT EXISTS feedbackdb;

-- Use Database
USE feedbackdb;

-- Create Table
CREATE TABLE IF NOT EXISTS feedback (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL,
    rating INT,
    comments VARCHAR(200)
);