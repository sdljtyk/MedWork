package com.tyk.pojo;

import java.io.Serializable;

/**
 * @author 
 */
public class Ghsmed implements Serializable {
    private Integer id;

    private Integer ghsunitid;

    private Integer medid;

    private Float meddj;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGhsunitid() {
        return ghsunitid;
    }

    public void setGhsunitid(Integer ghsunitid) {
        this.ghsunitid = ghsunitid;
    }

    public Integer getMedid() {
        return medid;
    }

    public void setMedid(Integer medid) {
        this.medid = medid;
    }

    public Float getMeddj() {
        return meddj;
    }

    public void setMeddj(Float meddj) {
        this.meddj = meddj;
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
        Ghsmed other = (Ghsmed) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getGhsunitid() == null ? other.getGhsunitid() == null : this.getGhsunitid().equals(other.getGhsunitid()))
            && (this.getMedid() == null ? other.getMedid() == null : this.getMedid().equals(other.getMedid()))
            && (this.getMeddj() == null ? other.getMeddj() == null : this.getMeddj().equals(other.getMeddj()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getGhsunitid() == null) ? 0 : getGhsunitid().hashCode());
        result = prime * result + ((getMedid() == null) ? 0 : getMedid().hashCode());
        result = prime * result + ((getMeddj() == null) ? 0 : getMeddj().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", ghsunitid=").append(ghsunitid);
        sb.append(", medid=").append(medid);
        sb.append(", meddj=").append(meddj);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}