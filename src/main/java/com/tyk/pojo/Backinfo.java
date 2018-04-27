package com.tyk.pojo;

import java.io.Serializable;

/**
 * @author 
 */
public class Backinfo implements Serializable {
    private Integer id;

    private Integer backid;

    private Integer orderid;

    private Integer medid;

    private Integer backnum;

    private Float backsum;

    private Integer backstate;

    private String backreason;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBackid() {
        return backid;
    }

    public void setBackid(Integer backid) {
        this.backid = backid;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getMedid() {
        return medid;
    }

    public void setMedid(Integer medid) {
        this.medid = medid;
    }

    public Integer getBacknum() {
        return backnum;
    }

    public void setBacknum(Integer backnum) {
        this.backnum = backnum;
    }

    public Float getBacksum() {
        return backsum;
    }

    public void setBacksum(Float backsum) {
        this.backsum = backsum;
    }

    public Integer getBackstate() {
        return backstate;
    }

    public void setBackstate(Integer backstate) {
        this.backstate = backstate;
    }

    public String getBackreason() {
        return backreason;
    }

    public void setBackreason(String backreason) {
        this.backreason = backreason;
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
        Backinfo other = (Backinfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBackid() == null ? other.getBackid() == null : this.getBackid().equals(other.getBackid()))
            && (this.getOrderid() == null ? other.getOrderid() == null : this.getOrderid().equals(other.getOrderid()))
            && (this.getMedid() == null ? other.getMedid() == null : this.getMedid().equals(other.getMedid()))
            && (this.getBacknum() == null ? other.getBacknum() == null : this.getBacknum().equals(other.getBacknum()))
            && (this.getBacksum() == null ? other.getBacksum() == null : this.getBacksum().equals(other.getBacksum()))
            && (this.getBackstate() == null ? other.getBackstate() == null : this.getBackstate().equals(other.getBackstate()))
            && (this.getBackreason() == null ? other.getBackreason() == null : this.getBackreason().equals(other.getBackreason()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBackid() == null) ? 0 : getBackid().hashCode());
        result = prime * result + ((getOrderid() == null) ? 0 : getOrderid().hashCode());
        result = prime * result + ((getMedid() == null) ? 0 : getMedid().hashCode());
        result = prime * result + ((getBacknum() == null) ? 0 : getBacknum().hashCode());
        result = prime * result + ((getBacksum() == null) ? 0 : getBacksum().hashCode());
        result = prime * result + ((getBackstate() == null) ? 0 : getBackstate().hashCode());
        result = prime * result + ((getBackreason() == null) ? 0 : getBackreason().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", backid=").append(backid);
        sb.append(", orderid=").append(orderid);
        sb.append(", medid=").append(medid);
        sb.append(", backnum=").append(backnum);
        sb.append(", backsum=").append(backsum);
        sb.append(", backstate=").append(backstate);
        sb.append(", backreason=").append(backreason);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}