package com.showfeer.floor.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 *交易记录表
 */
@Entity
@Table(name = "record")
public class Record {

    @Id
    private Integer id; //编号 索引
    private String name;  //买家姓名
    private String user;  //卖家姓名
    private Date date;  //交易时间
    private Integer floor; //地板编号
    private Double square;  //尺寸
    private Double price;  //价格
    private Double total;  //合计价格
    private Long number;  //订单号

    @Override
    public String toString() {
        return "Record{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", user='" + user + '\'' +
                ", date=" + date +
                ", floor=" + floor +
                ", square=" + square +
                ", price=" + price +
                ", total=" + total +
                ", number=" + number +
                '}';
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
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

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Double getSquare() {
        return square;
    }

    public void setSquare(Double square) {
        this.square = square;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }
}
