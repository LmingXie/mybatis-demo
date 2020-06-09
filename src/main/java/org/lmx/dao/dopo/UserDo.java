package org.lmx.dao.dopo;

/**
 * 功能描述：用户实体
 *
 * @program: mybatis-demo
 * @author: LM.X
 * @create: 2020-06-05 15:18
 **/
public class UserDo {
    private Integer id;
    private String name;
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
