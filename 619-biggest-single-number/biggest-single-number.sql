-- Write your PostgreSQL query statement below
select max(m.num) as num
from MyNumbers m
where m.num in (select num
 from MyNumbers 
 group by num
 having count(num) = 1
)

