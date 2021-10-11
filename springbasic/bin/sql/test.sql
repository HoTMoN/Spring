select * from MEMBER;

select d.dname, count(e.empno)
from emp e, dept d
where e.deptno = d.deptno
group by d.dname;

update MEMBER
set point = 1000
where id = 'hong';
