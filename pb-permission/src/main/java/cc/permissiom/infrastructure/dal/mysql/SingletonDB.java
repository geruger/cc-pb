package cc.permissiom.infrastructure.dal.mysql;

import cc.framework.orm.DataBase;


/**
 * 说明: 调用该类可以操作数据库
 * 例如：orm.MyDB.getInstance().execute(sql,params)
 * @author chenghao
 * @date 2018/2/1 上午11:23
 */
public class SingletonDB extends DataBase{

    private static String _configName = "db";
    private static volatile SingletonDB instance = null;

    private SingletonDB() {
        super(String.format("%s-%s.properties", _configName, System.getProperty("spring.profiles.active")));
    }

    public static SingletonDB getInstance() {
        if (instance == null) {
            synchronized (SingletonDB.class) {
                if (instance == null) {
                    instance = new SingletonDB();
                }
            }
        }
        return instance;
    }
}