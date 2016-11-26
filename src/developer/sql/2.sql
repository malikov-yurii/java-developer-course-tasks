SELECT
  t1.biggest_project_id,
  projects.name AS name_of_biggest_project,
  t1.project_salary_summ
FROM (
       SELECT
         developers.project_id  AS biggest_project_id,
         sum(developers.salary) AS project_salary_summ
       FROM developers
       GROUP BY developers.project_id
       ORDER BY project_salary_summ DESC
       LIMIT 1
     ) AS t1
  INNER JOIN projects
    ON t1.biggest_project_id = projects.id;

