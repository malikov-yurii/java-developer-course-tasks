SELECT
  projects.name AS name_of_most_expensive_project,
  t1.project_salary_summ AS salary_sum
FROM (
       SELECT
         developers.project_id  AS most_expensive_project_id,
         sum(developers.salary) AS project_salary_summ
       FROM developers
       GROUP BY developers.project_id
       ORDER BY project_salary_summ DESC
       LIMIT 1
     ) AS t1
  INNER JOIN projects
    ON t1.most_expensive_project_id = projects.id;

