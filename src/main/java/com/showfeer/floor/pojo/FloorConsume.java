package com.showfeer.floor.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 地板库存表
 */
@Entity
@Table(name = "floorConsume")
public class FloorConsume {

    @Id
    private Integer id;  //编号
    private Integer floor;  //地板库存
    private Double consume;  //使用
    private Double surplus;  //剩余
    private Date date;  //时间

    @Override
    public String toString() {
        return "Floor_consume{" +
                "id=" + id +
                ", floor=" + floor +
                ", consume=" + consume +
                ", surplus=" + surplus +
                ", date=" + date +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Double getConsume() {
        return consume;
    }

    public void setConsume(Double consume) {
        this.consume = consume;
    }

    public Double getSurplus() {
        return surplus;
    }

    public void setSurplus(Double surplus) {
        this.surplus = surplus;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
