use classicmodels;

delimiter //
create procedure getCusByID (IN cusNum int(11))
begin 
select * from customers 
where customerNumber = cusNum;
end //
delimiter ;
call getCusById(175);

delimiter //
create procedure getCustomersCountByCity(in in_city varchar(50), out total int)
begin
select count(customerNumber) into total from customers
where city = in_city;
end //
delimiter ;
CALL GetCustomersCountByCity('Lyon',@total);

SELECT @total;

DELIMITER //
CREATE PROCEDURE SetCounter(INOUT counter INT,IN inc INT)
BEGIN
    SET counter = counter + inc;
END//
DELIMITER ;

set @counter = 1;

call SetCounter(@counter, 1);
call SetCounter(@counter, 1);
call SetCounter(@counter, 5);
select @counter;