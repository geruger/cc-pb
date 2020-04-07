
package cc.permissiom.infrastructure.tunnel.mysql;

import cc.framework.orm.annotation.Column;
import cc.framework.orm.annotation.Table;
import cc.permissiom.infrastructure.dal.mysql.Record;


/**
* @author 生成器
**/
@Table(tableName = "t_role_function", primaryKey = "nid, autoIncrement = false" )
public class RoleFunctionDto extends Record {
/**主键nid**/
@Column(columnName = "nid")
private Integer nid;
public Integer getNid() {
    return nid;
}
public void setNid(Integer nid) {
    this.nid = nid;
}

/**角色nid**/
@Column(columnName = "rolenid")
private Integer rolenid;
public Integer getRolenid() {
    return rolenid;
}
public void setRolenid(Integer rolenid) {
    this.rolenid = rolenid;
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

}
