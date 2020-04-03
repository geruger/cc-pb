package cc.permissiom.infrastructure;

import cc.permissiom.domain.User;

/**
 * 描述:
 *
 * @author wangyan
 * @date 2020/4/2
 */
public interface UserTunnel {

    void save(User user);
}
