/*Inner join is a predterminated*/

/*the AS operator executes at the very end of a query, the is not possible use alias on WHERE OR HAVNING clause */
SELECT customer_id, SUM(amount) as total_spent
FROM payment
GROUP BY customer_id
HAVING SUM(amount) > 100 /*the total_spent alias exectues at the end*/

/*OUTER JOINS*/

/*
- Seelect data only in one of the tables joined in query
- if a value doen't exists in the oposite table return null to complete te information
*/

/*LEFT JOIN*/

/*
* Rows of LEFT table that are presents in RIGHT table
* but also rows of RIGHT table that are not present in LEFT TABLE
* using a unique column in RIGHT table can get excluded conditions
*/
/*
* Left table is the first one table on FROM cluse
*/

SELECT  f.film_id, title, inventory_id,store_id
FROM film f
LEFT JOIN inventory i
ON f.film_id = i.film_id
WHERE i.film_id IS NULL


/*  RIGHT JOIN


*/

SELECT  f.film_id, title, inventory_id,store_id
FROM film f
RIGHT JOIN inventory i
ON f.film_id = i.film_id


/* CHALLENGES */

SELECT f.title, a.first_name,a.last_name 
FROM film f
INNER JOIN film_actor fa
ON f.film_id = fa.film_id
INNER JOIN actor a
ON a.actor_id = fa.actor_id
WHERE a.first_name = 'Nick' AND a.last_name = 'Wahlberg'