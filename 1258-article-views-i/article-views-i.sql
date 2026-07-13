# Write your MySQL query statement below
SELECT distinct author_id AS  id 
FROM VIEWS
WHERE author_id = viewer_id
ORDER BY id ASC;