/* Coalesce Function

  - Acepts an ulimited number of arguments ir order to be evaluated
  - Returns the first argument that is not null
  - If all arments are null returns null

  - Works to make subsitutions to perform operations

  Syntax 

  COALESCE(arg_1,arg_2... arg_n)

  Example:

  The discount column have a null values for some items, then COALESCE return the firts argument not null
  if the discount is null reuturns 0 to continue with the operation
*/

SELECT item,(price -COALESCE(discount,0)) AS final_price
FROM table_name