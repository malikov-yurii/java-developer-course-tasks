ALTER TABLE projects ADD COLUMN cost INTEGER DEFAULT 0;

UPDATE projects SET cost = 1000000 WHERE id = 1;
UPDATE projects SET cost = 2000000 WHERE id = 2;
UPDATE projects SET cost = 3000000 WHERE id = 3;
UPDATE projects SET cost = 4000000 WHERE id = 4;
UPDATE projects SET cost = 5000000 WHERE id = 5;
UPDATE projects SET cost = 6000000 WHERE id = 6;
