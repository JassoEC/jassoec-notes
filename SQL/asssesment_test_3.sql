CREATE DATABASE school;

CREATE TABLE students (
  student_id SERIAL PRIMARY KEY,
  first_name VARCHAR(50) NOT NULL,
  last_name VARCHAR(50) NOT NULL,
  homerooom_number SMALLINT NOT NULL CHECK ( homerooom_number > 0),
  phone VARCHAR(25) UNIQUE NOT NULL,
  email VARCHAR(25) UNIQUE,
  graduation_year SMALLINT
);

CREATE TABLE teachers(
  teacher_id SERIAL PRIMARY KEY,
  first_name VARCHAR(50) NOT NULL,
  last_name VARCHAR(50) NOT NULL,
  homerooom_number SMALLINT NOT NULL CHECK ( homerooom_number > 0),
  deparment VARCHAR(50),
  phone VARCHAR(25) UNIQUE NOT NULL,
  email VARCHAR(25) UNIQUE,
);

INSERT INTO students(
  first_name,
  last_name, 
  homerooom_number,
  phone,
  graduation_year
)
VALUES (
  'Mark',
  'Watney',
  5,
  '777-555-1234',
  2035
);

INSERT INTO teachers (
  first_name,
  last_name,
  homerooom_number,
  deparment,
  email,
  phone
) VALUES (
  'Jonas',
  'Salk',
  5,
  'Biology',
  'jsalk@school.org',
  '777-555-4321'
);