/*
In postgres SERIAL is a special data type that generate a sequence of integers
*/

CREATE TABLE account(
  user_id SERIAL PRIMARY KEY,
  username VARCHAR(50) UNIQUE NOT NULL,
  password VARCHAR(50) NOT NULL,
  email VARCHAR(250) UNIQUE NOT NULL,
  created_at TIMESTAMP NOT NULL,
  last_login TIMESTAMP
)

CREATE TABLE job(
  job_id SERIAL PRIMARY KEY,
  job_name VARCHAR(200) UNIQUE NOT NULL
)

CREATE TABLE account_job(
  user_id INTEGER  REFERENCES account(user_id),
  job_id INTEGER REFERENCES job(job_id),
  hire_date TIMESTAMP
)

CREATE TABLE information(
  info_id SERIAL PRIMARY KEY,
  title VARCHAR(500) NOT NULL,
  person VARCHAR(50) NOT NULL UNIQUE
)