WITH
    t1 AS (SELECT DISTINCT
             projects.company_id AS company_id,
             projects.id         AS project_id,
             (
               projects.cost -
               (SELECT sum(developers.salary)
                FROM developers, projects_developers
                WHERE projects_developers.project_id = projects.id AND projects_developers.developer_id = developers.id)
             )                   AS profit_per_project
           FROM projects),

    t2 AS (SELECT t1.project_id
           FROM t1
           ORDER BY profit_per_project ASC
           LIMIT 1
  )
SELECT avg(salary) AS average_developer_salary_of_worst_profit_project
FROM developers, t2, projects_developers
WHERE projects_developers.project_id = t2.project_id AND developers.id = projects_developers.developer_id;