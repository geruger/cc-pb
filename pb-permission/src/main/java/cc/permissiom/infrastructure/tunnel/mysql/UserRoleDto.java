
package cc.permissiom.infrastructure.tunnel.mysql;

import cc.framework.orm.annotation.Column;
import cc.framework.orm.annotation.Table;
import cc.permissiom.infrastructure.dal.mysql.Record;


/**
* @author 生成器
**/
@Table(tableName = "t_user_role", primaryKey = "nid, autoIncrement = false" )
public class UserRoleDto extends Record {
/**主键nid**/
@Column(columnName = "nid")
private Integer nid;
public Integer getNid() {
    return nid;
}
public void setNid(Integer nid) {
    this.nid = nid;
}

/**用户vid**/
@Column(columnName = "uservid")
private Integer uservid;
public Integer getUservid() {
    return uservid;
}
public void setUservid(Integer uservid) {
    this.uservid = uservid;
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

}
