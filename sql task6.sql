CREATE TABLE hospital_info(id int primary key, h_name varchar(20), h_id int unique, no_of_wards int not null, no_of_staff int, location varchar(30), no_of_beds int ,h_contact bigint);
SELECT * FROM hospital_info;

INSERT INTO hospital_info values(1,"Apollo Hospital",11,100,50,"delhi",200,9900998877);
INSERT INTO hospital_info values(2,"Amrita Hospital",12,101,60,"faridabad",150,9901547852);
INSERT INTO hospital_info values(3," AIIMS Delhi",13,102,75,"delhi",450,9914725896);
INSERT INTO hospital_info values(4,"Lilavati Hospital",14,103,46,"bangalore",658,9357489512);
INSERT INTO hospital_info values(5,"Sri Ganga Ram Hospital",15,104,62,"chennai",472,9456987159);
INSERT INTO hospital_info values(10,"Ambani hospital",16,105,90,"mumbai",510,9145782356);
INSERT INTO hospital_info values(7,"kanaka hospital",17,106,48,"raichur",159,9159487236);
INSERT INTO hospital_info values(8,"Fort St George",18,107,85,"madras",753,9925896347);
INSERT INTO hospital_info values(9,"Fortis healthcare",19,108,34,"pune",456,9915935748);
INSERT INTO hospital_info values(5,"PGIMER Chandigarh",20,109,94,"delhi",654,9925699347);



