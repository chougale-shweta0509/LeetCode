# Write your MySQL query statement below
select name
from customer
where referee_id IS NULL OR referee_id != 2;
#where ifNull (referee_id, 0) != 2;