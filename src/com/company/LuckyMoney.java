package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @author Eric Lee
 * @date 2020/3/29 14:18
 */
// 表示这是一个实体类
@Entity
public class LuckyMoney {

    // 主键 ， 自增长
    @Id
    @GeneratedValue
    private Integer id;

    private BigDecimal money;
    // 发送方
    private String producer;
    // 接收方
    private String consumer;

    public LuckyMoney() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getConsumer() {
        return consumer;
    }

    public void setConsumer(String consumer) {
        this.consumer = consumer;
    }
}