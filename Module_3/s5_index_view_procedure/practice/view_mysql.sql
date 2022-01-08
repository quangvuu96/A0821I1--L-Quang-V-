use classicmodels;

create view customers_view as
select customerNumber, customerName, phone from customers;

select * from customers_view;

-- Update view
create or replace view customers_view as
select customerNumber, customerName, contactFirstName, contactLastName, phone from customers
where city = 'Nantes';

DROP VIEW customers_view;
