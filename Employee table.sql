/*create database infinite;
use infinite;
*/
/*CREATE TABLE <TABLE NAME>(FIELD_NAME DATA TYPE CONSTRAINT,FIELD_NAME DATA TYPE CONSTRAINT,....)*/
CREATE TABLE EMPLOYEE (EMP_ID INT,EMP_NAME VARCHAR(20),CITY VARCHAR(20));
ALTER TABLE EMPLOYEE ADD PRIMARY KEY (EMP_ID);
ALTER TABLE EMPLOYEE MODIFY EMP_NAME VARCHAR(20) NOT NULL;
INSERT INTO EMPLOYEE VALUES(101,'PETER','PUNE');
INSERT INTO EMOLOYEE (EMP_NAME,EMP_ID, CITY)VALUES('JOHN',102,'PUNE');
SELECT * FROM EMPLOYEE;
CREATE TABLE PRODUCT(PROD_ID INT, PROD_NAME VARCHAR(20),PROD_DESC VARCHAR(20),PRICE INT);
ALTER TABLE PRODUCT ADD PRIMARY KEY(PROD_ID);
ALTER TABLE PRODUCT MODIFY PROD_NAME VARCHAR(20) NOT NULL;
ALTER TABLE PRODUCT MODIFY  PRICE INT NOT NULL;
INSERT INTO PRODUCT VALUES(11,'BOX', 'COLOUR', 50);
INSERT INTO PRODUCT VALUES(12,'BOTTOLE', 'COLOUR', 80);
INSERT INTO PRODUCT VALUES(13,'PEN', 'COLOUR', 40);
INSERT INTO PRODUCT VALUES(14,'IRON BOX', 'COLOUR', 300);
INSERT INTO PRODUCT VALUES(15,'MATCH BOX', 'COLOUR', 60);
INSERT INTO PRODUCT VALUES(16,'LUNCH BOX', 'COLOUR', 30);
SELECT * FROM PRODUCT;
INSERT INTO EMPLOYEE (EMP_NAME,EMP_ID,CITY)VALUES('SONALI', 109,'MASIC');
SELECT * FROM EMPLOYEE
WHERE EMP_ID >104;
UPDATE EMPLOYEE SET CITY ='MYSORE'
WHERE EMP_NAME='PREETHI';
#SUB QUERY
SELECT *FROM EMPLOYEE WHERE EMP_ID=(SELECT EMP_ID FROM EMPLOYEE WHERE EMP_NAME ='PETER');
#AGGREGATE FUNCTIONS : SUM,AVG,MIN,MAX,COUNT
SELECT COUNT(*) FROM EMPLOYEE WHERE EMP_ >103;
SELECT COUNT(*) AS NO_OF_RECORDS FROM EMPLOYEE WHERE EMP_ID>103;
SELECT SUM(EMP_ID) FROM EMPLOYEE;
SELECT SUM(EMP_NAME) FROM EMPLOYEE;
UPDATE EMPLOYEE SET SALARY =100000 WHERE EMP_ID<105;
SELECT SUM(SALARY) FROM EMPLOYEE WHERE EMP_ID IN(103,105);
UPDATE EMPLOYEE SET SALARY =25000 WHERE EMP_ID=106;
UPDATE EMPLOYEE SET SALARY =254200 WHERE EMP_ID=103;
SELECT SUM(SALARY) FROM EMPLOYEE;
# FETCH SECOND HIGEST SALARY;
SELECT MAX(SALARY) FROM EMPLOYEE WHERE SALARY<(SELECT MAX (SALARY) FROM EMPLOYEE);
SELECT PROD_DESC,SUM(PRICE)AS TOTAL FROM PRODUCT GROUP BY PROD_DESC ORDER BY TOTAL;
#SELECT*FROM PRODUCT
CREATE TABLE EMPL (EMP_ID INT,EMP_NAME VARCHAR(20),JOB VARCHAR(20), MGR VARCHAR(20), HIRADATE VARCHAR(20), SAL DECIMAL, COMM DECIMAL,DEPTNO INT);
INSERT INTO EMPL VALUES(8369,'SMITH','CLERK',8902,'1990-12-18' ,800.00,NULL,20);
INSERT INTO EMPL VALUES(8499,'ANYA','SALESMAN',8698,'1991-02-20' ,1600.00,300.00,30);
INSERT INTO EMPL VALUES(8521,'SETH','SALESMAN',8698,'1991-02-22' ,1250.00,500.00,30);
INSERT INTO EMPL VALUES(8566,'MAHADEVAN','MANAGER',8839,'1991-04-02' ,2985.00,NULL,20);
INSERT INTO EMPL VALUES(8654,'MOMIN','SALEMAN',8698,'1991-09-28' ,1250.00,1400.00,30);
INSERT INTO EMPL VALUES(8698,'BINA','MANAGER',8839,'1991-05-01' ,2850.00,NULL,30);
INSERT INTO EMPL VALUES(8882,'SHIVANSH','MANAGER',8839,'1991-06-09' ,2450.00,NULL,10);
INSERT INTO EMPL VALUES(8888,'SCOTT','ANALYST',8566,'1992-12-09' ,3000.00,NULL,20);
INSERT INTO EMPL VALUES(8839,'AMIR','PRESIDENT',NULL,'1991-11-18' ,5000.00,NULL,10);
INSERT INTO EMPL VALUES(8844,'KULDEEP','SALESMAN',8698,'1991-09-08' ,1500.00,0.00,30);
select * FROM EMPL;

/*
a. Write a query to display EName and Sal of employees whose salary are greater than
or equal to 2200?
b. Write a query to display details of employs who are not getting commission?
c. Write a query to display employee name and salary of those employees who don???t have
their salary in range of 2500 to 4000?
d. Write a query to display the name, job title and salary of employees who don???t have manager?
e. Write a query to display the name of employee whose name contains ???A??? as third alphabet?
f. Write a query to display the name of employee whose name contains ???T??? as last alphabet?
g. Write a query to display the name of employee whose name contains ???M??? as First and
???L??? as third alphabet?
h. Write a query to display details of employs with the text ???Not given???, if commission is null?
*/

SELECT EMP_NAME ,SAL FROM EMPL WHERE SAL>=2200;
SELECT*FROM EMPL WHERE COMM  IS NULL;
SELECT EMP_NAME, SAL FROM EMPL WHERE SAL NOT BETWEEN 2500 AND 4000;
SELECT EMP_NAME,JOB,SAL FROM EMPL WHERE JOB != 'MANAGER';
SELECT EMP_NAME FROM EMPL WHERE EMP_NAME LIKE"__A%";
SELECT EMP_NAME FROM EMPL WHERE EMP_NAME LIKE '%T';
SELECT EMP_NAME,SAL,JOB FROM EMPL WHERE EMP_NAME LIKE"M%_L%";
SELECT *FROM EMPL WHERE COMM IS NULL AND 'NOT GIVEN';







































