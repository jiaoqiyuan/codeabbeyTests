## 查找重复的电子邮箱（难度：简单）
  
题目：创建 email表，并插入如下三行数据:  
 
| Id | Email   |
|:---:|:---:
| 1  | a@b.com |
| 2  | c@d.com |
| 3  | a@b.com |
编写一个 SQL 查询，查找 Email 表中所有重复的电子邮箱。

创建 `datawhale` 数据库：

```sql
create database datawhale;
```

创建 `email` 数据表：
```sql
create table if not exists email (
    Id int not null primary key,
    Email varchar(255)
);
```

插入数据：

```sql
insert into email values(1, "a@b.com");
insert into email values(2, "c@d.com");
insert into email values(3, "a@b.com");
```

```
mysql> select * from email;
+----+---------+
| Id | Email   |
+----+---------+
|  1 | a@b.com |
|  2 | c@d.com |
|  3 | a@b.com |
+----+---------+
3 rows in set (0.01 sec)
```

查找重复数据的sql命令：

```sql
select Email from (select Email, count(Email) num from email group by Email) result where result.num >=2;
```

## 查找大国（难度：简单）

创建如下 World 表

| name | continent  | area | population | gdp|
|:---:|:---:|:---:|:---:|:---:
| Afghanistan | Asia | 652230 | 25500100 | 20343000 |
| Albania  | Europe | 28748  | 2831741 | 12960000 |
| Algeria | Africa | 2381741  | 37100000 | 188681000 |
| Andorra | Europe | 468 | 78115 | 3712000 |
| Angola | Africa | 1246700 | 20609294 | 100990000|

如果一个国家的面积超过300万平方公里，或者(人口超过2500万并且gdp超过2000万)，那么这个国家就是大国家。

编写一个SQL查询，输出表中所有大国家的名称、人口和面积。

例如，根据上表，我们应该输出:

| name         | population  | area         |
|:---:|:---:|:---:|
| Afghanistan  | 25500100    | 652230       |
| Algeria      | 37100000    | 2381741      |

创建 `world` 数据表：

```sql
CREATE TABLE World (
    name VARCHAR(50) NOT NULL,
    continent VARCHAR(50) NOT NULL,
    area INT NOT NULL,
    population INT NOT NULL,
    gdp INT NOT NULL
);
```

插入数据：

```sql
INSERT INTO World VALUES('Afghanistan','Asia',652230,25500100,20343000);
INSERT INTO World VALUES('Albania','Europe',28748,2831741,12960000);
INSERT INTO World VALUES('Algeria','Africa',2381741,37100000,188681000);
INSERT INTO World VALUES('Andorra','Europe',468,78115,3712000);
INSERT INTO World VALUES('Angola','Africa',1246700,20609294,100990000);
```

sql 语句：

```sql
select name, population, area from World where area > 3000000 or (population > 25000000 and gdp >20000000);
```