INSERT INTO companies (name) VALUES ('Softserv');
INSERT INTO companies (name) VALUES ('Luxsoft');
INSERT INTO companies (name) VALUES ('Ciklum');

INSERT INTO customers (name) VALUES ('Privat Bank');
INSERT INTO customers (name) VALUES ('Alfa Bank');
INSERT INTO customers (name) VALUES ('Oschad Bank');

INSERT INTO projects (name, company_id, customer_id) VALUES ('Privat24', 1, 1);
INSERT INTO projects (name, company_id, customer_id) VALUES ('Privat24 mobile', 2, 1);
INSERT INTO projects (name, company_id, customer_id) VALUES ('Alfa24', 2, 2);
INSERT INTO projects (name, company_id, customer_id) VALUES ('Alfa24 mobile', 3, 2);
INSERT INTO projects (name, company_id, customer_id) VALUES ('Oschad24', 3, 3);
INSERT INTO projects (name, company_id, customer_id) VALUES ('Oschad24 mobile', 1, 3);

INSERT INTO developers (name, company_id, project_id) VALUES ('Rob', 1, 1);
INSERT INTO developers (name, company_id, project_id) VALUES ('Bob', 1, 6);
INSERT INTO developers (name, company_id, project_id) VALUES ('Dick', 2, 2);
INSERT INTO developers (name, company_id, project_id) VALUES ('Rick', 2, 3);
INSERT INTO developers (name, company_id, project_id) VALUES ('Moss', 3, 4);
INSERT INTO developers (name, company_id, project_id) VALUES ('Ross', 3, 5);
INSERT INTO developers (name, company_id, project_id) VALUES ('Lob', 1, 1);
INSERT INTO developers (name, company_id, project_id) VALUES ('Zob', 1, 6);
INSERT INTO developers (name, company_id, project_id) VALUES ('Nick', 2, 2);
INSERT INTO developers (name, company_id, project_id) VALUES ('Mick', 2, 3);
INSERT INTO developers (name, company_id, project_id) VALUES ('Toss', 3, 4);
INSERT INTO developers (name, company_id, project_id) VALUES ('Loss', 3, 5);

INSERT INTO skills (name) VALUES ('Java');
INSERT INTO skills (name) VALUES ('C++');
INSERT INTO skills (name) VALUES ('Javascript');

INSERT INTO developers_skills VALUES (1, 1);
INSERT INTO developers_skills VALUES (2, 1);
INSERT INTO developers_skills VALUES (2, 2);
INSERT INTO developers_skills VALUES (3, 1);
INSERT INTO developers_skills VALUES (3, 2);
INSERT INTO developers_skills VALUES (3, 3);
INSERT INTO developers_skills VALUES (4, 1);
INSERT INTO developers_skills VALUES (5, 1);
INSERT INTO developers_skills VALUES (5, 2);
INSERT INTO developers_skills VALUES (6, 1);
INSERT INTO developers_skills VALUES (6, 2);
INSERT INTO developers_skills VALUES (6, 3);
INSERT INTO developers_skills VALUES (7, 1);
INSERT INTO developers_skills VALUES (8, 1);
INSERT INTO developers_skills VALUES (8, 2);
INSERT INTO developers_skills VALUES (9, 1);
INSERT INTO developers_skills VALUES (9, 2);
INSERT INTO developers_skills VALUES (9, 3);
INSERT INTO developers_skills VALUES (10, 1);
INSERT INTO developers_skills VALUES (11, 1);
INSERT INTO developers_skills VALUES (11, 2);
INSERT INTO developers_skills VALUES (12, 1);
INSERT INTO developers_skills VALUES (12, 2);
INSERT INTO developers_skills VALUES (12, 3);