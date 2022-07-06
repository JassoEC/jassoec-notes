UPDATE account
SET last_login = CURRENT_TIMESTAMP


/* It's possible set the value of another column in the table */
UPDATE account
SET last_login = created_at

/* Also can update using two tables (JOIN UPDATE) */
UPDATE account_job
SET hire_date = account.created_at
FROM account
WHERE account_job.user_id = account.user_id

/* Can get affected rows after update and avoid a extra select query */
UPDATE account
SET last_login = CURRENT_TIMESTAMP
RETURNING email,created_at, last_login