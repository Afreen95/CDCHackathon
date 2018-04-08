-- This script needs to run only once

DROP DATABASE IF EXISTS SALESFORCE;
CREATE DATABASE SALESFORCE;

USE SALESFORCE;

DROP USER IF EXISTS bitforce2018@localhost;

CREATE USER bitforce2018@'localhost' IDENTIFIED BY 'bitforce';

GRANT ALL ON SALESFORCE.* TO bitforce2018@'localhost';

FLUSH PRIVILEGES;