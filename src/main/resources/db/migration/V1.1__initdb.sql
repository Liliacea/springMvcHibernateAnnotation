
create schema public;
CREATE TABLE public.films(
                      id INT  GENERATED always as identity unique ,
                      title  varchar(100) NOT NULL,
                      year int not null,
                      genre varchar(50) not null,
                      watched boolean not null
);
