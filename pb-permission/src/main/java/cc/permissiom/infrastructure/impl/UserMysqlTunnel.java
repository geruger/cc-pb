package cc.permissiom.infrastructure.impl;

import cc.permissiom.domain.User;
import cc.permissiom.infrastructure.UserTunnel;
import cc.permissiom.infrastructure.tunnel.mysql.UserDto;

/**
 * 描述:
 *
 * @author wangyan
 * @date 2020/4/2
 */
public class UserMysqlTunnel implements UserTunnel {
    @Override
    public void save(User user) {
        UserDto userDto = new UserDto();
        userDto.insert();
    }
}
