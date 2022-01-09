package com.ptit.connectdatabase.Enity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="LOAINS")
public class Category {
    @Id
    @Column(name="MALOAI")
    private String id;

    @Column(name="TENLOAI")
    private String name;

    @Column(name="HINHANH")
    private String image;

    @Column(name="YEUTHICH")
    private Integer like;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getLike() {
        return like;
    }

    public void setLike(Integer like) {
        this.like = like;
    }
}
