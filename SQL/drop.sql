/* General sintax

  ALTER TABLE table_name
  DROP  COLUM col_name
  
*/

/* Remove all dependencies

  ALTER TABLE table_name
  DROP  COLUM col_name CASCADE

*/


/* Drop multiple columns

  ALTER TABLE table_name
  DROP  COLUM col_one,
  DROP  COLUM col_two,

*/

/* Droping column */
ALTER TABLE new_info
DROP COLUMN people /* Get an error if not exits*/
 
ALTER TABLE new_info
DROP COLUMN IF EXISTS people /* Get a notice */