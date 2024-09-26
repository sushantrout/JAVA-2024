CREATE TABLE application_user (
    id BIGINT PRIMARY KEY,
    full_name VARCHAR(255) NOT NULL,
    age INT NOT NULL,
    email VARCHAR(255),
    username VARCHAR(100) NOT NULL,
    password VARCHAR(100) NOT NULL,
    gender VARCHAR(10)
);



CREATE TABLE application_user (
    id BIGINT PRIMARY KEY,
    full_name VARCHAR(255) NOT NULL,
    age INT NOT NULL,
    email VARCHAR(255),
    username VARCHAR(100) NOT NULL,
    password VARCHAR(100) NOT NULL,
    gender VARCHAR(10)
);
INSERT INTO application_user (id, full_name, age, email, username, password, gender)
VALUES 
(1, 'Satya Prakash Biswal', 30, 'satya.biswal@example.com', 'satyabiswal', 'password123', 'Male'),

(2, 'Priyanshi Nand', 25, 'priyanshi.nand@example.com', 'priyanshin', 'securepass456', 'Female');
