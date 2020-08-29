select *
from "Employee";
-- 1.1 SELECT
select "EmployeeId" , "LastName" , "Email" 
from "Employee"
where "LastName" = 'King.15';

select "City" , "State" 
from "Employee" 
where "FirstName" = 'Andrew' and "ReportsTo" is NULL;
-- 1.2 Sub Queries (Select in a Select)
/* select all record from the album table where the composer is AC/DC */
select * from "Album" where "AlbumId" in
(select "AlbumId" from "Track" where "Composer" ='AC/DC');
--1.3 order by
select *
from "Album" 
order by "Title" desc ;

select "FirstName" 
from "Customer" 
order by "City" ;

--1.6 like
select *
from "Invoice" 
where "BillingAddress" like 'T%';

--1.7 between
select *
from "Invoice" 
where "Total" between 15 and 20;

select *
from "Employee" 
where "HireDate" between '2003-06-01' and '2004-03-01';


--2.1 insert 
select * 
from "Genre" ; /*I did this to see what the column names are (how they're spelled), 
also to see what the last Id entry is so I dont end up updating an already existing record */
insert into "Genre" values 
(26,'Hippity Hop');
(27,'Jazzy Jazz');

select * 
from "Employee" ;
insert into "Employee" values 
(9,'Hancock','John','Superhero',1, '2000-03-24', '2020-03-24', '2020 Covid lane SW', 'Calgary', 'AB', 'Canada', 'T2P 2K6', '+1 (403) 123-4567', '+1 (780) 123-4567', 'john@chinookcorp.com'),
(10,'Super','Man','Superhero',5,'1995-01-01', '2000-03-01','01 No Kryptonite alowed lane', 'Calgary', 'AB', 'Canda', 'T2P 2k9', '+1 (404) 123-4567', '+1 (678) 123-4567', 'man@chinookcorp.com');

select *
from "Customer" ;
insert into "Customer" values
(60,'Mojid','Santa','Revature','2020 Coding lane', 'Tampa', 'Fl', 'USA', '30034', '+1 (770) 123-4567', '+1 (675) 123-4567', 'msanta@revature.com', 5),
(61,'Sam','smith', 'Postgres', '301 Boy do code Street','Tampa','Fl','USA','30034','+1 (680) 123-4567','+1 (789) 123-4567', 'ssmith@postgres.com',3);


--2.2 update
update "Customer" 
set "FirstName" = 'Robert', "LastName" = 'Walter'
where "FirstName" = 'Aaron';

update "Artist" 
set "Name" = 'CCR'
where "Name" = 'Creedence Clearwater Revival';

--2.3 delete
delete from "InvoiceLine" where "InvoiceId" in
(select "InvoiceId" from "Invoice" where "CustomerId" in 
(select "CustomerId" from "Customer" where "FirstName" = 'Robert' and "LastName" = 'Walter'));

delete from "Invoice" where "CustomerId" in 
(select "CustomerId" from "Customer" where "FirstName" = 'Robert' and "LastName" = 'Walter');

delete from "Customer" where "FirstName" = 'Robert' and "LastName" = 'Walter';


--3.1 system defined functions
select now();

select length("Name") from "MediaType";

--3.2 system defined agregate functions
select avg("Total" ) as Average_of_total_of_invoice from "Invoice";

select max("UnitPrice" ) as Most_Expensive_Track from "Track" ;


--3.3 user defined functions
select avg("UnitPrice" ) from "InvoiceLine";

select * from "Employee" where "BirthDate" > '1968-12-31' order by "BirthDate" ;


--4.1 after insert trigger
create or replace function emp_phone()
returns trigger as $$
begin
	if(TG_OP = 'INSERT') then
	new."Phone" = '867-5309';
	end if;
	return new;
end;
$$ language plpgsql;

create trigger employee_insert
after insert on "Employee"
for each row
execute function emp_phone();

insert into "Employee" ("EmployeeId" ,"FirstName" , "LastName" ,"Email" ) values
(15, 'Avery', 'Gains','avery@comcast');

insert into "Employee" ("EmployeeId" ,"FirstName" , "LastName" ,"Email" ,"Phone" ) values
(20,'Jason','Whale','jason@tacobell','(404) 205-1553');

--4.2 before insert trigger
create or replace function cus_comp()
returns trigger as $$
begin
	if(TG_OP = 'INSERT') then
	new."Company" = 'Revature';
	end if;
	return new;
end;
$$ language plpgsql;

create trigger company_insert
before insert on "Customer"
for each row
execute function cus_comp();

insert into "Customer" ("CustomerId" ,"FirstName" ,"LastName" ,"Email" ) values
(77,'Morgan','Freedwoman','freedwoman@kswiss');

insert into "Customer" ("CustomerId" ,"FirstName" , "LastName" , "Email" , "Company" ) values
(75,'Jack', 'Rabbit', 'rabbit@cereal','Comcast');


--5.1 inner joins
select "FirstName" ,"LastName" , "InvoiceId" from "Customer" inner join "Invoice"
on "Customer"."CustomerId" = "Invoice"."CustomerId";


--5.2 Full Outter join
select "Customer"."CustomerId" , "FirstName" ,"LastName" ,"InvoiceId", "Total" from "Customer" full  join "Invoice" 
on "Customer"."CustomerId" = "Invoice"."CustomerId";

--5.3 right join
select "Name" as Artist_Name,"Title" from "Album" right join "Artist" 
on "Album"."ArtistId" = "Artist"."ArtistId" ;


--5.4 cross join
select * from "Album" cross join "Artist"
order by "Name" asc ;

--5.5 self join
select "Employee"."EmployeeId" ,"Employee"."FirstName" || "Employee"."LastName" as Name, "Employee"."ReportsTo" 
from "Employee" a join "Employee" 
on "Employee"."EmployeeId" = "Employee"."ReportsTo";


--6.1 union
select "LastName" , "FirstName", "Phone" from "Customer" -- <--notice no ; here!!
union 
select "LastName" , "FirstName", "Phone" from "Employee" ;

--6.2 except all
select "City" , "State" , "PostalCode" from "Customer" 
except all
select "City" , "State" , "PostalCode" from "Employee" ;