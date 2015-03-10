# jdbc-driver
##Custom jdbc driver using jdbc-odbc bridge
###Description
Custom JDBC driver using JDBC-ODBC bridge. Implements the following interfaces:
*Driver
*Connection
*Statement
Registers driver in constructor. Class.forName() goes to connect() in MyDriver and return sql.Connection.

###Pre-Requisites
* MySQL client
* jdbc connector jar
* jdbc-odbc bridge driver

###Instructions
*Download and install jdbc-odbc bridge driver
*Go to Administrative Tools -> ODBC Data Sources -> System DSN 
*Add MySQL-ODBC
*Run Tester.java
