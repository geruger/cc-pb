package cc.permissiom.repository;

import cc.permissiom.domain.User;
import cc.permissiom.infrastructure.UserTunnel;
import cc.permissiom.infrastructure.impl.UserMysqlTunnel;

/**
 * 描述:用户仓库，支持查询用户，新增，删除，修改用户
 *
 * @author wangyan
 * @date 2020/4/3
 */
public class UserRepository {

    private UserTunnel tunnel;

    void save(User user){
        tunnel = new UserMysqlTunnel();
        tunnel.save(user);
    }

    void update(User user){
        tunnel = new UserMysqlTunnel();
    }
}
