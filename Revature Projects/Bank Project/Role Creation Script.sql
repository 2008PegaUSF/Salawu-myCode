create role employee login password 'password';

create role admins login password 'password' createdb createrole ;

create database bankdb;

grant connect on database bankdb to employee, admins;

