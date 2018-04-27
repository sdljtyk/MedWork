package com.tyk.pojo;

import java.io.Serializable;

/**
 * @author 
 */
public class Medrk implements Serializable {
    private Integer id;

    private Integer orderid;

    private Integer medid;

    private Integer mednum;

    private String medtime;

    private String diduser;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getMednum() {
        return mednum;
    }

    public void setMednum(Integer mednum) {
        this.mednum = mednum;
    }

    public String getMedtime() {
        return medtime;
    }

    public void setMedtime(String medtime) {
        this.medtime = medtime;
    }

    public String getDiduser() {
        return diduser;
    }

    public void setDiduser(String diduser) {
        this.diduser = diduser;
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
        Medrk other = (Medrk) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderid() == null ? other.getOrderid() == null : this.getOrderid().equals(other.getOrderid()))
            && (this.getMedid() == null ? other.getMedid() == null : this.getMedid().equals(other.getMedid()))
            && (this.getMednum() == null ? other.getMednum() == null : this.getMednum().equals(other.getMednum()))
            && (this.getMedtime() == null ? other.getMedtime() == null : this.getMedtime().equals(other.getMedtime()))
            && (this.getDiduser() == null ? other.getDiduser() == null : this.getDiduser().equals(other.getDiduser()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderid() == null) ? 0 : getOrderid().hashCode());
        result = prime * result + ((getMedid() == null) ? 0 : getMedid().hashCode());
        result = prime * result + ((getMednum() == null) ? 0 : getMednum().hashCode());
        result = prime * result + ((getMedtime() == null) ? 0 : getMedtime().hashCode());
        result = prime * result + ((getDiduser() == null) ? 0 : getDiduser().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderid=").append(orderid);
        sb.append(", medid=").append(medid);
        sb.append(", mednum=").append(mednum);
        sb.append(", medtime=").append(medtime);
        sb.append(", diduser=").append(diduser);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}