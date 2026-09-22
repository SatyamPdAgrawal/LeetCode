# Write your MySQL query statement below
Select t.activity_date as day , count(distinct(t.user_id)) as active_users
from Activity as t
where 
activity_date>='2019-06-28' and activity_date<='2019-07-27'
group by activity_date;