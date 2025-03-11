CREATE DATABASE bankxyz;

USE bankxyz;

CREATE TABLE accounts (
                          id INT PRIMARY KEY IDENTITY(1,1),
                          username NVARCHAR(50) NOT NULL,
                          password NVARCHAR(50) NOT NULL,
                          balance FLOAT NOT NULL
);

CREATE TABLE transactions (
                              id INT PRIMARY KEY IDENTITY(1,1),
                              accountId INT NOT NULL,
                              amount FLOAT NOT NULL,
                              timestamp DATETIME NOT NULL,
                              success BIT NOT NULL,
                              FOREIGN KEY (accountId) REFERENCES accounts(id)
);
INSERT INTO accounts (username, password, balance) VALUES ('user1', 'password1', 1000);
INSERT INTO accounts (username, password, balance) VALUES ('user2', 'password2', 500);