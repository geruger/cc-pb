package cc.permissiom.infrastructure.dal.mysql;

import java.util.List;
import java.util.Map;

/**
 * 记录集操作标准接口
 * 替换成需要操作数据库对象的实例即可，例如：public static final MyDB db = MyDB.getInstance();
 * v0.2
 *
 * @author chenghao
 * @date 2018-02-27 16:15:18
 */
public class Record {

    private static final SingletonDB db = SingletonDB.getInstance();

    /**
     * 新增数据返回主键
     *
     * @param
     * @return java.lang.Object
     * @author chenghao
     */
    public Object insertReturnPk() {
        return db.insertReturnPk(this);
    }

    /**
     * 新增数据返回受影响行数
     *
     * @param
     * @return int
     * @author chenghao
     */
    public int insert() {
        return db.insert(this);
    }

    /**
     * 更新数据返回受影响行数
     *
     * @param
     * @return int
     * @author chenghao
     */
    public int update() {
        return db.update(this);
    }

    /***
     * 根据主键删除
     * @author chenghao
     * @date 2018/4/16 下午3:30
     * @param clazz 本对象
     * @param primaryKeyValue
     * @return int
     */
    public static <T> int delete(Class<T> clazz, Object primaryKeyValue) {
        return db.delete(clazz, primaryKeyValue);
    }

    /**
     * 根据主键批量删除
     *
     * @param clazz
     * @param primaryKeyValues
     * @return int
     * @author chenghao
     * @date 2018/4/16 下午3:30
     */
    public static <T> int delete(Class<T> clazz, Object... primaryKeyValues) {
        return db.delete(clazz, primaryKeyValues);
    }


    /***
     * 根据主键获取一个实体
     * @author chenghao
     * @date 2018/5/28 上午9:37
     * @param clazz 本对象
     * @param primaryKeyValue 主键值
     * @return T
     */
    public static <T> T getOne(Class<T> clazz, Object primaryKeyValue) {
        return db.getOne(clazz, primaryKeyValue);
    }

    /***
     * 根据sql语句获取一个实体
     * @author chenghao
     * @date 2018/5/28 上午9:38
     * @param clazz 本对象
     * @param sqlWhere Where语句(含where 占位符使用？)
     * @param params 占位符值
     * @return T
     */
    public static <T> T queryOne(Class<T> clazz, String sqlWhere, Object... params) {
        return db.queryOne(clazz, sqlWhere, params);
    }


    /***
     * 获取所有数据 小数据量可以使用
     * @author chenghao
     * @date 2018/5/28 上午9:38
     * @param clazz 本对象
     * @return java.datasource.List<T>
     */
    public static <T> List<T> allList(Class<T> clazz) {
        return db.queryList(clazz);
    }


    /***
     * 分页获取数据
     * @author chenghao
     * @date 2018/5/28 上午9:40
     * @param clazz 本对象
     * @param page 页数
     * @param size 每页几条
     * @return java.datasource.List<T>
     */
    public static <T> List<T> queryList(Class<T> clazz, int page, int size) {
        return db.queryList(clazz, page, size);
    }

    /***
     * 根据条件获取分页数据
     * @author chenghao
     * @date 2018/5/28 上午9:40
     * @param clazz
     * @param page 页数
     * @param size 每页几条
     * @param sqlWhere Where语句(含where 占位符使用？)
     * @param params 占位符值
     * @return java.datasource.List<T>
     */
    public static <T> List<T> queryList(Class<T> clazz, int page, int size, String sqlWhere, Object... params) {
        return db.queryList(clazz, page, size, sqlWhere, params);
    }

    /***
     * 根据条件获取数据
     * @author chenghao
     * @date 2018/5/28 上午9:40
     * @param clazz 本对象
     * @param sqlWhere Where语句(含where 占位符使用？)
     * @param params 占位符值
     * @return java.datasource.List<T>
     */
    public static <T> List<T> queryList(Class<T> clazz, String sqlWhere, Object... params) {
        return db.queryList(clazz, sqlWhere, params);
    }

    /**
     * 批量写入数据
     *
     * @param clazz 本对象
     * @param list list 本对象
     * @return 成功条数
     */
    public static <T> int[] insertBatch(Class<T> clazz, List<T> list) {
        return db.batch(clazz, list);
    }

    /**
     * 获取记录总数
     *
     * @param clazz 本对象
     * @return 记录数
     */
    public static <T> long count(Class<T> clazz) {
        return db.count(clazz);
    }

    /***
     * 根据条件获取记录总数
     * @author chenghao
     * @date 2018/5/28 上午9:41
     * @param clazz 本对象
     * @param sqlWhere Where语句(含where 占位符使用？)
     * @param params 占位符值
     * @return int 记录数
     */
    public static <T> long count(Class<T> clazz, String sqlWhere, Object... params) {
        return db.count(clazz, sqlWhere, params);
    }

    /***
     * 执行sql语句返回受影响行数(执行sql语句如果含有select，也会在主库执行)
     * 一般用于insert ，delete，update
     * @author chenghao
     * @date 2018/5/28 上午9:41
     * @param sql sql语句
     * @param params 占位符值
     * @return int
     */
    public static int execute(String sql, Object... params) {
        return db.execute(sql, params);
    }

    /***
     * 执行sql语句返回首行首列（sql语句只会在从库执行）
     * @author chenghao
     * @date 2018/5/28 上午9:42
     * @param sql
     * @param params
     * @return java.lang.Object
     */
    public static Object queryScalar(String sql, Object... params) {
        return db.queryScalar(sql, params);
    }

    public static List<Map<String, Object>> executeMapList(String sql, Object... values){
        return db.executeMapList(sql,values);
    }
}
