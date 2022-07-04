/*
* EXTRACT
* allows get only a part of a full timestamp column
*
* EXTRACT( YEAR FROM date_col)
*/

SELECT EXTRACT(YEAR FROM payment_date) as year_of_payment
FROM payment

SELECT EXTRACT(MONTH FROM payment_date) as month_of_payment
FROM payment

SELECT 
payment_date,
EXTRACT(MONTH FROM payment_date) as month_of_payment,
EXTRACT(QUARTER FROM payment_date) as month_of_payment

/*
* AGE calutulates and return the current age given a timestamp
* AGE(date_col)
*/

SELECT AGE(payment_date) FROM payment

/*
* TO_CHAR
* transform data type to string with some format
*
* TO_CHAR(payment_date,PATTERN)
* All patterns are in documetation
*/

SELECT TO_CHAR(payment_date,'HH') FROM payment
SELECT TO_CHAR(payment_date,'YYYY') FROM payment
SELECT TO_CHAR(payment_date,'MONTH') FROM payment
SELECT TO_CHAR(payment_date,'MONTH-YYYY') FROM payment

/* It's possible add any string in order to format a date */
SELECT TO_CHAR(payment_date,'MONTH..__..__   YYYY') FROM payment


/* Challenges */
SELECT DISTINCT(TO_CHAR(payment_date,'MONTH')) FROM payment

SELECT COUNT(*)
FROM payment
WHERE EXTRACT(dow FROM payment_date) = 1
