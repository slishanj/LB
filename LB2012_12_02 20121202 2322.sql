-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.5.21


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO,ANSI_QUOTES' */;


--
-- Create schema lb
--

CREATE DATABASE IF NOT EXISTS lb;
USE lb;

--
-- Definition of table "attendance"
--

DROP TABLE IF EXISTS "attendance";
CREATE TABLE "attendance" (
  "id" int(11) NOT NULL AUTO_INCREMENT,
  "stu_no" varchar(5) NOT NULL,
  "name" varchar(45) CHARACTER SET latin1 NOT NULL,
  "stream" varchar(20) CHARACTER SET latin1 DEFAULT NULL,
  "date" varchar(45) NOT NULL,
  "systemtime" varchar(15) DEFAULT NULL,
  "batch" varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  PRIMARY KEY ("id","stu_no")
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

--
-- Dumping data for table "attendance"
--

/*!40000 ALTER TABLE "attendance" DISABLE KEYS */;
INSERT INTO "attendance" ("id","stu_no","name","stream","date","systemtime","batch") VALUES 
 (1,'b424','indunil mahesh bandara','Bio','Wed Nov 21 10:52:43 IST 2012','Nov212012',NULL);
/*!40000 ALTER TABLE "attendance" ENABLE KEYS */;


--
-- Definition of table "classes"
--

DROP TABLE IF EXISTS "classes";
CREATE TABLE "classes" (
  "id" int(11) NOT NULL AUTO_INCREMENT,
  "subject" varchar(20) CHARACTER SET latin1 NOT NULL,
  "year" varchar(5) NOT NULL,
  "day" varchar(20) CHARACTER SET latin1 NOT NULL,
  "teacher" varchar(45) NOT NULL,
  "fr" varchar(45) DEFAULT NULL,
  "onto" varchar(45) DEFAULT NULL,
  PRIMARY KEY ("id")
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

--
-- Dumping data for table "classes"
--

/*!40000 ALTER TABLE "classes" DISABLE KEYS */;
INSERT INTO "classes" ("id","subject","year","day","teacher","fr","onto") VALUES 
 (7,'Physics','2015','Thursday','Dr.V.Sivakumar','11.00','12.30'),
 (11,'Chemistry','2015','Sunday','Dr.V.Senevirathne','8.30','12.30'),
 (13,'Biology','2013','Thursday','Dr.V.Sivakumar','10.00','11.00');
/*!40000 ALTER TABLE "classes" ENABLE KEYS */;


--
-- Definition of table "compensation"
--

DROP TABLE IF EXISTS "compensation";
CREATE TABLE "compensation" (
  "idperc" int(11) NOT NULL AUTO_INCREMENT,
  "month" varchar(15) DEFAULT NULL,
  "batch" varchar(5) DEFAULT NULL,
  "tutor_no" int(4) DEFAULT NULL,
  "name" varchar(50) DEFAULT NULL,
  "income" int(6) DEFAULT NULL,
  "percentage" int(3) DEFAULT NULL,
  "percentage_value" int(6) DEFAULT NULL,
  "for_teacher" int(6) DEFAULT NULL,
  "date" varchar(30) DEFAULT NULL,
  PRIMARY KEY ("idperc")
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

--
-- Dumping data for table "compensation"
--

/*!40000 ALTER TABLE "compensation" DISABLE KEYS */;
INSERT INTO "compensation" ("idperc","month","batch","tutor_no","name","income","percentage","percentage_value","for_teacher","date") VALUES 
 (1,'February','2014',1,'Dr.S.Rajapakse',14800,30,4440,10360,'Thu Sep 27 09:36:04 IST 2012'),
 (2,'April','2014',4,'Dr.V.Sivakumar',14000,10,1400,12600,'Thu Sep 27 13:31:40 IST 2012'),
 (3,'January','2013',3,'Dr.V.Senevirathne',78089,10,7808,70281,'Thu Sep 27 13:34:45 IST 2012'),
 (4,'January','2013',1,'Dr.S.Rajapakse',14000,30,4200,9800,'Fri Sep 28 11:57:30 IST 2012');
/*!40000 ALTER TABLE "compensation" ENABLE KEYS */;


--
-- Definition of table "payments"
--

DROP TABLE IF EXISTS "payments";
CREATE TABLE "payments" (
  "idpayment" int(10) NOT NULL AUTO_INCREMENT,
  "stu_no" varchar(5) NOT NULL,
  "nic" int(11) DEFAULT NULL,
  "total_fee" int(11) DEFAULT NULL,
  "paid" int(11) DEFAULT NULL,
  "due" int(11) DEFAULT NULL,
  "month" varchar(45) CHARACTER SET big5 DEFAULT NULL,
  PRIMARY KEY ("idpayment","stu_no"),
  KEY "stu_no" ("stu_no")
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

--
-- Dumping data for table "payments"
--

/*!40000 ALTER TABLE "payments" DISABLE KEYS */;
INSERT INTO "payments" ("idpayment","stu_no","nic","total_fee","paid","due","month") VALUES 
 (1,'b424',920977763,2400,1200,1200,'February');
/*!40000 ALTER TABLE "payments" ENABLE KEYS */;


--
-- Definition of table "students2"
--

DROP TABLE IF EXISTS "students2";
CREATE TABLE "students2" (
  "id" int(11) NOT NULL AUTO_INCREMENT,
  "stu_no" varchar(5) CHARACTER SET latin1 NOT NULL,
  "name" varchar(45) CHARACTER SET latin1 DEFAULT NULL,
  "address" varchar(45) CHARACTER SET latin1 DEFAULT NULL,
  "landline" varchar(45) CHARACTER SET latin1 DEFAULT NULL,
  "mobile" varchar(45) CHARACTER SET latin1 DEFAULT NULL,
  "stream" varchar(45) CHARACTER SET latin1 DEFAULT NULL,
  "medium" varchar(45) CHARACTER SET latin1 DEFAULT NULL,
  "guardian_name" varchar(45) CHARACTER SET latin1 DEFAULT NULL,
  "school" varchar(45) CHARACTER SET latin1 DEFAULT NULL,
  "subj1" varchar(45) CHARACTER SET latin1 DEFAULT NULL,
  "subj2" varchar(45) CHARACTER SET latin1 DEFAULT NULL,
  "subj3" varchar(45) CHARACTER SET latin1 DEFAULT NULL,
  "reg_fee" varchar(4) CHARACTER SET latin1 DEFAULT NULL,
  "nic" varchar(45) CHARACTER SET latin1 DEFAULT NULL,
  PRIMARY KEY ("id","stu_no")
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;

--
-- Dumping data for table "students2"
--

/*!40000 ALTER TABLE "students2" DISABLE KEYS */;
INSERT INTO "students2" ("id","stu_no","name","address","landline","mobile","stream","medium","guardian_name","school","subj1","subj2","subj3","reg_fee","nic") VALUES 
 (5,'b424','indunil mahesh bandara','42/A,dalada street, kandy','0812246026','0785128518','Bio',NULL,'K.M.C.Bandara','WSSCK','Bio','Chemistry','',NULL,'920977763'),
 (6,'b02','Gayani Tennakoon',NULL,NULL,NULL,'Bio',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (7,'b12','Ruchira Dissanayaka',NULL,NULL,NULL,'Bio',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (8,'b13','Prasadi Dangolla',NULL,NULL,NULL,'Bio',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (9,'b17','Sonali Kodithuwakku',NULL,NULL,NULL,'Bio',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (10,'b20','Sanduni Vihanga',NULL,NULL,NULL,'Bio',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (11,'m01','Isuru Amarathunga',NULL,NULL,NULL,'Maths',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (12,'m05','Sajith Ranathunga',NULL,NULL,NULL,'Maths',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (13,'m10','Tharaka Dissanayaka',NULL,NULL,NULL,'Maths',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (14,'m11','Krishali Pathirana',NULL,NULL,NULL,'Maths',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (15,'m21','Sachini Amarasinghe',NULL,NULL,NULL,'Maths',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (16,'m25','Mohammed Yaseer',NULL,NULL,NULL,'Maths',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (17,'m28','Thilina Rajapakse',NULL,NULL,NULL,'Maths',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (18,'m29','Udara Dissanayaka',NULL,NULL,NULL,'Maths',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (19,'m53','Fathima Fazla',NULL,NULL,NULL,'Maths',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (20,'m57','Gayani Koralegedara',NULL,NULL,NULL,'Maths',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (21,'m63','Supun Bandara',NULL,NULL,NULL,'Maths',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (22,'m68','Kavinda Kobbakaduwa',NULL,NULL,NULL,'Maths',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (23,'m70','Azka Salam',NULL,NULL,NULL,'Maths',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (24,'m73','Ashkar Ali',NULL,NULL,NULL,'Maths',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (25,'m66','Nuwan Soyza',NULL,NULL,NULL,'Maths',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (26,'m101','Ranitha Matharaarachchi',NULL,NULL,NULL,'Maths',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (28,'b777','Saman dilshan','jhjhb','87687676','78687688768','Bio',NULL,'lhjljjll','SSCK','Biology','Chemistry','Physics',NULL,'657577657'),
 (29,'b111','shan_shan',NULL,NULL,NULL,NULL,NULL,NULL,'SSSSCJ',NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE "students2" ENABLE KEYS */;


--
-- Definition of table "tutor"
--

DROP TABLE IF EXISTS "tutor";
CREATE TABLE "tutor" (
  "tutor_no" int(11) NOT NULL,
  "nic" int(11) NOT NULL,
  "name" varchar(45) DEFAULT NULL,
  "address" varchar(45) DEFAULT NULL,
  "mobile" int(11) NOT NULL,
  "stream" varchar(45) DEFAULT NULL,
  "subject" varchar(45) DEFAULT NULL,
  "vehicle" varchar(45) DEFAULT NULL,
  PRIMARY KEY ("tutor_no","nic","mobile")
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table "tutor"
--

/*!40000 ALTER TABLE "tutor" DISABLE KEYS */;
INSERT INTO "tutor" ("tutor_no","nic","name","address","mobile","stream","subject","vehicle") VALUES 
 (1,1223664,'Dr.S.Rajapakse','---',779786451,NULL,'Chemistry','8876'),
 (2,87639,'Dr.W.Daundasekara','---',6568769,NULL,'Mathematics','22334'),
 (3,765675,'Dr.V.Senevirathne','---',9878,NULL,'Chemistry','897987'),
 (4,786987,'Dr.V.Sivakumar','---',2345,NULL,'Physics','655'),
 (5,9879,'W.Dissanayaka','---',3232345,NULL,'Mathematics','878'),
 (6,4576,'Dr.A.Karunarathne','---',655876,NULL,'Physics','547'),
 (7,7658798,'Indunil Gunawardana','---',35899,NULL,'ICT','56'),
 (8,877982,'Nirmal Weerasekara','---',5478,NULL,'Accounting','5456'),
 (9,543645,'Chaminda Samarakoon','--',55687,NULL,'Business Studies','8787'),
 (10,1234,'Yasas Bandara','--',544567,NULL,'Economics','6767');
/*!40000 ALTER TABLE "tutor" ENABLE KEYS */;


--
-- Definition of table "users"
--

DROP TABLE IF EXISTS "users";
CREATE TABLE "users" (
  "uid" int(11) NOT NULL AUTO_INCREMENT,
  "name" varchar(45) CHARACTER SET latin1 DEFAULT NULL,
  "username" varchar(15) CHARACTER SET latin1 NOT NULL,
  "password" varchar(45) CHARACTER SET latin1 NOT NULL,
  PRIMARY KEY ("uid","username")
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

--
-- Dumping data for table "users"
--

/*!40000 ALTER TABLE "users" DISABLE KEYS */;
INSERT INTO "users" ("uid","name","username","password") VALUES 
 (1,'admin','admin','admin'),
 (5,'Renuka','cashier','cashier'),
 (6,'charith','boy','boyboy');
/*!40000 ALTER TABLE "users" ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
