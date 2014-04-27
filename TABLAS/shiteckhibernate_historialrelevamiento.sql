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
-- Table structure for table `historialrelevamiento`
--

DROP TABLE IF EXISTS `historialrelevamiento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `historialrelevamiento` (
  `idhistorialrelevamiento` int(11) NOT NULL AUTO_INCREMENT,
  `idComoMitigar` bigint(20) DEFAULT NULL,
  `descripcion` varchar(2000) DEFAULT NULL,
  `descripcionFotoBien` varchar(2000) DEFAULT NULL,
  `foto` longblob COMMENT 'Es la foto de lo que hay que corregir',
  `fotoBien` longblob,
  `cliente_depto` varchar(45) DEFAULT NULL COMMENT 'Es el nro de depto, cada cliente tiene muchos deptos.',
  `id_item_no_conf` bigint(20) DEFAULT NULL COMMENT 'fk idmitigacion_item_no_conf de la tabla mitigacion_item_no_conf',
  `cumplido` varchar(45) DEFAULT 'NO',
  `fechaCumplido` date DEFAULT NULL,
  `auditoriaNro` bigint(20) DEFAULT NULL,
  `cuit_empresa` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idhistorialrelevamiento`),
  KEY `HIST_COMOMITIGAR` (`idComoMitigar`),
  CONSTRAINT `HIST_COMOMITIGAR` FOREIGN KEY (`idComoMitigar`) REFERENCES `como_mitigar` (`idcomo_mitigar`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1 COMMENT='Son todos los sub items de un ítem asociados a un departamen';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `historialrelevamiento`
--

LOCK TABLES `historialrelevamiento` WRITE;
/*!40000 ALTER TABLE `historialrelevamiento` DISABLE KEYS */;
INSERT INTO `historialrelevamiento` VALUES (2,1,'PROBLEM	','SOLUTION',NULL,NULL,'20-28737766-61234',1,'NO',NULL,1234,'20-28737766-6'),(9,1,'PROBLEM	','SOLUTION',NULL,NULL,'20-28737766-61234',1,'NO',NULL,12,'20-28737766-6'),(10,1,'PROBLEM	','SOLUTION',NULL,NULL,'20-28737766-61234',1,'NO',NULL,123,'20-28737766-6');
/*!40000 ALTER TABLE `historialrelevamiento` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-04-27  5:15:45
