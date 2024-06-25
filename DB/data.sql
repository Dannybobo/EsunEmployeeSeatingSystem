-- data.sql
USE esun_sys;

-- Add Seats
INSERT INTO SeatingChartTb (FLOOR_NO, SEAT_NO) VALUES
(1, 1),(1, 2),(1, 3),(1, 4),
(2, 1),(2, 2),(2, 3),(2, 4),
(3, 1),(3, 2),(3, 3),(3, 4),
(4, 1),(4, 2),(4, 3),(4, 4);

-- Add Employees
INSERT INTO EmployeeTb (NAME, EMAIL, EID) VALUES
('Alice', 'alice@esun.com', 11221),
('Bob', 'bob@esun.com', 12006),
('Charlie', 'charlie@esun.com', 13040),
('Dabby', 'dabby@esun.com', 16142),
('Elie', 'elie@esun.com', 16722),
('Frank', 'frank@esun.com', 17081);
