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
             t1.customer_id             AS customer_id,
             sum(t1.profit_per_project) AS sum_of_projects_profit_from_customer_per_company
           FROM t1

           GROUP BY
             company_id, t1.customer_id),

    t3 AS (SELECT
             t2.company_id                                            AS company_id,
             min(
                 t2.sum_of_projects_profit_from_customer_per_company) AS sum_of_projects_of_customer_with_min_profit_per_company
           FROM
             t2
           GROUP BY
             t2.company_id)

SELECT
  companies.name                                      AS company_name,
  customers.name                                      AS worst_customer,
  t2.sum_of_projects_profit_from_customer_per_company AS total_sum_of_worst_customer
FROM t2
  INNER JOIN t3 ON t3.company_id = t2.company_id
  INNER JOIN companies ON t2.company_id = companies.id
  INNER JOIN customers ON t2.customer_id = customers.id
WHERE
  t2.sum_of_projects_profit_from_customer_per_company = t3.sum_of_projects_of_customer_with_min_profit_per_company;