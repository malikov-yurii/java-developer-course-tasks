SELECT sum(t1.java_developer_salary) AS total_salary_of_javists
FROM
  (
    SELECT salary AS java_developer_salary
    FROM developers
      INNER JOIN developers_skills
        ON developers.id = developers_skills.developer_id AND developers_skills.skill_id = 1
  ) AS t1;