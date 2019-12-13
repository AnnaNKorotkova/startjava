\c jaegersdb;

CREATE TABLE jaegers (
    id SERIAL PRIMARY KEY NOT NULL,
    modelName VARCHAR(30) NOT NULL,
    mark VARCHAR(16),
    height REAL,
    weight REAL,
    activeStatus BOOLEAN,
    origin VARCHAR(30),
    launch DATE,
    kaijuKill SMALLINT
);

INSERT INTO jaegers (modelName, mark, height, weight, activeStatus, origin, launch, kaijuKill) VALUES 
    ('Cherno Alpha', 'Mark-1', 85.34, 2412.0, FALSE, 'Russia', '13-Sep-2015', 6),
    ('Tacit Ronin', 'Mark-1', 74.37, 7450.0, FALSE, 'Japan', '06-Dec-2015', 3),
    ('Horizon Brave', 'Mark-1', 72.54, 7890.0, FALSE, 'China', '22-Dec-2015', 7),
    ('Coyote Tango', 'Mark-1', 85.34, 2312.0, FALSE, 'Japan', '30-Dec-2015', 2),
    ('Gipsy Danger', 'Mark-3', 79.25, 1980.0, FALSE, 'Russia', '10-Jul-2017', 9),
    ('Crimson Typhoon', 'Mark-4', 76.20, 1722.0, FALSE, 'China', '22-Aug-2018', 7),
    ('Striker Eureka', 'Mark-5', 76.20, 1850.0, FALSE, 'Australia', '02-Nov-2019', 11),
    ('Bracer Phoenix', 'Mark-5', 70.91, 2128.0, FALSE, 'China', '01-Nov-2025', 1),
    ('Gipsy Avenger', 'Mark-6', 81.77, 2004.0, FALSE, 'USA', '12-Jan-2034', 1),
    ('Saber Athena', 'Mark-7', 76.91, 1628.0, FALSE, 'Australia', '20-Dec-2033', 1);
