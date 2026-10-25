select Employee.name , Bonus.bonus
from Employee
Left join Bonus
on Employee.empId = Bonus.empId
where bonus < 1000 or bonus is null ;
