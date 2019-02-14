package com.xzy.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class ProductDetails {
    private Long productId;

    private Long productKindsId;

    private Integer relish;

    private BigDecimal price;

    private Integer num;

    private Integer sellnum;

    private Integer sizes;

    private String advertisement;

    private Date createTime;

    private Date updateTime;

    private Integer status;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getProductKindsId() {
        return productKindsId;
    }

    public void setProductKindsId(Long productKindsId) {
        this.productKindsId = productKindsId;
    }

    public Integer getRelish() {
        return relish;
    }

    public void setRelish(Integer relish) {
        this.relish = relish;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getSellnum() {
        return sellnum;
    }

    public void setSellnum(Integer sellnum) {
        this.sellnum = sellnum;
    }

    public Integer getSizes() {
        return sizes;
    }

    public void setSizes(Integer sizes) {
        this.sizes = sizes;
    }

    public String getAdvertisement() {
        return advertisement;
    }

    public void setAdvertisement(String advertisement) {
        this.advertisement = advertisement == null ? null : advertisement.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}