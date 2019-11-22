## 项目十: 各部门工资最高的员工

```sql
CREATE TABLE employee (
	id INT NOT NULL PRIMARY KEY,
	name VARCHAR(255) NOT NULL,
	salary INT NOT NULL,
	departmentid INT NOT NULL
);

INSERT INTO employee VALUES(1, 'Joe', 70000, 1);
INSERT INTO employee VALUES(2, 'Henry', 80000, 2);
INSERT INTO employee VALUES(3, 'Sam', 60000, 2);
INSERT INTO employee VALUES(4, 'Max', 90000, 1);

CREATE TABLE department(
	id INT NOT NULL PRIMARY KEY,
	name VARCHAR(255) NOT NULL
);

INSERT INTO department VALUES(1, 'IT');
INSERT INTO department VALUES(2, 'Sales');


SELECT de.name, em.name, salary
FROM employee em
	JOIN department de ON em.departmentid = de.id
WHERE (em.departmentid, em.salary) IN (
	SELECT departmentid, MAX(salary)
	FROM employee
	GROUP BY departmentid
);
```

## 项目十一: 换座位

## 项目十二:  分数排名

## 项目十三：连续出现的数字

## 项目十四：树节点 

## 项目十五：至少有五名直接下属的经理