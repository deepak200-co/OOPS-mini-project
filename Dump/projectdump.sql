-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: localhost    Database: Project
-- ------------------------------------------------------
-- Server version	8.0.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `record`
--

DROP TABLE IF EXISTS `record`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `record` (
  `ChallanNo` varchar(100) DEFAULT NULL,
  `Name` varchar(100) DEFAULT NULL,
  `VehicleNumber` varchar(100) DEFAULT NULL,
  `Violation` varchar(100) DEFAULT NULL,
  `Fine` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `record`
--

LOCK TABLES `record` WRITE;
/*!40000 ALTER TABLE `record` DISABLE KEYS */;
INSERT INTO `record` VALUES ('HYD08222222','Priya','TS08HM3231','Wrong Parking','400'),('HYD08333333','Ram','TS08HM4341','Overspeeding','700'),('HYD08444444','Shreya','TS08HM5451','No Helmet','200'),('HYD08555555','Shaurya','TS08HM6561','No License','900'),('HYD08666666','Harika','TS08HM3232','Wrong Parking','400'),('HYD08777777','Deepak','TS08HM4342','Overspeeding','700'),('HYD08888888','Chay','TS08HM5452','No Helmet','200'),('HYD08999999','Lokesh','TS08HM6562','No License','900'),('HYD08222221','Jabilli','TS08HM3233','Wrong Parking','400'),('HYD08333331','Vijay','TS08HM4343','Overspeeding','700'),('HYD08444441','Vaishu','TS08HM5453','No Helmet','200'),('HYD08555551','Sai','TS08HM6563','No License','900'),('HYD08222223','Durga','TS08HM3234','Wrong Parking','400'),('HYD08333332','Jahnavi','TS08HM4344','Overspeeding','700'),('HYD08444442','Bhavana','TS08HM5454','No Helmet','200'),('HYD08555552','Ravi','TS08HM6564','No License','900'),('HYD08222224','Jay','TS08HM3235','Wrong Parking','400'),('HYD08333334','Surya','TS08HM4345','Overspeeding','700'),('HYD08444443','Joy','TS08HM5455','No Helmet','200'),('HYD08555553','Tarun','TS08HM6565','No License','900'),('HYD08222225','Raj','TS08HM3236','Wrong Parking','400'),('HYD08333335','Varsha','TS08HM4346','Overspeeding','700'),('HYD08444445','Vishnu','TS08HM5456','No Helmet','200'),('HYD08555556','Suvidha','TS08HM6566','No License','900'),('HYD08666661','Suvidha','TS08HM6567','No License','900');
/*!40000 ALTER TABLE `record` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-12-05 21:34:54
