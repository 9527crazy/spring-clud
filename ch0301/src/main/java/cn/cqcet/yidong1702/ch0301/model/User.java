package cn.cqcet.yidong1702.ch0301.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * FileName: User
 * Author:   刘帅
 * Date:     2019-9-18 16:32
 */
@Table(name = "tb_user")
@Entity
@GenericGenerator(name = "jpa-uuid",strategy = "uuid")
public class User implements Serializable {
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(generator = "jpa-uuid")
    private Integer id;
    @Column(length = 32)
    private String address;
    @Column(length = 256)
    private String username;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
