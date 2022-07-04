/* 
* Subqueries
* 
* first run the code in the parenthesis
* after can use the result in rest of query
*/

SELECT title, rental_rate FROM film
WHERE rental_rate > (SELECT AVG(rental_rate) FROM film) 


/* Its posible use IN operator un conjunction with a subquery */
SELECT  film_id, title 
FROM film
WHERE film_id IN 
(SELECT inventory.film_id 
FROM rental
INNER JOIN inventory
ON inventory.inventory_id = rental.inventory_id
WHERE return_date BETWEEN '2005-05-29' AND '2005-05-30')
ORDER BY title

/* EXIST operator is used to check if any rows are returned with thw subquery*/

SELECT first_name, last_name 
FROM customer as  c
WHERE EXISTS 
(   
    SELECT * FROM payment as p
    WHERE c.customer_id = p.customer_id
    AND p.amount > 11
)

SELECT first_name, last_name
FROM customer c
LEFT JOIN payment p
ON c.customer_id = p.customer_id
WHERE p.amount > 11
GROUP BY c.customer_id	