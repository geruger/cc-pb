
package cc.permissiom.infrastructure.tunnel.mysql;

import cc.framework.orm.annotation.Column;
import cc.framework.orm.annotation.Table;
import cc.permissiom.infrastructure.dal.mysql.Record;


/**
* @author 生成器
**/
@Table(tableName = "t_user_group", primaryKey = "nid" )
public class UserGroupDto extends Record {
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
@Column(columnName = "vid")
private Integer vid;
public Integer getVid() {
    return vid;
}
public void setVid(Integer vid) {
    this.vid = vid;
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
