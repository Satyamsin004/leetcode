-- Write your PostgreSQL query statement below
select max(m.num) as num
from MyNumbers m
join(select m.num , count(*) as cnt
  from MyNumbers m
  group by num
)m1 on m.num = m1.num
where m1.cnt = 1;