# Write your MySQL query statement below
with processtime AS(
     select
        a.machine_id,
        b.process_id,
        (b.timestamp - a.timestamp) as process_time
    
    from activity a
    join activity b
    on
    a.machine_id = b.machine_id
    AND a.process_id = b.process_id
    AND a.activity_type = 'start'
    AND b.activity_type = 'end'
),

     machineAverage AS(
    select machine_id,
        Round(Avg(process_time), 3) as processing_time
    from 
            processtime
    group by 
            machine_id
)

select 
    machine_id, processing_time
from 
    machineAverage
order by 
    machine_id
