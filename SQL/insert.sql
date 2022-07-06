INSERT INTO account (username,password, email, created_at)
VALUES
('Jose', 'password','jose@gmail.com',CURRENT_TIMESTAMP);


INSERT INTO job(job_name)
VALUES
('Software engineer')


INSERT INTO account_job(user_id, job_id, hire_date)
VALUES 
(1,1, CURRENT_TIMESTAMP)