CREATE TABLE employees (
  employee_id SERIAL PRIMARY KEY,
  first_name VARCHAR(50) NOT NULL,
  last_name VARCHAR(50) NOT NULL,
  birthdate DATE CHECK (birthdate > '1900-01-01'),
  hire_date DATE CHECK (hire_date > birthdate),
  salary INTEGER CHECK ( salary > 0)
)

INSERT INTO employees(
  first_name, last_name, birthdate, hire_date, salary
)
VALUES('Emanuel','Campos','1899-10-30','2010-10-01',100)