/* Case general sintax

// Can be used to evaluate any kinkd of expressions not only equality

  SELECT a,
  CASE 
    WHEN condition1 THEN result1
    WHEN condition2 THEN result2
    ELSE other_result as 'Some_alias'
  END
  FROM table_name

*/

/* Case expression sintax

// firts evaluates an expresion then compares the resul with each value in WHEN Clauses 
// works fine with equality comparisions

  CASE expression
    WHEN value1 THEN result1
    WHEN value2 THEN result2
    ELSE other_result
  END

*/

/* General Sintax 
  The CASE works as a column
*/

SELECT customer_id,
  CASE 
    WHEN (customer_id <= 100) THEN 'Premium'
    WHEN (customer_id  BETWEEN 100 AND 200) THEN 'Plus'
    ELSE 'Normal'
  END AS customer_type
FROM customer


/* Case Sintax

*/

SELECT customer_id,
  CASE customer_id
    WHEN 2  THEN 'Winner'
    WHEN 5 THEN 'Second place'
    ELSE 'Normal'
  END AS raffle_results
FROM customer


/* can use the result of CASE as a normal column */
SELECT
SUM (
  CASE rental_rate 
    WHEN 0.99 THEN 1
    ELSE 0
  END) AS bargains,
SUM(
  CASE rental_rate
    WHEN 2.99 THEN 1
    ELSE 0
  END
) AS  regular,
SUM(
  CASE rental_rate
    WHEN 4.99 THEN 1
    ELSE 0
  END
) AS  premium
FROM film;

/* Challenges */
SELECT
SUM (
  CASE rating 
    WHEN 'R' THEN 1
    ELSE 0
  END) AS r,
SUM(
  CASE rating
    WHEN 'PG' THEN 1
    ELSE 0
  END
) AS  pg,
SUM(
  CASE rating
    WHEN 'PG-13' THEN 1
    ELSE 0
  END
) AS  pg13
FROM film;
