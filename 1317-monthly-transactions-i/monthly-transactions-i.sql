-- Write your PostgreSQL query statement below
 select to_char(trans_date,'YYYY-MM') as month , t.country,count(trans_date) as trans_count ,sum(case when state = 'approved' then 1 else 0 end) as approved_count,sum(amount) as trans_total_amount , sum(case when state = 'approved' then amount else 0 end) as approved_total_amount
 from Transactions t
 group by to_char(trans_date,'YYYY-MM') , t.country;