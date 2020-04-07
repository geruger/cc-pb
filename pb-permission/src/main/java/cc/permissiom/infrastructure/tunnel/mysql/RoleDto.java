
package cc.permissiom.infrastructure.tunnel.mysql;

import cc.framework.orm.annotation.Column;
import cc.framework.orm.annotation.Table;
import cc.permissiom.infrastructure.dal.mysql.Record;


/**
* @author 生成器
**/
@Table(tableName = "t_role", primaryKey = "nid" )
public class RoleDto extends Record {
/**主键nid**/
@Column(columnName = "nid")
private Integer nid;
public Integer getNid() {
    return nid;
}
public void setNid(Integer nid) {
    this.nid = nid;
}

/**角色名称**/
@Column(columnName = "name")
private String name;
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}

/**角色描述**/
@Column(columnName = "roledescribe")
private String roledescribe;
public String getRoledescribe() {
    return roledescribe;
}
public void setRoledescribe(String roledescribe) {
    this.roledescribe = roledescribe;
}

/**是否启用**/
@Column(columnName = "isused")
private Byte isused;
public Byte getIsused() {
    return isused;
}
public void setIsused(Byte isused) {
    this.isused = isused;
}

}
