show tables;

create table `teacher`
(
    `id`   int(10)     not null,
    `name` varchar(30) not null,
    primary key (`id`)
) engine = innodb
  default charset = utf8;

desc teacher;
insert into `teacher`
values (1, "秦老师");
select *
from teacher;

create table `student`
(
    `id`   int(10)     not null,
    `name` varchar(30) not null,
    `tid`  int(10)     not null,
    primary key (`id`),
    key `fktid` (`tid`),
    constraint `fktid` foreign key (`tid`) references `teacher` (`id`)
) engine = innodb
  default charset = utf8;

insert into student
values (1, "小明", 1);
insert into student
values (2, "小红", 1);
insert into student
values (3, "小张", 1);
insert into student
values (4, "小李", 1);
insert into student
values (5, "小王", 1);

select *
from student;

-- 查询所有学生以及都应老师的信息
select s.id, s.name, t.name
from student s,
     teacher t
where s.tid = t.id;

-- 查询指定老师及其所有学生
select t.name, s.id, s.name
from teacher t,
     student s
where t.id = s.tid;

-- 创建一张博客表
create table `blog` (
    `id` varchar(50) not null comment '播客id',
    `title` varchar(100) not null comment '播客标题',
    `author` varchar(30) not null comment '播客作者',
    `create_time` datetime not null comment '创作时间',
    `views` int(30) not null comment '浏览量'
) engine = innodb default charset = utf8;

desc blog;

select * from blog where title = 'Mybatis如此简单';