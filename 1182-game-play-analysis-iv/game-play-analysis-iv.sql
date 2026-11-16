# Write your MySQL query statement below
SELECT ROUND(SUM(a2.player_id IS NOT NULL) / COUNT(*),2) AS fraction
FROM (SELECT player_id,MIN(event_date) AS first_login
    FROM Activity
    GROUP BY player_id) AS a1
LEFT JOIN Activity AS a2
ON a1.player_id = a2.player_id
AND a2.event_date = DATE_ADD(a1.first_login, INTERVAL 1 DAY);