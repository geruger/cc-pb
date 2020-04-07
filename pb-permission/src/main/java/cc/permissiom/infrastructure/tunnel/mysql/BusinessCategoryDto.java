
package cc.permissiom.infrastructure.tunnel.mysql;

import cc.framework.orm.annotation.Column;
import cc.framework.orm.annotation.Table;
import cc.permissiom.infrastructure.dal.mysql.Record;


/**
* @author 生成器
**/
@Table(tableName = "t_business_category", primaryKey = "nid, autoIncrement = false" )
public class BusinessCategoryDto extends Record {
/**主键nid**/
@Column(columnName = "nid")
private Integer nid;
public Integer getNid() {
    return nid;
}
public void setNid(Integer nid) {
    this.nid = nid;
}

/**名称**/
@Column(columnName = "name")
private String name;
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}

/**描述**/
@Column(columnName = "categorydescribe")
private String categorydescribe;
public String getCategorydescribe() {
    return categorydescribe;
}
public void setCategorydescribe(String categorydescribe) {
    this.categorydescribe = categorydescribe;
}

/**数据范围规则**/
@Column(columnName = "scoperules")
private String scoperules;
public String getScoperules() {
    return scoperules;
}
public void setScoperules(String scoperules) {
    this.scoperules = scoperules;
}

}
