
package cc.permissiom.infrastructure.tunnel.mysql;

import cc.framework.orm.annotation.Column;
import cc.framework.orm.annotation.Table;
import cc.permissiom.infrastructure.dal.mysql.Record;


/**
* @author 生成器
**/
@Table(tableName = "t_group", primaryKey = "nid" )
public class GroupDto extends Record {
/**主键nid**/
@Column(columnName = "nid")
private Integer nid;
public Integer getNid() {
    return nid;
}
public void setNid(Integer nid) {
    this.nid = nid;
}

/**组名**/
@Column(columnName = "groupname")
private String groupname;
public String getGroupname() {
    return groupname;
}
public void setGroupname(String groupname) {
    this.groupname = groupname;
}

/**描述**/
@Column(columnName = "groupdescribe")
private String groupdescribe;
public String getGroupdescribe() {
    return groupdescribe;
}
public void setGroupdescribe(String groupdescribe) {
    this.groupdescribe = groupdescribe;
}

/**是否启用1是2否**/
@Column(columnName = "isused")
private Byte isused;
public Byte getIsused() {
    return isused;
}
public void setIsused(Byte isused) {
    this.isused = isused;
}

}
