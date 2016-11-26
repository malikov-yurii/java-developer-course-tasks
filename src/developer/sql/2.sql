SELECT
  projects.name            AS name_of_most_expensive_project,
  t1.salary_sum_of_project AS salary_sum_of_most_expensive_project
FROM
  projects
  INNER JOIN (SELECT
                projects_developers.project_id,
                sum(developers.salary) AS salary_sum_of_project
              FROM projects_developers, developers
              WHERE projects_developers.developer_id = developers.id
              GROUP BY projects_developers.project_id
              ORDER BY salary_sum_of_project DESC
              LIMIT 1) AS t1
    ON
      projects.id = t1.project_id;

