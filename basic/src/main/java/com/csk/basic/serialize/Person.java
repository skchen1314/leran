package com.csk.basic.serialize;

/**
 * Created by Administrator on 2016/5/23.
 */
import java.io.Serializable;

/**
 * <p>ClassName: Person<p>
 * <p>Description:测试对象序列化和反序列化<p>
 * @author xudp
 * @version 1.0 V
 * @createTime 2014-6-9 下午02:33:25
 */
public class Person implements Serializable {

    private int age;
    private String name;
    private String sex;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
