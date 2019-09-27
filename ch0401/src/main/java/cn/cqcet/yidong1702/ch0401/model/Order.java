package cn.cqcet.yidong1702.ch0401.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * FileName: Order
 * Author:   刘帅
 * Date:     2019-9-19 11:08
 */
@Entity
@Table(name = "tb_order")
@GenericGenerator(name = "jpa-uuid",strategy = "uuid")
public class Order {
    @Id
    @GeneratedValue(generator = "uuid")
    private String id;
    @Column
    private Double price;
    @Column
    private String receiverName;
    @Column
    private String receiverAddress;
    @Column
    private String receiverPhone;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }
}
