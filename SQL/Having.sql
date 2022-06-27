SELECT customer_id, SUM(amount) FROM payment
GROUP BY customer_id
HAVING SUM(amount) > 100

SELECT store_id, count(*) from customer
group by store_id
having count(customer_id) > 300


/*
execution order

HAVING 
GROUP BY
WHERE

*/

/*Challenges*/


SELECT customer_id, COUNT(*) FROM payment
GROUP BY customer_id
HAVING COUNT(customer_id) >= 40

SELECT customer_id, SUM(amount) FROM payment
WHERE staff_id = 2
GROUP BY(customer_id)
HAVING SUM(amount) > 100

/* ASSESMENT TEST*/
SELECT customer_id FROM payment
WHERE staff_id = 2
GROUP BY(customer_id)
HAVING SUM(amount) >= 110


SELECT COUNT(*) FROM film
WHERE title LIKE 'J%'


SELECT customer_id, first_name, last_name from customer
WHERE first_name ILIKE 'E%'
AND address_id < 500
ORDER BY customer_id desc
LIMIT 1