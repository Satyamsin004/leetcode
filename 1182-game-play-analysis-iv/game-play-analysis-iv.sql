-- Write your PostgreSQL query statement below
select round(count(*) * 1.0 / (select count(distinct player_id) from activity),2) as fraction
from Activity a
join(select player_id,min(event_date) as event_date 
    from Activity
    group by player_id

)t on a.event_date = t.event_date + interval '1 days' 
and a.player_id = t.player_id;