package com.tyk.pojo;

import java.io.Serializable;

/**
 * @author 
 */
public class Orderinfo implements Serializable {
    private Integer id;

    private Integer orderid;

    private Integer medid;

    private Integer ghsid;

    private Float meddj;

    private Integer mednum;

    private Float medsum;

    private Integer ghstate;

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

    public Integer getGhsid() {
        return ghsid;
    }

    public void setGhsid(Integer ghsid) {
        this.ghsid = ghsid;
    }

    public Float getMeddj() {
        return meddj;
    }

    public void setMeddj(Float meddj) {
        this.meddj = meddj;
    }

    public Integer getMednum() {
        return mednum;
    }

    public void setMednum(Integer mednum) {
        this.mednum = mednum;
    }

    public Float getMedsum() {
        return medsum;
    }

    public void setMedsum(Float medsum) {
        this.medsum = medsum;
    }

    public Integer getGhstate() {
        return ghstate;
    }

    public void setGhstate(Integer ghstate) {
        this.ghstate = ghstate;
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
        Orderinfo other = (Orderinfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderid() == null ? other.getOrderid() == null : this.getOrderid().equals(other.getOrderid()))
            && (this.getMedid() == null ? other.getMedid() == null : this.getMedid().equals(other.getMedid()))
            && (this.getGhsid() == null ? other.getGhsid() == null : this.getGhsid().equals(other.getGhsid()))
            && (this.getMeddj() == null ? other.getMeddj() == null : this.getMeddj().equals(other.getMeddj()))
            && (this.getMednum() == null ? other.getMednum() == null : this.getMednum().equals(other.getMednum()))
            && (this.getMedsum() == null ? other.getMedsum() == null : this.getMedsum().equals(other.getMedsum()))
            && (this.getGhstate() == null ? other.getGhstate() == null : this.getGhstate().equals(other.getGhstate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderid() == null) ? 0 : getOrderid().hashCode());
        result = prime * result + ((getMedid() == null) ? 0 : getMedid().hashCode());
        result = prime * result + ((getGhsid() == null) ? 0 : getGhsid().hashCode());
        result = prime * result + ((getMeddj() == null) ? 0 : getMeddj().hashCode());
        result = prime * result + ((getMednum() == null) ? 0 : getMednum().hashCode());
        result = prime * result + ((getMedsum() == null) ? 0 : getMedsum().hashCode());
        result = prime * result + ((getGhstate() == null) ? 0 : getGhstate().hashCode());
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
        sb.append(", ghsid=").append(ghsid);
        sb.append(", meddj=").append(meddj);
        sb.append(", mednum=").append(mednum);
        sb.append(", medsum=").append(medsum);
        sb.append(", ghstate=").append(ghstate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}