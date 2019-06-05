CREATE TABLE employees_basic_info (
  id  					INT 					AUTO_INCREMENT PRIMARY KEY,
  last_name				VARCHAR (255) NOT NULL,
  first_name			VARCHAR (255) NOT NULL,
  date_employment		Date,
  sex					CHAR(1),
  number_department		INT,
  name_department		TEXT,
  position				TEXT,
  number_phone			INT,
  email					TEXT,
  supervisor			TEXT,
  hobby					TEXT
);

-- Example employees BasicInfo
INSERT INTO employees_basic_info (id, `last_name`, `first_name`, `date_employment`, `sex`, `number_department`, `name_department`, `position`, `number_phone`, `email`, `supervisor`, `hobby`)
	VALUES (1,'Baniak', 'Krystian', '2013-05-14', 'M', 5, 'Account', 'Accountant', 564326854, 'krystian@wp.pl', 'Tomasz Wydrowski', 'cars');
INSERT INTO employees_basic_info (id, `last_name`, `first_name`, `date_employment`, `sex`, `number_department`, `name_department`, `position`, `number_phone`, `email`, `supervisor`, `hobby`)
	VALUES (2, 'Hynkiewicz', 'Anna', '2014-12-06', 'K', 1, 'Management', 'Office support', 523895624, 'ania@wp.pl', 'Krzysztof Dabrowski', 'reading books');
INSERT INTO employees_basic_info (id, `last_name`, `first_name`, `date_employment`, `sex`, `number_department`, `name_department`, `position`, `number_phone`, `email`, `supervisor`, `hobby`)
	VALUES (3, 'Szulc', 'Brygida', '2011-04-25', 'K', 2, 'Servis', 'Server administrator', 865915565, 'brygida@wp.pl', 'Witowski Roman', 'swiming');
	
	
CREATE TABLE employees_private_info (
id 							INT		AUTO_INCREMENT PRIMARY KEY,
employee_id 				INT NOT NULL,
salary						DECIMAL (7, 2),
age 						INT,
bankAccount_number			TEXT,
rating_work					INT,
main_responsibility			TEXT,
vacation_days				INT,
current_unused_vacation_day INT,
FOREIGN KEY (employee_id) REFERENCES employees_basic_info (id)
);

-- Example employees PrivateInfo
INSERT INTO employees_private_info (id, `employee_id`, `salary`, `age`, `bankAccount_number`, `rating_work`, `main_responsibility`, `vacation_days`, `current_unused_vacation_day`)
VALUES (1, 1, 4300.00, 26, '5682 9486 5349 0000 4565', 7, 'making bank transfers', 26, 12); 
INSERT INTO employees_private_info (id, `employee_id`, `salary`, `age`, `bankAccount_number`, `rating_work`, `main_responsibility`, `vacation_days`, `current_unused_vacation_day`)
VALUES (2, 2, 3000.00, 22, '5682 4862 7546 0000 8966', 8, 'preparing documents for sale of products', 20, 3); 
