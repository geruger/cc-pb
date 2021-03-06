
package cc.permissiom.infrastructure.tunnel.mysql;

import cc.framework.orm.annotation.Column;
import cc.framework.orm.annotation.Table;
import cc.permissiom.infrastructure.dal.mysql.Record;


/**
* @author 生成器
**/
@Table(tableName = "t_api_permisson", primaryKey = "nid, autoIncrement = false" )
public class ApiPermissonDto extends Record {
/**主键nid**/
@Column(columnName = "nid")
private Integer nid;
public Integer getNid() {
    return nid;
}
public void setNid(Integer nid) {
    this.nid = nid;
}

/**资源码**/
@Column(columnName = "resourcecode")
private String resourcecode;
public String getResourcecode() {
    return resourcecode;
}
public void setResourcecode(String resourcecode) {
    this.resourcecode = resourcecode;
}

/**业务分类nid**/
@Column(columnName = "bussinesscategorynid")
private Integer bussinesscategorynid;
public Integer getBussinesscategorynid() {
    return bussinesscategorynid;
}
public void setBussinesscategorynid(Integer bussinesscategorynid) {
    this.bussinesscategorynid = bussinesscategorynid;
}

/**名称**/
@Column(columnName = "name")
private String name;
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
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

/**请求地址**/
@Column(columnName = "apiurl")
private String apiurl;
public String getApiurl() {
    return apiurl;
}
public void setApiurl(String apiurl) {
    this.apiurl = apiurl;
}

/**是否登录**/
@Column(columnName = "islogin")
private Byte islogin;
public Byte getIslogin() {
    return islogin;
}
public void setIslogin(Byte islogin) {
    this.islogin = islogin;
}

}
