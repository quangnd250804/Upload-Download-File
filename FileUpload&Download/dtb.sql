CREATE DATABASE UPDOWNDB

GO
USE UPDOWNDB
GO

CREATE TABLE img_details (
	id INT NOT NULL IDENTITY(1,1) PRIMARY KEY,
	img_name VARCHAR(MAX),
	remark varchar(100)
)

select * from img_details