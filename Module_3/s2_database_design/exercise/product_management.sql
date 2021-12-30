create database QuanLyBanHang;
use QuanLyBanHang;
create table Customer(
cID int not null auto_increment primary key,
cName varchar(50) not null,
cAge varchar(20)
);
create table `Order`(
oID int auto_increment primary key,
cID int not null,
oDate datetime not null,
oTotalPrice int not null,
foreign key (cID) references Customer (cID)
);
create table Product(
pID int not null auto_increment primary key,
pName varchar(50) not null,
pPrice int not null
);
create table OrderDetail(
oID int not null,
pID int not null,
odQTY varchar(20),
foreign key (oID) references `Order` (oID),
foreign key (pID) references Product (pID)
);


