package com.showfeer.floor.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * 客户表
 */
@Entity
@Table(name = "customer")
public class Customer implements Serializable {

    @Id
    private Integer id;  //编号
    private String name;  //姓名
    private Long phone;  //电话
    private String sex;  //年龄
    private Integer frequency;  //订单次数
    private Date creat_time;  //创建时间
    private Double volume;  //总金额

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone=" + phone +
                ", sex='" + sex + '\'' +
                ", frequency=" + frequency +
                ", creat_time=" + creat_time +
                ", volume=" + volume +
                '}';
    }

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

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getFrequency() {
        return frequency;
    }

    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    public Date getCreat_time() {
        return creat_time;
    }

    public void setCreat_time(Date creat_time) {
        this.creat_time = creat_time;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

}
