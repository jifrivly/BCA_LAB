CREATE TABLE AREAS(
                  RADIUS INT,
                  AREA NUMBER(5,2)
                  );
                  
DECLARE
      RADIUS INT:=3;
      AREA NUMBER(5,2);
BEGIN
      WHILE RADIUS<=7
      LOOP
        AREA := 3.14*RADIUS*RADIUS;
        INSERT INTO AREAS VALUES(RADIUS,AREA);
        RADIUS:=RADIUS+1;
      END LOOP;
END;

SELECT * FROM AREAS;
DROP TABLE AREAS;