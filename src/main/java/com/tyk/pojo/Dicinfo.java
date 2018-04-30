package com.tyk.pojo;

import java.io.Serializable;

/**
 * @author 
 */
public class Dicinfo implements Serializable {
    private Integer id;

    private Integer diccode;

    private String dictype;

    private String info;

    private String orthers;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDiccode() {
        return diccode;
    }

    public void setDiccode(Integer diccode) {
        this.diccode = diccode;
    }

    public String getDictype() {
        return dictype;
    }

    public void setDictype(String dictype) {
        this.dictype = dictype;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getOrthers() {
        return orthers;
    }

    public void setOrthers(String orthers) {
        this.orthers = orthers;
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
        Dicinfo other = (Dicinfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDiccode() == null ? other.getDiccode() == null : this.getDiccode().equals(other.getDiccode()))
            && (this.getDictype() == null ? other.getDictype() == null : this.getDictype().equals(other.getDictype()))
            && (this.getInfo() == null ? other.getInfo() == null : this.getInfo().equals(other.getInfo()))
            && (this.getOrthers() == null ? other.getOrthers() == null : this.getOrthers().equals(other.getOrthers()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDiccode() == null) ? 0 : getDiccode().hashCode());
        result = prime * result + ((getDictype() == null) ? 0 : getDictype().hashCode());
        result = prime * result + ((getInfo() == null) ? 0 : getInfo().hashCode());
        result = prime * result + ((getOrthers() == null) ? 0 : getOrthers().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", diccode=").append(diccode);
        sb.append(", dictype=").append(dictype);
        sb.append(", info=").append(info);
        sb.append(", orthers=").append(orthers);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}