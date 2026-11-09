select e.employee_id,e.name,f.reports_count,f.average_age
from Employees e
join (select reports_to,count(*) as reports_count, round(avg(age)) as average_age
from Employees e
where e.reports_to is not null
group by e.reports_to
)f on e.employee_id = f.reports_to
order by e.employee_id;