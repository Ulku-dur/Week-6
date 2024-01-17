# SQL Tables HMW

```sql
CREATE TABLE employee (
    id SERIAL PRIMARY KEY,
    name VARCHAR(50),
    birthday DATE,
    email VARCHAR(100)
);
--INSERT 
INSERT INTO employee (name, birthday, email) VALUES
('John Doe', '1990-01-15', 'john.doe@example.com'),
('Jane Smith', '1985-08-22', 'jane.smith@example.com'); 

NOTE : 50 data must be added

--UPDATE
UPDATE employee SET name = 'New Name' WHERE id = 10;
UPDATE employee SET birthday = '1992-05-20' WHERE id = 20;

--DELETE

DELETE FROM employee WHERE id = 1;
DELETE FROM employee WHERE birthday < '1990-01-01';




```

