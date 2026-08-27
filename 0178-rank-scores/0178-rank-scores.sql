SELECT 
    s.score,
    (
        SELECT COUNT(DISTINCT s2.score)
        FROM Scores s2
        WHERE s2.score > s.score
    ) + 1 AS `rank`
FROM Scores s
ORDER BY s.score DESC;