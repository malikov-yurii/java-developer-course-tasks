DROP TABLE IF EXISTS developers_skills;
DROP TABLE IF EXISTS developers;
DROP TABLE IF EXISTS skills;
DROP TABLE IF EXISTS projects;
DROP TABLE IF EXISTS companies;
DROP TABLE IF EXISTS customers;

CREATE TABLE companies (
  id   SERIAL  NOT NULL PRIMARY KEY,
  name VARCHAR NOT NULL
);

CREATE TABLE customers (
  id   SERIAL  NOT NULL PRIMARY KEY,
  name VARCHAR NOT NULL
);

CREATE TABLE projects (
  id          SERIAL  NOT NULL PRIMARY KEY,
  name        VARCHAR NOT NULL,
  company_id  INTEGER NOT NULL,
  customer_id INTEGER NOT NULL,
  FOREIGN KEY (company_id) REFERENCES companies (id) ON DELETE CASCADE,
  FOREIGN KEY (customer_id) REFERENCES customers (id) ON DELETE CASCADE
);

CREATE TABLE developers (
  id         SERIAL  NOT NULL PRIMARY KEY,
  name       VARCHAR NOT NULL,
  company_id INTEGER NOT NULL,
  project_id INTEGER,
  FOREIGN KEY (company_id) REFERENCES companies (id) ON DELETE CASCADE,
  FOREIGN KEY (project_id) REFERENCES projects (id) ON DELETE CASCADE
);

CREATE TABLE skills (
  id   SERIAL  NOT NULL PRIMARY KEY,
  name VARCHAR NOT NULL
);

CREATE TABLE developers_skills (
  developer_id INTEGER NOT NULL,
  skill_id     INTEGER NOT NULL,

  CONSTRAINT u_constraint UNIQUE (skill_id, developer_id),
  FOREIGN KEY (developer_id) REFERENCES developers (id) ON DELETE CASCADE,
  FOREIGN KEY (skill_id) REFERENCES skills (id) ON DELETE CASCADE
);