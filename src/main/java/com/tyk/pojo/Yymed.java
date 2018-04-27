package com.tyk.pojo;

import java.io.Serializable;

/**
 * @author 
 */
public class Yymed implements Serializable {
    private Integer id;

    private Integer medid;

    private Integer medsum;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMedid() {
        return medid;
    }

    public void setMedid(Integer medid) {
        this.medid = medid;
    }

    public Integer getMedsum() {
        return medsum;
    }

    public void setMedsum(Integer medsum) {
        this.medsum = medsum;
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
        Yymed other = (Yymed) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMedid() == null ? other.getMedid() == null : this.getMedid().equals(other.getMedid()))
            && (this.getMedsum() == null ? other.getMedsum() == null : this.getMedsum().equals(other.getMedsum()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMedid() == null) ? 0 : getMedid().hashCode());
        result = prime * result + ((getMedsum() == null) ? 0 : getMedsum().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", medid=").append(medid);
        sb.append(", medsum=").append(medsum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}