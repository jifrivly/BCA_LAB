CREATE TABLE STUDENT(
                      ADM_NO CHAR(5) PRIMARY KEY,
                      S_NAME VARCHAR(25),
                      DOB DATE,
                      SEX CHAR(2) CHECK (SEX IN ('M','F','m','f'))
                    );
                    
INSERT INTO STUDENT VALUES('B001','NISHIL','17-09-1996','M');
INSERT INTO STUDENT VALUES('B002','JITHU','2-1-1995','M');
INSERT INTO STUDENT VALUES('G003','CHINNU','13-04-1998','F');
INSERT INTO STUDENT VALUES('G004','RUMI',TO_DATE('1995-10-10','YYYY-MM-DD'),'F');

SELECT S_NAME ,TO_CHAR (DOB,'DAY')AS DAY_BORN FROM STUDENT;
SELECT S_NAME ,TO_CHAR (DOB,'MONTH')AS MONTH_BORN FROM STUDENT;
SELECT S_NAME ,MONTHS_BETWEEN(SYSDATE,DOB) FROM STUDENT;
SELECT TO_CHAR (DOB,'DD-MONTH-YY')AS DOB FROM STUDENT;
SELECT S_NAME ,EXTRACT (YEAR FROM SYSDATE)-EXTRACT(YEAR FROM DOB) AS AGE FROM STUDENT;
SELECT S_NAME FROM STUDENT WHERE DOB>'14-01-1995'; 

SELECT * FROM STUDENT;
UPDATE STUDENT SET SEX='M' WHERE ADM_NO='A001';
UPDATE STUDENT SET DOB='2-1-1995' WHERE ADM_NO='B002';
UPDATE STUDENT SET ADM_NO='B002' WHERE ADM_NO='A002';
DELETE FROM STUDENT WHERE ADM_NO='G004';