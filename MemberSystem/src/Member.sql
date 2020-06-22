create table members(
ID VARCHAR2(100),
PW VARCHAR2(100),
NAME VARCHAR2(100),
AGE NUMBER
)

INSERT INTO MEMBERS VALUES('pbk','1234','¹Úº´°ü',20)

select * from MEMBERS

select * from members where id = '1';

desc members

delete from members whrer id = '1'