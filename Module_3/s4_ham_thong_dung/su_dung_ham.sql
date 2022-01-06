use QuanLySinhVien;
-- Hiển thị số lượng sinh viên ở từng nơi
select address, count(*) as 'Số lương sinh viên' from student
group by address; 

-- Tính điểm trung bình các môn học của mỗi học viên
select S.StudentID, S.StudentName, avg(Mark) from student as S
join Mark as M on S.StudentID = M.StudentID
group by S.StudentID, S.StudentName;

-- Hiển thị những bạn học viên có điểm trung bình các môn học lớn hơn 15
select S.StudentID, S.StudentName, avg(Mark) from student as S
join Mark as M on S.StudentID = M.StudentID
group by S.StudentID, S.StudentName
having avg(mark) > 15;

-- Hiển thị thông tin các học viên có điểm trung bình lớn nhất.
select S.StudentID, S.StudentName, avg(Mark) from student as S
join Mark as M on S.StudentID = M.StudentID
group by S.StudentID, S.StudentName
having avg(mark) >=  all(select avg(mark) from mark group by Mark.StudentID);