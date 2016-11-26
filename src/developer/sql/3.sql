SELECT sum(developers.salary) AS total_sum_of_javists_salary
FROM
  developers
  INNER JOIN developers_skills ON developers.id = developers_skills.developer_id
  INNER JOIN skills ON skills.id = developers_skills.skill_id
GROUP BY skills.name
HAVING skills.name LIKE 'Java';