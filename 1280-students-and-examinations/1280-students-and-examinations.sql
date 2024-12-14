# Write your MySQL query statement below
SELECT s.student_id, s.Student_name, sub.subject_name,
    COUNT(e.subject_name) AS attended_exams
FROM students s
CROSS JOIN subjects sub
LEFT JOIN Examinations e
on s.student_id = e.student_id AND sub.subject_name = e.subject_name
GROUP BY s.student_id, s.Student_name, sub.subject_name
ORDER BY s.student_id, sub.subject_name