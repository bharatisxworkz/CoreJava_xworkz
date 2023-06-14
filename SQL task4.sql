CREATE TABLE train_info(id int not null, t_name varchar(30), seat_no int unique not null, compartment varchar(20), arrival varchar(20), departure varchar(30), train_no bigint ,class varchar(25) unique , travel_date varchar(20), ticket_price bigint);
 SELECT * FROM train_info;
 
 INSERT INTO train_info values(1,"MUMBAI AHMEDABAD EXP",11,"2A","mumbai","ahmedabad",12267,"M","15 july",1500);
  INSERT INTO train_info values(2,"nanded EXP",13,"3A","bangalore","delhi",12287,"S","12 march",1150);
   INSERT INTO train_info values(3,"kolkata EXP",14,"4A","kolkata","bangalore",12566,"V","14 feb",2000);
    INSERT INTO train_info values(4,"AHMEDABAD EXP",15,"1A","delhi","ahmedabad",13264,"D","30 aug",2500);
     INSERT INTO train_info values(5,"jammu delhi exp",16,"1B","jammu kashmir ","delhi",16213,"U","21 march",900);
      INSERT INTO train_info values(6,"howrah ranchi EXP",17,"3A","ranchi","howrah",13369,"N","25 dec",3600);
       INSERT INTO train_info values(7,"bangalore danapur EXP",18,"6A","bangalore","danapru",12299,"P","10 april",3200);
        INSERT INTO train_info values(8,"YESVANTPUR HOWRAH EXP",19,"2B","bnagalore","howrah",12242,"H","9 nov",3500);
        INSERT INTO train_info values(9,"FIROZPUR EXP",20,"3B","firozpur","mumbai",12287,"P","2 oct",4000);
INSERT INTO train_info values(10,"DELHI ANAND GUWAHATI EXP",20,"2C","delhi","guwahati",12288,"R","6 nov",2500);
INSERT INTO train_info values(11,"NEW DELHI - PURI PURUSHOTTAM ",21,"2D","delhi","puri",12256,"Q","15 dec",9000);
INSERT INTO train_info values(12,"PUNE - JAMMU EXP ",22,"2E","pune","jammu kashmir",12123,"J","26 may",1400);
INSERT INTO train_info values(13,"chennai mumbai EXP ",23,"2F","chennai","mumbai",12143,"Y","16 july",4400);
INSERT INTO train_info values(14,"udhayn EXP ",24,"3F","mumbai","bangalore",12323,"Z","17 june",6400);
INSERT INTO train_info values(15,"solapur EXP ",25,"3D","solapur","kolhapur",12376,"X","22 may",2900);
INSERT INTO train_info values(16,"SHATABDI EXP ",26,"4A","ludhiana","delhi",12379,"L","19 may",6570);
INSERT INTO train_info values(17,"Rajdhani Express",27,"3B","SECUNDERABAD","NAGPUR ",12437,"A","14 may",2460);
INSERT INTO train_info values(18,"MADURAI CHENNAI CENTRAL ",28,"4B","madhrai","kolkata",12489,"F","18 march",7770);
INSERT INTO train_info values(19,"Gatimaan Express ",29,"5B","GWALIOR","delhi",12420,"I","27 april",1150);
INSERT INTO train_info values(20,"FZR CSMT Punjab Mail",30,"1D","FIROZPUR","mumbai dadar",12138,"K","31 july",6650);









        
        
