DELETE FROM job
WHERE job_name = 'Support'
RETURNING job_id, job_name

