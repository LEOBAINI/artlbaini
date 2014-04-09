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
-- Dumping events for database 'shiteckhibernate'
--

--
-- Dumping routines for database 'shiteckhibernate'
--
/*!50003 DROP FUNCTION IF EXISTS `FuncPorcentajeCumplido` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50020 DEFINER=`root`@`localhost`*/ /*!50003 FUNCTION `FuncPorcentajeCumplido`(idCliente int) RETURNS text CHARSET latin1
BEGIN

declare  losSinSubElementos int;
declare  todosLosSubElementos int;
declare  totalElementosContables int;
declare  LosSinSubElementosEnSi int;
declare  todosLosSubElementosEnSi int;
declare  TotalEnSi int;
declare  PorcentajeCumplido int;

set losSinSubElementos= (select count(*) from mitigacion_item_no_conf M where
cliente_depto_nro=idCliente
and
idmitigacion_item_no_conf not in
(SELECT id_item_no_conf FROM shiteckhibernate.como_mitigar where
cliente_depto=idCliente));

set todosLosSubElementos=(SELECT count(*) FROM shiteckhibernate.como_mitigar where cliente_depto=idCliente);

set totalElementosContables=todosLosSubElementos+losSinSubElementos;

set LosSinSubElementosEnSi=(select count(*) from mitigacion_item_no_conf M where
cliente_depto_nro=idCliente and esta_cumplido='SI'
and
idmitigacion_item_no_conf not in
(SELECT id_item_no_conf FROM shiteckhibernate.como_mitigar where
cliente_depto=idCliente)
);

set todosLosSubElementosEnSi=(SELECT count(*) FROM shiteckhibernate.como_mitigar where cliente_depto=idCliente and cumplido='SI');

set TotalEnSi=LosSinSubElementosEnSi+todosLosSubElementosEnSi;

set PorcentajeCumplido=TotalEnSi*100/totalElementosContables;

RETURN PorcentajeCumplido;


END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `insertarEnHistorialYauditoria` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50020 DEFINER=`root`@`localhost`*/ /*!50003 PROCEDURE `insertarEnHistorialYauditoria`(in auditNro int,in clientDepto int,in cuit int,in fechaAud date, in horaIn time,in horaOut time)
BEGIN
delete from auditoria where auditorianro=auditNro;
delete from historialrelevamiento where auditoriaNro=auditNro and cliente_depto=clientDepto and cuit_empresa=cuit;

insert into auditoria(auditorianro,clienteDeptoNro,empresa_cuit_cuip,fechaCreacion,horaIn,horaOut)
              values(auditNro,clientdepto,cuit,fechaAud,horaIn,horaOut);                                                                           

insert into historialrelevamiento(idcomomitigar,descripcion,descripcionFotoBien,
foto,fotobien,cliente_depto,id_item_no_conf,cumplido,fechaCumplido,auditoriaNro,cuit_empresa) 

(SELECT idcomo_mitigar,descripcion,descripcionFotoBien,
foto,fotobien,cliente_depto,id_item_no_conf,cumplido,fechaCumplido,auditNro,cuit
FROM shiteckhibernate.como_mitigar where cliente_depto=clientDepto);

END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `PorcentajeCumplido` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50020 DEFINER=`root`@`localhost`*/ /*!50003 PROCEDURE `PorcentajeCumplido`(in idCliente int)
BEGIN

declare  losSinSubElementos int;
declare  todosLosSubElementos int;
declare  totalElementosContables int;
declare  LosSinSubElementosEnSi int;
declare  todosLosSubElementosEnSi int;
declare  TotalEnSi int;
declare  PorcentajeCumplido int;

set losSinSubElementos= (select count(*) from mitigacion_item_no_conf M where
cliente_depto_nro=idCliente
and
idmitigacion_item_no_conf not in
(SELECT id_item_no_conf FROM shiteckhibernate.como_mitigar where
cliente_depto=idCliente));

set todosLosSubElementos=(SELECT count(*) FROM shiteckhibernate.como_mitigar where cliente_depto=idCliente);

set totalElementosContables=todosLosSubElementos+losSinSubElementos;

set LosSinSubElementosEnSi=(select count(*) from mitigacion_item_no_conf M where
cliente_depto_nro=idCliente and esta_cumplido='SI'
and
idmitigacion_item_no_conf not in
(SELECT id_item_no_conf FROM shiteckhibernate.como_mitigar where
cliente_depto=idCliente)
);

set todosLosSubElementosEnSi=(SELECT count(*) FROM shiteckhibernate.como_mitigar where cliente_depto=idCliente and cumplido='SI');

set TotalEnSi=LosSinSubElementosEnSi+todosLosSubElementosEnSi;

set PorcentajeCumplido=TotalEnSi*100/totalElementosContables;

select PorcentajeCumplido;


END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-04-09  2:07:38
