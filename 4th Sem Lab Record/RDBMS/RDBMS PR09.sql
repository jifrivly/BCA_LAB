DECLARE
      NUM_1 INT;
      NUM_2 INT;
      NUM_3 INT;
      
BEGIN
      NUM_1:=&NUMBER1;
      NUM_2:=&NUMBER2;
      NUM_3:=&NUMBER3;
    IF NUM_1>NUM_2 THEN
      IF NUM_1>NUM_3 THEN
        DBMS_OUTPUT.PUT_LINE(NUM_1||'IS GREATEST');
      ELSE
        DBMS_OUTPUT.PUT_LINE(NUM_3||'IS GREATEST');
      END IF;
    ELSE
      IF NUM_2>NUM_3 THEN
        DBMS_OUTPUT.PUT_LINE(NUM_2||'IS GREATEST');
      ELSE
        DBMS_OUTPUT.PUT_LINE(NUM_3||'IS GREATEST');
      END IF;
    END IF;
END;