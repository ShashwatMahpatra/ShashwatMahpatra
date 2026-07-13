# Write your MySQL query statement below
SELECT today.id 
FROM Weather as today
JOIN Weather as yesterday
ON Datediff(today.recordDate,yesterday.recordDate)=1
where today.temperature > yesterday.temperature;
