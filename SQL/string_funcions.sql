SELECT LENGTH(first_name)
FROM customer

/* Concat strings */
SELECT first_name || ' ' ||last_name AS full_name
FROM customer

/* TO upper*/

SELECT upper(first_name) || ' ' || upper(last_name) AS full_name
FROM customer


SELECT lower(substring(first_name FROM 1 for 2) || last_name || '@gmail-com') AS email_address
FROM customer

SELECT LEFT(first_name,1)  ||last_name || '@gmail.com' AS full_name
FROM customer
