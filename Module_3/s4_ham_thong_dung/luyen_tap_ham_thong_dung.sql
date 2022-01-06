use QuanLySinhVien;
-- Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất.
select * , max(credit) from subject;

-- Hiển thị các thông tin môn học có điểm thi lớn nhất
select subject.*, max(mark) as 'Điểm thi cao nhất' from subject
join mark on subject.SubID = mark.SubID;

-- Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần
select S.*, avg(mark) as 'điểm trung bình' from Student as S
join mark as M on S.StudentID = M.StudentID
group by StudentID
order by mark desc;
