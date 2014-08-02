CREATE TABLE `PROCURE_URL_MASTER` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `url` varchar(255) DEFAULT NULL,
  `is_valid` tinyint(4) NOT NULL,
  `first_inserted_when` date DEFAULT NULL,
  `last_updated_when` date DEFAULT NULL,
  `is_deleted` tinyint(4) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) 

CREATE TABLE `PROCURE_BRIEF_CONTENT` (
  `b_id` int(11) NOT NULL,
  
  `title` varchar(255) DEFAULT NULL,
  `content` text,
  KEY `fk_master_url_id` (`b_id`),
  CONSTRAINT `fk_master_url_id` FOREIGN KEY (`b_id`) REFERENCES `PROCURE_URL_MASTER` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
)

CREATE TABLE `PROCURE_ACTUAL_CONTENT` (
  `a_id` int(11) NOT NULL,
  `content` longtext,
  KEY `fk_master_url_id_a` (`a_id`),
  CONSTRAINT `fk_master_url_id_a` FOREIGN KEY (`a_id`) REFERENCES `PROCURE_URL_MASTER` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
)