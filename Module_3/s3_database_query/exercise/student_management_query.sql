use QuanLySinhVien;
-- Hiển thị tất cả các sinh viên có tên bắt đầu bằng kí tự 'h'
select S.StudentID, S.StudentName, C.ClassName from Student as S
join Class as C on S.ClassID = C.ClassID 
where S.StudentName like 'h%';

-- Hiển thị các thông tin lớp học có thời gian bắt đầu vào tháng 12
select * from Class
where month(StartDate) = 12;

-- Hiển thị tất cả các thông tin môn học có credit trong khoảng 3-5
select * from subject
where credit between 3 and 5;

-- Thay đổi mã lớp(ClassID) của sinh viên có tên ‘Hung’ là 2
update Student
set ClassID = 2
where StudentName = 'Hung';

-- Hiển thị các thông tin: StudentName, SubName, Mark. Dữ liệu sắp xếp theo điểm thi (mark) giảm dần. nếu trùng sắp theo tên tăng dần
select S.StudentName, Sub.SubName, M.Mark from student as S
join class as C on S.ClassID = C.ClassID
join subject as Sub on C.ClassID = S.ClassID
join mark as M on M.StudentID = S.StudentID
order by  M.Mark desc, S.StudentName asc;
