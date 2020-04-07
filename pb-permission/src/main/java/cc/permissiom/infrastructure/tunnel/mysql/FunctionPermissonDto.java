
package cc.permissiom.infrastructure.tunnel.mysql;

import cc.framework.orm.annotation.Column;
import cc.framework.orm.annotation.Table;
import cc.permissiom.infrastructure.dal.mysql.Record;


/**
* @author 生成器
**/
@Table(tableName = "t_function_permisson", primaryKey = "nid, autoIncrement = false" )
public class FunctionPermissonDto extends Record {
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

/**权限nid**/
@Column(columnName = "permissionnid")
private Integer permissionnid;
public Integer getPermissionnid() {
    return permissionnid;
}
public void setPermissionnid(Integer permissionnid) {
    this.permissionnid = permissionnid;
}

/**权限类型**/
@Column(columnName = "permissiontype")
private String permissiontype;
public String getPermissiontype() {
    return permissiontype;
}
public void setPermissiontype(String permissiontype) {
    this.permissiontype = permissiontype;
}

}
