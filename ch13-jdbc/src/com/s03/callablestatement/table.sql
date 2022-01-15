create table salary(
	name varchar2(10) not null primary key,
	pay number
);

INSERT INTO salary VALUES('Kim', 1000);
INSERT INTO salary VALUES('Lee', 2000);
INSERT INTO salary VALUES('Park', 3000);
COMMIT;

create or replace procedure adjust(n in varchar2, rate in float)
is
	newpay float;
begin
	SELECT pay INTO newpay FROM salary WHERE name = n;
	newpay := newpay + newpay * rate;
	
	UPDATE salary SET pay = newpay WHERE name = n;
	COMMIT;
	
	exception when others then
		dbms_output.put_line('error');
		ROLLBACK;
end;