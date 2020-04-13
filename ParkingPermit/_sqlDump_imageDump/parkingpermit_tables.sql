CREATE DATABASE parkingpermit;

USE parkingpermit;

CREATE TABLE `student` (
  `id` int NOT NULL AUTO_INCREMENT,
  `firstname` varchar(100) NOT NULL,
  `lastname` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1;

INSERT INTO `student`
(firstname, lastname)
VALUES('Bob','McGill'),
('Tina','Beltcher'),
('Chris','ODoud'),
('Sammy','Hoffler'),
('Joaxin','Trejas'),
('Ben','Oblauski');

CREATE TABLE `vehicles` (
  `id` int NOT NULL AUTO_INCREMENT,
  `make` varchar(100) NOT NULL,
  `model` varchar(100) NOT NULL,
  `color` varchar(100) NOT NULL,
  `platenumber` varchar(6) NOT NULL,
  `studentid` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `studentid_fk_idx` (`studentid`),
  CONSTRAINT `studentid_fk` FOREIGN KEY (`studentid`) REFERENCES `student` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1;

INSERT INTO parkingpermit.vehicles
(make, model, color, platenumber, studentid)
VALUES('Ford','Econo','White','ESR456',1),
('VW','Rabbit','Blue','AKR253',2),
('Fiat','500L','Black','FDR247',3),
('Dodge','Ram','Smoke','DZQ509',4),
('Honda','Civic','Teal','BBR375',5),
('Nissan','Versa','Royal Blue','KGT137',6),
('Ford','Escort','Red','UFR615',2),
('Range Rover','HSE','Black','XER837',3),
('Chevy','Spark','Cellery','ZPL291',4);
