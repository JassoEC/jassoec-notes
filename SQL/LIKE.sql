/* LIKE */
/* Is case sensitive */


/* ILIKE */
/* not is case sensitive */

/* Starts with character 'A%' and then any sequence */

SELECT first_name, last_name FROM customer
WHERE first_name LIKE 'A%';


/* Ends with character '%a' and then any sequence */

SELECT first_name, last_name FROM customer
WHERE first_name LIKE '%a';

/* Count */
SELECT COUNT(first_name) FROM customer
WHERE first_name LIKE '%a';


/* Sensitive */
SELECT first_name, last_name FROM customer
WHERE first_name LIKE '%A';


/* Non sensitive */
SELECT first_name, last_name FROM customer
WHERE first_name ILIKE '%A';

/* _ can be replaced for another character */
/* Example Cars 1, Cars 2 or Cars 3 can use whete title LIKE 'Cars _' */
SELECT first_name, last_name FROM customer
WHERE first_name ILIKE 'Cars _';



SELECT * from customer
WHERE first_name LIKE 'J%';

SELECT * from customer
WHERE first_name LIKE 'J%' AND last_name LIKE 'S%';


/* Practices */

SELECT * FROM customer
WHERE first_name LIKE '%her';


/* % also can be empty */

SELECT * FROM customer
WHERE first_name LIKE '%er%';  /* Can get results such as Jeniffer */

/* _ only one character can be replaced */

SELECT * from customer
WHERE first_name LIKE '_her%'; /* Theresa, Sherry */

/* NOT operator can be added in combination with LIKE */
SELECT * from customer
WHERE first_name NOT LIKE '_her%'; /* exclude names like Theresa, Sherry */


/* Challenges */

SELECT COUNT(*) FROM payment
WHERE amount > 5;

SELECT COUNT(first_name) FROM 
actor WHERE first_name like 'P%'; 


SELECT COUNT(DISTINCT (district)) from address;

SELECT DISTINCT(district) FROM address;


SELECT COUNT(*) FROM film
WHERE rating  = 'R'
AND replacement_cost BETWEEN 5 AND 15;


SELECT COUNT(*) FROM film
WHERE title LIKE '%Truman%';

