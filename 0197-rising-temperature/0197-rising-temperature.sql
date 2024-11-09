# Write your MySQL query statement below
select w1.id
from weather as w1
join weather as w2 on w1.recordDate = Date_Add(w2.recordDate, interval 1 day)
where w1.temperature > w2.temperature;
   
    #JOIN Weather W2 ON W1.recordDate = DATE_ADD(W2.recordDate, INTERVAL 1 DAY)
