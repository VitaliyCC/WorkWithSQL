package org.example.dao;

public abstract class DAOFactory {

    public static DAOFactory getDAOFactory (BDType dbType) {
        switch (dbType) {
            case ORACLE:
                return new OracleDAOFactory();
            case MYSQL:
                return null;
            default:
                return null;
        }
    }
}