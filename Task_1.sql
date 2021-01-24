


select courses.name as Courses_Name, teachers.name as Teachers_Name from courses inner join teachers on courses.id = teachers.id;





select courses.teacher_id, teachers.name, count(courses.teacher_id) as Occurancevalue 
from courses 
inner join teachers on courses.teacher_id = teachers.id 
group by teacher_id 
order by Occurancevalue desc limit 1;





select name,id from teachers where id not in (select teacher_id as id from courses);
