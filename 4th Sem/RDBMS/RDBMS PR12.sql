RDBMS PROGRAM 12-CLIENT MASTER RECORD DELETION


CREATE TABLE CLIENT_MASTER(CLIENT_NO INT PRIMARY KEY,CNAME CHAR(20),PLACE CHAR(20));

INSERT INTO CLIENT_MASTER VALUES(101,'RAJU','PATTAMBI');
INSERT INTO CLIENT_MASTER VALUES(102,'AJEESH','VALANCHERI');
INSERT INTO CLIENT_MASTER VALUES(103,'SAYEED','CHANGARAMKULAM');
INSERT INTO CLIENT_MASTER VALUES(104,'SHIJITH','KUNNAMKULAM');
INSERT INTO CLIENT_MASTER VALUES(105,'ROHITH','EDAPPAL');

SELECT * FROM CLIENT_MASTER;
DROP TABLE CLIENT_MASTER;

DECLARE
    CLIENTNO INT;

BEGIN
    CLIENTNO:=&CLIENT_TO_BE_DELETED;
    DELETE FROM CLIENT_MASTER WHERE CLIENT_NO=CLIENTNO;
    IF SQL%NOTFOUND THEN 
        DBMS_OUTPUT.PUT_LINE('CLIENT NOT FOUND');
    ELSIF SQL%FOUND THEN
        DBMS_OUTPUT.PUT_LINE('RECORD DELETED');
    END IF;
END;