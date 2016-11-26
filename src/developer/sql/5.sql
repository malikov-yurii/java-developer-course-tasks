WITH
    t1 AS (SELECT DISTINCT
             projects.company_id  AS company_id,
             projects.customer_id AS customer_id,
             projects.id          AS project_id,
             (
               projects.cost -
               (SELECT sum(developers.salary)
                FROM developers
                WHERE developers.project_id = projects.id)
             )                    AS profit_per_project
           FROM projects
             INNER JOIN developers ON projects.id = developers.project_id),

    t2 AS (SELECT
             t1.company_id              AS company_id,
             min(t1.profit_per_project) AS worst_profit_from_project_per_compamy
           FROM t1
           GROUP BY
             t1.company_id
  )

SELECT
  companies.name                           AS company_name,
  customers.name                           AS customer_with_worst_project,
  projects.name                            AS worst_progect_name,
  t2.worst_profit_from_project_per_compamy AS worst_progect_income
FROM t1
  INNER JOIN t2 ON t1.company_id = t2.company_id AND t1.profit_per_project = t2.worst_profit_from_project_per_compamy
  INNER JOIN customers ON t1.customer_id = customers.id
  INNER JOIN companies ON t2.company_id = companies.id
  INNER JOIN projects ON t1.project_id = projects.id;