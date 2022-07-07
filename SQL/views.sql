
CREATE VIEW customer_info AS 
SELECT first_name, last_name, address
FROM customer c 
INNER JOIN address a 
ON c.address_id = a.address_id

/* After create view just call the view by name */

SELECT * FROM customer_info;


/* Modify view 

  CREATE OR REAPLACE VIEW view_name AS query...

  Examples 

*/

CREATE OR REPLACE VIEW customer_info AS 
SELECT first_name, last_name, address,district
FROM customer c 
INNER JOIN address a 
ON c.address_id = a.address_id


/* DROP VIEW

  DROP VIEW view_name
  
  DROP VIEW IF EXISTS view_name

 */

 /* Change the name of VIEW 
 
  ALTER VIEW  view_name RENAME TO new_view_name

 */ 

ALTER VIEW customer_info RENAME TO c_info