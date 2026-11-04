-- Write your PostgreSQL query statement below
select s.product_id,s.year as first_year,s.quantity,s.price
from Sales s
join( Select s.product_id,min(s.year) as year
from Sales s
group by product_id
)s1 on s.product_id = s1.product_id and s.year = s1.year;