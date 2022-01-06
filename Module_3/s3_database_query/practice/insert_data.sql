use QuanLySinhVien;
insert into Class 
values (1, 'A1', '2018-12-20',1),
(2,'A2','2018-12-22',1),
(3,'B3', current_date, 0);

insert into Student (StudentName, Address, Phone,Status, ClassID)
values ( 'Vu','Da Nang', '0905755309',1,1),
( 'Hai','Da Nang', '0905220501',0,2);
insert into Student(StudentName,Address, Status, ClassID)
values ('Hoa', 'Hai Phong', 1,1);

insert into Subject
values (1, 'CF', 5,1),
(2,'C',6,1) ,
(3,'HDJ',5,1),
(4,'RDBMS',10,1);

INSERT INTO Mark (SubId, StudentId, Mark, ExamTimes)
VALUES (1, 1, 8, 1),
       (1, 2, 10, 2),
       (2, 1, 12, 1);

