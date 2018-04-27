package com.tyk.pojo;

import java.io.Serializable;

/**
 * @author 
 */
public class Ghqy implements Serializable {
    private Integer id;

    private Integer gysunitid;

    private Integer xzqyid;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGysunitid() {
        return gysunitid;
    }

    public void setGysunitid(Integer gysunitid) {
        this.gysunitid = gysunitid;
    }

    public Integer getXzqyid() {
        return xzqyid;
    }

    public void setXzqyid(Integer xzqyid) {
        this.xzqyid = xzqyid;
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
        Ghqy other = (Ghqy) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getGysunitid() == null ? other.getGysunitid() == null : this.getGysunitid().equals(other.getGysunitid()))
            && (this.getXzqyid() == null ? other.getXzqyid() == null : this.getXzqyid().equals(other.getXzqyid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getGysunitid() == null) ? 0 : getGysunitid().hashCode());
        result = prime * result + ((getXzqyid() == null) ? 0 : getXzqyid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", gysunitid=").append(gysunitid);
        sb.append(", xzqyid=").append(xzqyid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}