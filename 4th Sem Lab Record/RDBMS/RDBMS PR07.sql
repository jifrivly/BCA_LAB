CREATE USER USER_1 IDENTIFIED BY USER_123 DEFAULT TABLESPACE "USERS" TEMPORARY TABLESPACE "TEMP";

CREATE USER USER_2 IDENTIFIED BY USER_456 DEFAULT TABLESPACE "USERS" TEMPORARY TABLESPACE "TEMP";

GRANT CREATE SESSION,CREATE TABLE,RESOURCE TO USER_1;
GRANT CREATE SESSION,CREATE TABLE,RESOURCE TO USER_2;

CONNECT USER_1
CREATE TABLE STUDENT(ROLLNO INT PRIMARY KEY,NAME VARCHAR(25));
GRANT SELECT,INSERT ON STUDENT TO USER_2;

INSERT INTO USER_1.STUDENT VALUES(2,'BABU');

REVOKE INSERT ON STUDENT FROM USER_2;

INSERT INTO USER_1.STUDENT VALUES(3,'AJU');


DROP USER USER_2;

REVOKE CREATE SESSION,CREATE TABLE,RESOURCE FROM USER_1;

DROP USER USER_1 CASCADE;