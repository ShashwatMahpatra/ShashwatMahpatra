# Write your MySQL query statement below
SELECT 
    p1.product_id,
    IFNULL(
        ROUND(
        SUM(p1.price * u1.units) / SUM(u1.units),
        2),0
    ) AS average_price
FROM Prices p1
LEFT JOIN UnitsSold u1
ON p1.product_id=u1.product_id
AND u1.purchase_date >= p1.start_date
AND u1.purchase_date <= p1.end_date
GROUP BY p1.product_id;