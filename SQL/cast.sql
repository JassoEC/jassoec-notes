/* SQL Cast syntax

  SELECT CAST('5' AS INTEGER)

*/

/* PostgreSQL CAST Operator

  SELECT '5'::INTEGER

*/

/* Examples 

  SELECT CAST(date AS TIMESTAMP)
*/

SELECT CAST('5' AS INTEGER) as new_int
SELECT '5'::INTEGER as new_int

SELECT inventory_id, CHAR_LENGTH(inventory_id::VARCHAR) 
FROM rental