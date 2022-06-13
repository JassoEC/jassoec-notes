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