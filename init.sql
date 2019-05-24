CREATE TABLE employer_basic_info (
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



-- Example employers
INSERT INTO employer_basic_info (id, `last_name`, `first_name`, `date_employment`, `sex`, `number_department`, `name_department`, `position`, `number_phone`, `email`, `supervisor`, `hobby`)
	VALUES (1,'Baniak', 'Krystian', '2013-05-14', 'M', 5, 'Account', 'Accountant', 564326854, 'krystian@wp.pl', 'Tomasz Wydrowski', 'cars');
INSERT INTO employer_basic_info (id, `last_name`, `first_name`, `date_employment`, `sex`, `number_department`, `name_department`, `position`, `number_phone`, `email`, `supervisor`, `hobby`)
	VALUES (2, 'Hynkiewicz', 'Anna', '2014-12-06', 'K', 1, 'Management', 'Office support', 523895624, 'ania@wp.pl', 'Krzysztof Dabrowski', 'reading books');
INSERT INTO employer_basic_info (id, `last_name`, `first_name`, `date_employment`, `sex`, `number_department`, `name_department`, `position`, `number_phone`, `email`, `supervisor`, `hobby`)
	VALUES (3, 'Szulc', 'Brygida', '2011-04-25', 'K', 2, 'Servis', 'Server administrator', 865915565, 'brygida@wp.pl', 'Witowski Roman', 'swiming');