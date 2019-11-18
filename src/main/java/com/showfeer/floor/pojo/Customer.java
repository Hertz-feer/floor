package com.showfeer.floor.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 客户表
 */
@Entity
@Table(name = "customer")
public class Customer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键
    private Integer id;  //编号 默认有
    private String name;  //姓名  网页
    private Long phone;  //电话  网页  , , name, phone, sex, volume, where
    private String sex;  //性别  网页
    private Integer frequency;  //订单次数  默认为0
    private Date creat_time;  //创建时间
    private Double volume;  //总金额
    private Integer area;  //地址
    private String account;  //详细地址
    private String ask;  //要求

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
                ", area=" + area +
                ", account='" + account + '\'' +
                ", ask='" + ask + '\'' +
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

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAsk() {
        return ask;
    }

    public void setAsk(String ask) {
        this.ask = ask;
    }
}
