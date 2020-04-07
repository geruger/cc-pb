
package cc.permissiom.infrastructure.tunnel.mysql;

import cc.framework.orm.annotation.Column;
import cc.framework.orm.annotation.Table;
import cc.permissiom.infrastructure.dal.mysql.Record;


/**
* @author 生成器
**/
@Table(tableName = "t_user", primaryKey = "nid" )
public class UserDto extends Record {
/**主键**/
@Column(columnName = "nid")
private Integer nid;
public Integer getNid() {
    return nid;
}
public void setNid(Integer nid) {
    this.nid = nid;
}

/**用户主键vid**/
@Column(columnName = "vid")
private Integer vid;
public Integer getVid() {
    return vid;
}
public void setVid(Integer vid) {
    this.vid = vid;
}

/**用户名**/
@Column(columnName = "username")
private String username;
public String getUsername() {
    return username;
}
public void setUsername(String username) {
    this.username = username;
}

/**密码**/
@Column(columnName = "password")
private String password;
public String getPassword() {
    return password;
}
public void setPassword(String password) {
    this.password = password;
}

/**手机号**/
@Column(columnName = "mobile")
private String mobile;
public String getMobile() {
    return mobile;
}
public void setMobile(String mobile) {
    this.mobile = mobile;
}

/**最后修改时间**/
@Column(columnName = "lastmodifytime")
private Long lastmodifytime;
public Long getLastmodifytime() {
    return lastmodifytime;
}
public void setLastmodifytime(Long lastmodifytime) {
    this.lastmodifytime = lastmodifytime;
}

/**账号状态**/
@Column(columnName = "status")
private Byte status;
public Byte getStatus() {
    return status;
}
public void setStatus(Byte status) {
    this.status = status;
}

}
