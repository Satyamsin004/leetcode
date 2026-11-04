-- Write your PostgreSQL query statement below
select max(m.num) as num
from MyNumbers m
where m.num in (select m.num
 from MyNumbers m
 group by num
 having count(m.num) = 1
)

