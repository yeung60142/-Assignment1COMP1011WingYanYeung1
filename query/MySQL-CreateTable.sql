
 CREATE TABLE ontbuilds (
  ID int NOT NULL AUTO_INCREMENT,
  project_name char(255) NOT NULL DEFAULT '',
  supporting_ministry char(255) NOT NULL DEFAULT '',
  status char(255) NOT NULL DEFAULT '',
  target_complete char(255),
  region char(255) NOT NULL DEFAULT '',
  estimated_budget int NOT NULL DEFAULT '0',
  PRIMARY KEY (ID) 
) ENGINE=InnoDB AUTO_INCREMENT=4080 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
