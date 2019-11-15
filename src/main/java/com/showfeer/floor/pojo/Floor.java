package com.showfeer.floor.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 地板类别表
 */
@Entity
@Table(name = "floor")
public class Floor implements Serializable {

    @Id
    private Integer id;  //编号
    private String name; //地板名称
    private String brand;  //品牌
    private Long number;  //地板编号

    @Override
    public String toString() {
        return "Floor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", number=" + number +
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }
}
