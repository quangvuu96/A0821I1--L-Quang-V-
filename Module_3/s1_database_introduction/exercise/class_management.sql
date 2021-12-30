create database class_management;
use class_management;
create table class(
id_class int,
`name_class` varchar(50) 
);
create table teacher(
id_teacher int not null,
`name_teacher` varchar(50),
age int null,
country varchar(50)
);