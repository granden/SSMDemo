package com.Lipt0n.test.Beans;

import com.Lipt0n.test.Tools.MD5Util;


public class UpdatePwd {

    private int id;
    private String newPassword;
    private String oldPassword;

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = MD5Util.EncoderByMd5(newPassword);
    }
}
