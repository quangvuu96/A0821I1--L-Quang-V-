use QuanLyBanHang;
insert into customer values 
(1,'Minh Quan',10),
(2,'Ngoc Oanh',20),
(3,'Hong Ha',50);
insert into `order` (oID,cID,oDate) values
(1,1,'2006-03-21'),
(2,2,'2006-03-23'),
(3,1,'2006-03-16');
insert into product values
(1,'May Giat',3),
(2,'Tu Lanh',3),
(3,'Dieu Hoa',3),
(4,'Quat',3),
(5,'Bep Dien',3);
insert into orderdetail values
(1,1,3),
(1,3,7),
(1,4,2),
(2,1,1),
(3,1,8),
(2,5,4),
(2,3,3);

-- Hiển thị các thông tin  gồm oID, oDate, oPrice của tất cả các hóa đơn trong bảng Order
select oID, cID, oDate from `Order`;

-- Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua bởi các khách
select cName,pName from customer as c
join `order` as o on o.cID=c.cID
join orderdetail as od on od.oID=c.cID
join product as p on p.pID =od.pID;

-- 	Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào
select cName from customer
where not cName in ((select distinctrow cName from customer as c
join `order` as o on c.cID=o.cID ));