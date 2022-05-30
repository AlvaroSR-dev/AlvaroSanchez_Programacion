create database empresa;

use empresa;

create table factura(
    id varchar(100) primary key not null,
    compania varchar(100),
    telefono varchar(100),
    total int
);

create table filtrada(
    id varchar(100) primary key not null,
    compania varchar(100),
    telefono varchar(100),
    total int
);

select * from factura where total >= 10000;

truncate table factura;

select * from filtrada;