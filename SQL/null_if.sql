/* NULLIF Fuction
  Takes two arguments and returns NULL if both are equals
  if are differents returns the fist argument


  Syntax

  NULLIF(arg_1, arg_2)

  Examples

*/

NULLIF(10,10) /* RETURNs NULL */
NULLIF(10,12) /* RETURNs 10 */

CREATE TABLE depts (
  first_name VARCHAR(50),
  department VARCHAR(50)
)

INSERT INTO depts(first_name, department)
VALUES
('Vinton','A'),
('Lauren','A'),
('Claire','B')

DELETE FROM  depts WHERE department = 'B'


SELECT (
  SUM(CASE WHEN department = 'A' THEN 1 ELSE 0 END) /
  NULLIF(SUM(CASE WHEN department = 'B' THEN 1 ELSE 0 END),0)
) AS department_ratio
FROM depts
