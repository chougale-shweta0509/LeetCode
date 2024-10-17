# Write your MySQL query statement below
select name
from customer
where ifNull (referee_id, 0) != 2;