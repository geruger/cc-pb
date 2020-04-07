
package cc.permissiom.infrastructure.tunnel.mysql;

import cc.framework.orm.annotation.Column;
import cc.framework.orm.annotation.Table;
import cc.permissiom.infrastructure.dal.mysql.Record;


/**
* @author 生成器
**/
@Table(tableName = "t_function_group", primaryKey = "nid" )
public class FunctionGroupDto extends Record {
/**主键nid**/
@Column(columnName = "nid")
private Integer nid;
public Integer getNid() {
    return nid;
}
public void setNid(Integer nid) {
    this.nid = nid;
}

/**功能集nid**/
@Column(columnName = "functionnid")
private Integer functionnid;
public Integer getFunctionnid() {
    return functionnid;
}
public void setFunctionnid(Integer functionnid) {
    this.functionnid = functionnid;
}

/**组nid**/
@Column(columnName = "groupnid")
private Integer groupnid;
public Integer getGroupnid() {
    return groupnid;
}
public void setGroupnid(Integer groupnid) {
    this.groupnid = groupnid;
}

}
