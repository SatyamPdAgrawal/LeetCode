SELECT e1.name
FROM Employee as e1
JOIN Employee as e2
ON e1.id = e2.managerId
GROUP BY e1.id, e1.name
HAVING COUNT(e2.id) >= 5;