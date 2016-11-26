WITH
    t1 AS (SELECT DISTINCT
             projects.company_id AS company_id,
             projects.id         AS project_id,
             (
               projects.cost -
               (SELECT sum(developers.salary)
                FROM developers
                WHERE developers.project_id = projects.id)
             )                   AS profit_per_project
           FROM projects
             INNER JOIN developers ON projects.id = developers.project_id),

    t2 AS (SELECT t1.project_id
           FROM t1
           ORDER BY profit_per_project ASC
           LIMIT 1
  )

SELECT avg(salary) AS average_developer_salary_of_worst_profit_project
FROM developers, t2
WHERE developers.project_id = t2.project_id;