SELECT s.user_id, ROUND(COALESCE(SUM(CASE WHEN c.action = 'confirmed' THEN 1.0 ELSE 0 END) / NULLIF(COUNT(c.user_id), 0), 0), 2) AS confirmation_rate
from Signups s
left join Confirmations c
on s.user_id = c.user_id
group by s.user_id;


