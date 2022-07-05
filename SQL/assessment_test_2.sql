/* 1. */
SELECT * FROM cd.facilities;

/* 2. */
SELECT name, membercost FROM cd.facilities;

/* 3. */
SELECT * FROM cd.facilities
WHERE membercost > 0
LIMIT 5

/* 4. */
SELECT facid,name,membercost, monthlymaintenance FROM cd.facilities
WHERE membercost > 0
AND (membercost<monthlymaintenance/50)

/* 5. */
SELECT * FROM cd.facilities
WHERE name ILIKE '%Tennis%'

/* 6. */
SELECT * FROM  cd.facilities
WHERE facid IN(1,5)

/* 7. */
SELECT * FROM cd.members 
WHERE joindate >= '2012-09-01'

/* 8. */
SELECT DISTINCT(surname)
FROM cd.members
ORDER BY surname
LIMIT 10

/* 9. */
SELECT MAX(joindate) FROM cd.members

/* 10. */

SELECT COUNT(*) 
FROM cd.facilities
WHERE guestcost >=10

/* 11. */
SELECT facid, SUM(slots) AS total_slots
FROM cd.bookings
WHERE starttime >= '2012-09-01'
AND starttime < '2012-10-01' 
GROUP BY facid
ORDER BY SUM(slots)


/* 12. */
SELECT facid,SUM(slots) AS total_slots
FROM cd.bookings
GROUP BY facid
HAVING SUM(slots) > 1000
ORDER BY facid+

/* 13 .*/

SELECT b.starttime as start, f.name
FROM cd.bookings b
INNER JOIN cd.facilities f
ON b.facid = f.facid
WHERE starttime BETWEEN '2012-09-21' AND '2012-09-22'
AND f.name ILIKE '%Tennis Court%'
ORDER BY starttime


/* 14 .*/
SELECT b.starttime FROM cd.bookings b 
INNER JOIN cd.members m
ON b.memid = m.memid
WHERE m.firstname = 'David'
AND m.surname ='Farrell'