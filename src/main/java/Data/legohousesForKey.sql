/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */; -- 0 er true, 1 = false
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

CREATE DATABASE legohouses;
use legohouses;

drop table if exists `userlist`;
create table `userlist` (
	`user_id` int(11) NOT NULL AUTO_INCREMENT,
	`email`varchar(100) NOT NULL, 
    `password`varchar(100) NOT NULL,  
    `adminstatus`varchar(20) NOT NULL DEFAULT 'customer',
	`username` varchar(45) NOT NULL,
     UNIQUE KEY `email_UNIQUE` (`email`),
	primary key (`user_id`))
    ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
    

drop table if exists `odetails`;
create table `odetails`(

`order_id`int(11) NOT NULL AUTO_INCREMENT, 
`length`int(11),
`width`int(11), 
`height`int(11), 
`forbandt`int (11), 
primary key (`order_id`));


drop table if exists `orderlist`;
create table `orderlist`(
`order_id`int(11) NOT NULL AUTO_INCREMENT, 
`user_id`int(11), 
`sendtstatus`varchar(20) NOT NULL DEFAULT 'ikke afsendt', 
primary key (order_id, user_id), 
foreign key (order_id) references odetails(order_id), 
foreign key (user_id) references userlist(user_id));



insert into userlist values(1,  'chief@tr.tr','tr','employee','Chief');
insert into userlist values(2,  'tr@tr.tr','tr','customer','Tr');
insert into userlist values(3,  'emp@tr.tr','tr','employee','Emp');



/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;


commit; 


LOCK TABLES `userlist` WRITE;
LOCK TABLES `odetails` WRITE;
LOCK TABLES `orderlist` WRITE;

 UNLOCK TABLES;

 