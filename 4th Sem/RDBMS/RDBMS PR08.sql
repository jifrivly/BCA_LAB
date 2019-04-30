DECLARE
      A INT;
      B INT;
      C INT;
      
BEGIN
      A:=&NUMBER1;
      B:=&NUMBER2;
      C:=A+B;
      
      DBMS_OUTPUT.PUT_LINE('VALUE OF NUMBER1='||A);
      DBMS_OUTPUT.PUT_LINE('VALUE OF NUMBER2='||B);
      DBMS_OUTPUT.PUT_LINE('SUM ='||C);
END;