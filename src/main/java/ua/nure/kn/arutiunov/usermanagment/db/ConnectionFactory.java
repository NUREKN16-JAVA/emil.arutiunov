package ua.nure.kn.arutiunov.usermanagment.db;

import java.sql.Connection;

public interface ConnectionFactory {
	
	Connection createConnection() throws DatabaseException;

}