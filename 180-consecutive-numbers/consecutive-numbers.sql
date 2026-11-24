# Write your MySQL query statement below
SELECT DISTINCT a.num AS ConsecutiveNums
FROM Logs AS a
JOIN Logs AS b
ON a.id + 1 = b.id
JOIN Logs AS c
ON b.id + 1 = c.id
WHERE a.num = b.num
AND b.num = c.num;