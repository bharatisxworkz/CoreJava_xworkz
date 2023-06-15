CREATE TABLE fruit_info(id int primary key, f_name varchar(40) unique, f_color varchar(20), f_shape varchar(30), price int not null, benefit varchar(20), f_id int ,type varchar(10));
SELECT * FROM fruit_info;

INSERT INTO fruit_info values(1,"appale","red","spherical",90, "lower cholesterol",21,"Fuji");
INSERT INTO fruit_info values(2,"mango","yellow","kidney-shaped",56, "lower bp ",22,"Himsagar");
INSERT INTO fruit_info values(3,"pineapple","green-gray","oval bulky",78, "anti-inflammatory",23,"Queen");
INSERT INTO fruit_info values(4,"kiwi","green","oval",96, "reduce stroke ",24,"Hardy");
INSERT INTO fruit_info values(5,"banana","yellow","elongated",49, "boost digestion",25,"Red Banana");
INSERT INTO fruit_info values(6,"grapes","greenish","spheroid",83, "balance fluids",26,"Pinot noir");
INSERT INTO fruit_info values(7,"jackfruit","bright yellow","oblong",78, "heart disease",27," sindoor");
INSERT INTO fruit_info values(8,"orange","green","spherical",69, "prevent cardio",28,"Blood");
INSERT INTO fruit_info values(9,"sapota","coppery brown","round",43, "immunity",29,"Kalipatti");
INSERT INTO fruit_info values(10,"watermelon","green","round",99, "lower heart attacks",30,"Crimson");


CREATE TABLE vegetables_info(id int, v_name varchar(40), price int, benefit varchar(60), containing varchar(50), v_color varchar(50), v_shape varchar(60),v_id int, foreign key (id) references fruit_info(id));
SELECT * FROM vegetables_info;

INSERT INTO vegetables_info values(9,"tomato",99,"ease inflammation","vitamin C","red","round",500);
INSERT INTO vegetables_info values(4,"brinjal",150,"blood circulation","riboflavin","purple","oval or egg-shaped",600);
INSERT INTO vegetables_info values(5,"potato",125,"protect our cells from damage","minerals","yellow","elliptical",150);
INSERT INTO vegetables_info values(9,"cucumber",100,"help keep you hydrated","vitamin B1","green","ellipsoid",260);
INSERT INTO vegetables_info values(6,"carrot",90," eyes healthy","antioxidants","orange","conical or cylindrical",700);
INSERT INTO vegetables_info values(1,"beetroot",50,"supporting gut health","carbohydrates","red","globe-shaped",560);
INSERT INTO vegetables_info values(4,"Broccoli",70,"better eye health","Vitamin K","white and green","head shaped",900);
INSERT INTO vegetables_info values(2,"Capsicum",85,"healing wounds","dihydrocapsaicin","green","blocky shape",800);
INSERT INTO vegetables_info values(7,"Onion",75,"help break down blood clots","vitamin B6","pink","bulb",400);
INSERT INTO vegetables_info values(8,"Cauliflower",140,"protect against cancer","vitamin D","white","convex or pyramid-shaped",450);

