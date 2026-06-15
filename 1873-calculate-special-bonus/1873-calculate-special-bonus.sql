# Write your MySQL query statems
select employee_id,
case 
   when employee_id%2!=0 and name not like 'M%' Then salary 
   else 0
End As bonus
from Employees
order by employee_id;