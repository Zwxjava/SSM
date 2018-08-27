package com.text.entitys;

public class Userinfo {
    private Long id;

    private String loginName;

    private String loginPassword;

    private Short type;

    private Long createAt;

    private Long updateAt;

    private Long lastLoginAt;

    private String pwdcode;

    private Long pwdcodeExpire;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword == null ? null : loginPassword.trim();
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public Long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    public Long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
    }

    public Long getLastLoginAt() {
        return lastLoginAt;
    }

    public void setLastLoginAt(Long lastLoginAt) {
        this.lastLoginAt = lastLoginAt;
    }

    public String getPwdcode() {
        return pwdcode;
    }

    public void setPwdcode(String pwdcode) {
        this.pwdcode = pwdcode == null ? null : pwdcode.trim();
    }

    public Long getPwdcodeExpire() {
        return pwdcodeExpire;
    }

    public void setPwdcodeExpire(Long pwdcodeExpire) {
        this.pwdcodeExpire = pwdcodeExpire;
    }
}