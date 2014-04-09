CREATE DATABASE  IF NOT EXISTS `shiteckhibernate` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `shiteckhibernate`;
-- MySQL dump 10.13  Distrib 5.5.16, for Win32 (x86)
--
-- Host: localhost    Database: shiteckhibernate
-- ------------------------------------------------------
-- Server version	5.5.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `mitigacion_item_no_conf`
--

DROP TABLE IF EXISTS `mitigacion_item_no_conf`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mitigacion_item_no_conf` (
  `idmitigacion_item_no_conf` bigint(20) NOT NULL,
  `fecha_prometida_mitigacion` date DEFAULT NULL,
  `fecha_cumplida_mitigacion` date DEFAULT NULL,
  `nro_item_no_conf` int(11) DEFAULT NULL,
  `nro_categoria_item_no_conf` int(11) DEFAULT NULL,
  `esta_cumplido` varchar(45) DEFAULT 'NO',
  `cliente_depto_nro` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idmitigacion_item_no_conf`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mitigacion_item_no_conf`
--

LOCK TABLES `mitigacion_item_no_conf` WRITE;
/*!40000 ALTER TABLE `mitigacion_item_no_conf` DISABLE KEYS */;
INSERT INTO `mitigacion_item_no_conf` VALUES (1,'2014-12-01','2014-03-12',1,NULL,'SI','2000'),(2,'2014-01-30','2014-04-07',2,1,'SI','2000'),(3,'2014-02-20',NULL,19,5,'NO','1000'),(4,'2014-02-20',NULL,6,2,'NO','1000'),(5,'2014-02-20','2014-03-22',5,2,'SI','2000'),(6,'2014-03-19','2014-03-22',15,4,'SI','2000'),(7,'2014-03-13','2014-03-23',4,2,'SI','1000'),(8,'2014-03-28',NULL,24,7,'NO','1000'),(9,'2014-03-19',NULL,1,1,'NO','1000'),(10,'2014-03-31','2014-03-23',19,5,'SI','1000'),(11,'2014-04-08',NULL,5,2,'NO','2000'),(12,'2014-04-18',NULL,19,5,'NO','1000');
/*!40000 ALTER TABLE `mitigacion_item_no_conf` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-04-09  2:07:28
