
create schema public;
CREATE TABLE public.films(
                             id int PRIMARY KEY GENERATED ALWAYS AS ( IDENTITY ),
                             title VARCHAR(100) NOT NULL,
                             year int,
                             genre VARCHAR(20),
                             watched BIT DEFAULT false  NOT NULL
);
