create database boilerplate;
create role test login;
alter role test password 'postgres';
grant connect on database boilerplate to test;
grant all privileges on database boilerplate to test;