package org.lmx;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.lmx.dao.dopo.UserDo;
import org.lmx.dao.mapper.UserMapper;
import org.mybatis.caches.ehcache.EhcacheCache;

import java.io.Reader;

/**
 * 功能描述：程序入口
 *
 * @program: mybatis-demo
 * @author: LM.X
 * @create: 2020-06-05 15:14
 **/
public class AppMain {
    public static void main(String[] args) {
        try {
            // 1.mybatis配置文件
            String resources = "mybatis-config.xml";
            // 2.获取Reader对象
            Reader resourceAsReader = Resources.getResourceAsReader(resources);
            // 3.获取SqlSessionFactoryBuilder
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsReader);
            // 4.创建对应的session，问题：SqlSession是全局共享的吗？若不是，会存在什么问题？
            SqlSession sqlSession = build.openSession();
            // 5.获取对应的mapper
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            // 6.执行方法
            UserDo user = userMapper.getUser(1);
            System.out.println("第一次查询:" + user.getName());

            System.out.println("第二次查询:" + userMapper.getUser(1));

//            UserDo user1 = sqlSession.selectOne("getUser", 1);
//            System.out.println("查询结果1：" + user1.getName());
//            UserDo user2 = sqlSession.selectOne("org.lmx.dao.mapper.UserMapper.getUser", 1);
//            System.out.println("查询结果2：" + user2.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
