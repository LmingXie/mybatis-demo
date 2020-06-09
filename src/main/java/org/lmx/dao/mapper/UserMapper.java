package org.lmx.dao.mapper;

import org.lmx.dao.dopo.UserDo;

/**
 * 功能描述：用户DAO
 *
 * @program: mybatis-demo
 * @author: LM.X
 * @create: 2020-06-05 15:20
 **/
public interface UserMapper {

    /**
     * 功能描述: 主键查询
     *
     * @param id
     * @return org.lmx.dao.dopo.UserDo
     * @author LM.X
     * @date 2020/6/5 15:24
     */
    UserDo getUser(Integer id);
}
