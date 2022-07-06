/* General sintax 

  ALTER TABLE table_name action

*/


/* Adding columns

  ALTER TABLE table_name
  ADD COLUMN new_col TYPE

*/

/* Removing columns

  ALTER TABLE table_name
  DROP COLUMN col_name

*/

/* Alter constrains

  ALTER TABLE table_name
  ALTER COLUMN col_name
  [
    SET DEFAULT value ||
    DROP DEFAULT ||
    SET NOT NULL ||
    DROP NOT NULL ||
    ADD CONSTRAINT constraint_name
  ]

*/

/* Renaming */
ALTER TABLE information
RENAME TO new_info

/* Renaming columns */
ALTER TABLE new_info
RENAME COLUMN person TO people

/* Alter constraints*/
INSERT INTO new_info (title)
VALUES ('A new title row') /* Fails:  people is NOT NULL */

ALTER TABLE new_info
ALTER COLUMN people DROP NOT NULL