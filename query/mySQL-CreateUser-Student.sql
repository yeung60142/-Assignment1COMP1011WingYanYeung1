-- if the user "student" does not already exist, create it
CREATE USER 'student'@'localhost' IDENTIFIED BY 'student';

GRANT ALL PRIVILEGES ON * . * TO 'student'@'localhost';
