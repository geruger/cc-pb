
package cc.permissiom.infrastructure.tunnel.mysql;

import cc.framework.orm.annotation.Column;
import cc.framework.orm.annotation.Table;
import cc.permissiom.infrastructure.dal.mysql.Record;


/**
* @author 生成器
**/
@Table(tableName = "t_department", primaryKey = "nid" )
public class DepartmentDto extends Record {
/**部门主键nid**/
@Column(columnName = "nid")
private Integer nid;
public Integer getNid() {
    return nid;
}
public void setNid(Integer nid) {
    this.nid = nid;
}

/**部门名称**/
@Column(columnName = "name")
private String name;
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}

/**部门职责**/
@Column(columnName = "responsibility")
private String responsibility;
public String getResponsibility() {
    return responsibility;
}
public void setResponsibility(String responsibility) {
    this.responsibility = responsibility;
}

/**父id**/
@Column(columnName = "fid")
private Integer fid;
public Integer getFid() {
    return fid;
}
public void setFid(Integer fid) {
    this.fid = fid;
}

}
