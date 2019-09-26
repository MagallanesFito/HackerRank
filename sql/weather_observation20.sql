SET @index := -1;
SELECT ROUND(AVG(tmp.lat),4)
FROM (
    SELECT @index := @index+1 as rowIndex,
    STATION.LAT_N as lat FROM STATION ORDER BY lat 
) as tmp
WHERE tmp.rowIndex in (FLOOR(@index/2),CEIL(@index/2))
