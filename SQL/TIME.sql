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