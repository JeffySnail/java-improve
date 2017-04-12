package com.viashare.adappter;

/**
 * Created by Jeffy on 17/4/12.
 */
public class Adapter implements DataPersitentService {


    private final static MysqlPersitent mysqlPersitent = new MysqlPersitent();

    private final static RedisPersitent redisPersitent = new RedisPersitent();

    public int put(Object value) {
        mysqlPersitent.insert(value);
        redisPersitent.set(value);
        return 0;
    }
}
