use QuanLySinhVien;
-- Hiển thị danh sách tất cả các học viên
select * from Student;

-- Hiển thị danh sách học viên đang theo học
select * from Student 
where Status = true;

-- Hiển thị danh sách môn học có thời gian nhỏ hơn 10
select * from Subject
where Credit < 10;

-- Hiển thị danh sách học viên lớp A1
select S.StudentID, S.StudentName, C.ClassName from Student as S
join Class as C on S.ClassId = C.ClassID 
where C.ClassName = 'A1';

-- Hiển thị điểm môn CF
select S.StudentID, S.StudentName, Sub.SubName, M.Mark from Student as S
join Mark as M on S.StudentID = M.StudentID
join Subject as Sub on M.SubID = Sub.SubID
where Sub.SubName = 'CF';