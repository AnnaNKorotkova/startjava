\c jaegersdb;

SELECT * FROM jaegers;
SELECT * FROM jaegers WHERE activeStatus IS TRUE;
SELECT * FROM jaegers WHERE mark IS Mark-1 and Mark-2;
SELECT * FROM jaegers WHERE mark IN('Mark-1', 'Mark-6');
SELECT * FROM jaegers ORDER BY mark DESC;
SELECT * FROM jaegers WHERE launch = (SELECT MIN(launch) FROM jaegers);
SELECT * FROM jaegers WHERE kaijukill = (SELECT MAX(kaijukill) FROM jaegers) or 
		kaijukill = (SELECT MIN(kaijukill) FROM jaegers) ORDER BY kaijukill DESC;
SELECT AVG(weight) FROM jaegers;
-- Для выполнения следующего пункта внесла доп. изменения
UPDATE jaegers SET activeStatus = TRUE WHERE ID > 5;
UPDATE jaegers SET kaijukill = kaijukill + 1 WHERE activeStatus = TRUE;
DELETE FROM jaegers WHERE activeStatus = FALSE;
