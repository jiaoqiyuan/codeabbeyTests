## 2.1

### 超过5名学生的课

```sql
CREATE TABLE courses if NOT EXISTS(
	student VARCHAR(255) NOT NULL,
	class VARCHAR(255) NOT NULL
);

INSERT INTO courses VALUES('A', 'Math');
INSERT INTO courses VALUES('B', 'English');
INSERT INTO courses VALUES('C', 'Math');
INSERT INTO courses VALUES('D', 'Biology');
INSERT INTO courses VALUES('E', 'Math');
INSERT INTO courses VALUES('F', 'Computer');
INSERT INTO courses VALUES('G', 'Math');
INSERT INTO courses VALUES('H', 'Math');
INSERT INTO courses VALUES('I', 'Math');
INSERT INTO courses VALUES('A', 'Math');

SELECT class
FROM (
	SELECT class, COUNT(class) AS num
	FROM courses
	GROUP BY class
) r1
WHERE r1.num >= 5;
```

### 交换工资

```sql
CREATE TABLE salary (
	id INT NOT NULL PRIMARY KEY,
	name VARCHAR(255) NOT NULL,
	sex VARCHAR(10) NOT NULL,
	salary INT NOT NULL
);

# 插入数据
INSERT INTO salary VALUES(1, 'A', 'm', 2500);
INSERT INTO salary VALUES(2, 'B', 'f', 1500);
INSERT INTO salary VALUES(3, 'C', 'm', 5500);
INSERT INTO salary VALUES(4, 'D', 'f', 500);

# 交换 f 和 m 的值
SELECT name, (CASE WHEN sex='f' THEN 'm' ELSE 'f' END) AS aaa FROM salary;
SELECT * FROM salary;

UPDATE salary SET sex=(CASE WHEN sex='f' THEN 'm' ELSE 'f' END);
```

### 有趣的电影

```sql
CREATE TABLE cinema (
	id INT NOT NULL PRIMARY KEY,
	movie VARCHAR(255) NOT NULL,
	description VARCHAR(1024) NOT NULL,
	rating FLOAT NOT NULL
);

INSERT INTO cinema VALUES(1, 'War', 'great 3D', 8.9);
INSERT INTO cinema VALUES(2, 'Science', 'fiction', 8.5);
INSERT INTO cinema VALUES(3, 'irish', 'boring', 6.2);
INSERT INTO cinema VALUES(4, 'Ice song', 'Fantacy', 8.6);
INSERT INTO cinema VALUES(5, 'House card', 'Interesting', 9.1);

SELECT * from cinema;

SELECT *
FROM cinema
WHERE description <> 'boring'
	AND id % 2 <> 0
ORDER BY rating DESC;
```

