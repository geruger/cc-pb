
package cc.permissiom.infrastructure.tunnel.mysql;

import cc.framework.orm.annotation.Column;
import cc.framework.orm.annotation.Table;
import cc.permissiom.infrastructure.dal.mysql.Record;


/**
* @author 生成器
**/
@Table(tableName = "t_role_extend", primaryKey = "nid, autoIncrement = false" )
public class RoleExtendDto extends Record {
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

/**角色父id**/
@Column(columnName = "fid")
private Integer fid;
public Integer getFid() {
    return fid;
}
public void setFid(Integer fid) {
    this.fid = fid;
}

/**系统nid**/
@Column(columnName = "systemnid")
private Integer systemnid;
public Integer getSystemnid() {
    return systemnid;
}
public void setSystemnid(Integer systemnid) {
    this.systemnid = systemnid;
}

/**角色类型**/
@Column(columnName = "categorynid")
private Integer categorynid;
public Integer getCategorynid() {
    return categorynid;
}
public void setCategorynid(Integer categorynid) {
    this.categorynid = categorynid;
}

}
