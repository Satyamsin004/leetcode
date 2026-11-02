-- Write your PostgreSQL query statement below
select a.activity_date as day, count(distinct a.user_id) as active_users
from Activity a
where a.activity_date > date '2019-07-27' - interval '30 days' and  a.activity_date <= DATE '2019-07-27'
group by a.activity_date;