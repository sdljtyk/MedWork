package com.tyk.pojo;

import java.io.Serializable;

/**
 * @author 
 */
public class User implements Serializable {
    private Integer id;

    private String usernumber;

    private String username;

    private String userpass;

    private String userphone;

    private String useremail;

    private String useraddr;

    private String usersex;

    private Integer userstate;

    private String usercreate;

    private String useralter;

    private Integer groupid;

    private Integer unitid;

    private String others;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsernumber() {
        return usernumber;
    }

    public void setUsernumber(String usernumber) {
        this.usernumber = usernumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone;
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }

    public String getUseraddr() {
        return useraddr;
    }

    public void setUseraddr(String useraddr) {
        this.useraddr = useraddr;
    }

    public String getUsersex() {
        return usersex;
    }

    public void setUsersex(String usersex) {
        this.usersex = usersex;
    }

    public Integer getUserstate() {
        return userstate;
    }

    public void setUserstate(Integer userstate) {
        this.userstate = userstate;
    }

    public String getUsercreate() {
        return usercreate;
    }

    public void setUsercreate(String usercreate) {
        this.usercreate = usercreate;
    }

    public String getUseralter() {
        return useralter;
    }

    public void setUseralter(String useralter) {
        this.useralter = useralter;
    }

    public Integer getGroupid() {
        return groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    public Integer getUnitid() {
        return unitid;
    }

    public void setUnitid(Integer unitid) {
        this.unitid = unitid;
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        User other = (User) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUsernumber() == null ? other.getUsernumber() == null : this.getUsernumber().equals(other.getUsernumber()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getUserpass() == null ? other.getUserpass() == null : this.getUserpass().equals(other.getUserpass()))
            && (this.getUserphone() == null ? other.getUserphone() == null : this.getUserphone().equals(other.getUserphone()))
            && (this.getUseremail() == null ? other.getUseremail() == null : this.getUseremail().equals(other.getUseremail()))
            && (this.getUseraddr() == null ? other.getUseraddr() == null : this.getUseraddr().equals(other.getUseraddr()))
            && (this.getUsersex() == null ? other.getUsersex() == null : this.getUsersex().equals(other.getUsersex()))
            && (this.getUserstate() == null ? other.getUserstate() == null : this.getUserstate().equals(other.getUserstate()))
            && (this.getUsercreate() == null ? other.getUsercreate() == null : this.getUsercreate().equals(other.getUsercreate()))
            && (this.getUseralter() == null ? other.getUseralter() == null : this.getUseralter().equals(other.getUseralter()))
            && (this.getGroupid() == null ? other.getGroupid() == null : this.getGroupid().equals(other.getGroupid()))
            && (this.getUnitid() == null ? other.getUnitid() == null : this.getUnitid().equals(other.getUnitid()))
            && (this.getOthers() == null ? other.getOthers() == null : this.getOthers().equals(other.getOthers()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUsernumber() == null) ? 0 : getUsernumber().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getUserpass() == null) ? 0 : getUserpass().hashCode());
        result = prime * result + ((getUserphone() == null) ? 0 : getUserphone().hashCode());
        result = prime * result + ((getUseremail() == null) ? 0 : getUseremail().hashCode());
        result = prime * result + ((getUseraddr() == null) ? 0 : getUseraddr().hashCode());
        result = prime * result + ((getUsersex() == null) ? 0 : getUsersex().hashCode());
        result = prime * result + ((getUserstate() == null) ? 0 : getUserstate().hashCode());
        result = prime * result + ((getUsercreate() == null) ? 0 : getUsercreate().hashCode());
        result = prime * result + ((getUseralter() == null) ? 0 : getUseralter().hashCode());
        result = prime * result + ((getGroupid() == null) ? 0 : getGroupid().hashCode());
        result = prime * result + ((getUnitid() == null) ? 0 : getUnitid().hashCode());
        result = prime * result + ((getOthers() == null) ? 0 : getOthers().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", usernumber=").append(usernumber);
        sb.append(", username=").append(username);
        sb.append(", userpass=").append(userpass);
        sb.append(", userphone=").append(userphone);
        sb.append(", useremail=").append(useremail);
        sb.append(", useraddr=").append(useraddr);
        sb.append(", usersex=").append(usersex);
        sb.append(", userstate=").append(userstate);
        sb.append(", usercreate=").append(usercreate);
        sb.append(", useralter=").append(useralter);
        sb.append(", groupid=").append(groupid);
        sb.append(", unitid=").append(unitid);
        sb.append(", others=").append(others);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}