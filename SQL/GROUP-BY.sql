/* MIN */
/* Is for only single value, has not sense get another column */
SELECT  MIN(replacement_cost) FROM film;


/* MAX */
/* Is for only single value, has not sense get another column */
SELECT  MAX(replacement_cost) FROM film;

/* This works because two aggregated functions use the same column */
SELECT MAX(replacement_cost), MIN(replacement_cost) FROM film;

/* AVG Average for a column */
SELECT AVG(replacement_cost) FROM film;

/* ROUND(value, number_of_decimals) */
SELECT ROUND(AVG(replacement_cost),2) FROM film;


/* SUM */
SELECT SUM(replacement_cost) FROM film;


/* Must choose a categoric column,  */

SELECT customer_id FROM payment
GROUP BY customer_id;

/* Each column used in select clause must appear in group by clause or in aggregate function */
SELECT customer_id, sum(amount) FROM payment
GROUP BY customer_id;

/* CHALLENGES */

SELECT staff_id, COUNT(*) FROM payment
GROUP BY staff_id;

SELECT rating,ROUND(AVG(replacement_cost),2) FROM film 
GROUP BY rating
ORDER BY AVG(replacement_cost);


SELECT * FROM payment;

SELECT customer_id,SUM(amount) FROM payment
GROUP BY(customer_id) 
ORDER BY SUM(amount) DESC
LIMIT 5;