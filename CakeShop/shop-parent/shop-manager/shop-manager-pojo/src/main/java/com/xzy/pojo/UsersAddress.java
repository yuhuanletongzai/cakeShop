package com.xzy.pojo;

public class UsersAddress extends UsersAddressKey {
    private Long usersId;

    private Integer status;

    public Long getUsersId() {
        return usersId;
    }

    public void setUsersId(Long usersId) {
        this.usersId = usersId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}