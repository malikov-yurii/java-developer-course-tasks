INSERT INTO companies (name)
VALUES
  ('Softserv'),
  ('Luxsoft'),
  ('Ciklum');

INSERT INTO customers (name)
VALUES
  ('Privat Bank'),
  ('Alfa Bank'),
  ('Oschad Bank');

INSERT INTO projects (name, company_id, customer_id)
VALUES
  ('Privat24', 1, 1),
  ('Privat24 mobile', 2, 1),
  ('Alfa24', 2, 2),
  ('Alfa24 mobile', 3, 2),
  ('Oschad24', 3, 3),
  ('Oschad24 mobile', 1, 3),
  ('Privat24 old', 1, 1);

INSERT INTO developers (name, company_id)
VALUES
  ('Rob', 1),
  ('Bob', 1),
  ('Dick', 2),
  ('Rick', 2),
  ('Moss', 3),
  ('Ross', 3),
  ('Lob', 1),
  ('Zob', 1),
  ('Nick', 2),
  ('Mick', 2),
  ('Toss', 3),
  ('Loss', 3),
  ('Zob', 1);

INSERT INTO projects_developers (project_id, developer_id)
VALUES
  (1, 1),
  (6, 2),
  (2, 3),
  (3, 4),
  (4, 5),
  (5, 6),
  (1, 7),
  (6, 8),
  (2, 9),
  (3, 10),
  (4, 11),
  (5, 12),
  (7, 13),
  (6, 1);

INSERT INTO skills (name)
VALUES
  ('Java'),
  ('C++'),
  ('Javascript');

INSERT INTO developers_skills (developer_id, skill_id)
VALUES
  (1, 1),
  (2, 1),
  (2, 2),
  (3, 1),
  (3, 2),
  (3, 3),
  (4, 1),
  (5, 1),
  (5, 2),
  (6, 1),
  (6, 2),
  (6, 3),
  (7, 1),
  (8, 2),
  (9, 1),
  (9, 2),
  (9, 3),
  (10, 1),
  (11, 1),
  (11, 2),
  (12, 1),
  (12, 2),
  (12, 3),
  (13, 1);