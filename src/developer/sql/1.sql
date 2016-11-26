ALTER TABLE developers ADD COLUMN salary NUMERIC(10,2) DEFAULT 0;

UPDATE developers SET salary = 110000 WHERE id = 1;
UPDATE developers SET salary = 120000 WHERE id = 2;
UPDATE developers SET salary = 130000 WHERE id = 3;
UPDATE developers SET salary = 140000 WHERE id = 4;
UPDATE developers SET salary = 150000 WHERE id = 5;
UPDATE developers SET salary = 160000 WHERE id = 6;
UPDATE developers SET salary = 170000 WHERE id = 7;
UPDATE developers SET salary = 180000 WHERE id = 8;
UPDATE developers SET salary = 190000 WHERE id = 9;
UPDATE developers SET salary = 200000 WHERE id = 10;
UPDATE developers SET salary = 210000 WHERE id = 11;
UPDATE developers SET salary = 220000 WHERE id = 12;
UPDATE developers SET salary = 1000   WHERE id = 13;