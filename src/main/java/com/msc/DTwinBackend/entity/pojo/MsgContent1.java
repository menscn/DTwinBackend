package com.msc.DTwinBackend.entity.pojo;

/**
 * @author mSc
 * @version 1.0
 * @Package com.msc.DTwinBackend.entity.pojo
 * @Description:
 */
public class MsgContent1 {
    private String name;
    private String age;

    @Override
    public String toString() {
        return "[ name = " + name + "; " + " age = " + age + " ]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
