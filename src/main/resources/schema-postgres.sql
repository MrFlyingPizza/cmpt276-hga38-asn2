DROP TABLE IF EXISTS rectangles;
CREATE TABLE cities(
    id serial PRIMARY KEY,
    name varchar(20),
    width int, height int,
    color char(7),
    loved_color char(7),
    hated_color char(7)
);