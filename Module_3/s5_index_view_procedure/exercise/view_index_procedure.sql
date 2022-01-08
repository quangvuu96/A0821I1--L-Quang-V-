-- Bước 1 
create database product;
use product;
-- Bước 2
create table Products(
id int primary key,
productCode int,
productName varchar(50),
productPrice double,
productAmount int,
productDescription varchar(50),
productStatus varchar(50)
);

insert into products 
values(1,101,'iphone 13',13000,2,'black','available'),
(2,102,'iphone 12',11000,3,'white','available'),
(3,103,'iphone 7',9000,0,'white','unavailable'),
(4,104,'iphone 8',9500,5,'black','available'),
(5,105,'iphone 11',11400,1,'blue','available');

-- Bước 3
create unique index idx_productCode on products (productCode);
ALTER TABLE products ADD INDEX idx_productName_productPrice(productName,productPrice);
explain select * from products
where productCode = 101;

select * from products
where productCode = 102;

-- Bước 4
create view product_view as
select productCode, productName, productPrice, productStatus from products;

create or replace view product_view as
select productCode, productName, productPrice, productStatus from products
where productStatus = 'available';

drop view product_view;

-- Bước 5
-- Tạo store procedure lấy tất cả thông tin của tất cả các sản phẩm trong bảng product
delimiter //
create procedure getAll()
begin 
select * from products;
end //
delimiter ;
call getAll();

-- Tạo store procedure thêm một sản phẩm mới
delimiter //
drop procedure if exists `addProduct` //
create procedure addProduct(in id int, in productCode int, in productName varchar(50),
 in productPrice double, in productAmount int, in productDescription varchar(50), in productStatus varchar(50))
begin 
	insert into products 
    values (id,productCode,productName,productPrice,productAmount,productDescription,productStatus);
end //
delimiter ;

call addProduct(7,107,'iphone 7 plus',7000, 1, 'gold', 'available');

-- Tạo store procedure sửa thông tin sản phẩm theo id
delimiter //
create procedure updateProduct(in p_id int, in p_productCode int, in p_productName varchar(50),
 in p_productPrice double, in p_productAmount int, in p_productDescription varchar(50), in p_productStatus varchar(50))
begin 
	update products 
    set productCode = p_productCode, productName = p_productName, productPrice = p_productPrice, productAmount = p_productAmount,productDescription = p_productDescription,
    productStatus = p_productStatus
    where id = p_id;
end //
delimiter ;
call updateProduct(7,107,'iphone 7 plus',7000, 10, 'gold', 'available');

-- Tạo store procedure xoá sản phẩm theo id
delimiter //
create procedure delProduct(in p_id int)
begin 
	delete from products
    where id = p_id;
end //
delimiter ;
call delProduct(7);



