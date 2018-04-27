package com.tyk.pojo;

import java.io.Serializable;

/**
 * @author 
 */
public class Jdunit implements Serializable {
    private Integer id;

    private String jdname;

    private String jdaddr;

    private String jdyz;

    private String jdlxr;

    private String jdphone;

    private Integer jddqid;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJdname() {
        return jdname;
    }

    public void setJdname(String jdname) {
        this.jdname = jdname;
    }

    public String getJdaddr() {
        return jdaddr;
    }

    public void setJdaddr(String jdaddr) {
        this.jdaddr = jdaddr;
    }

    public String getJdyz() {
        return jdyz;
    }

    public void setJdyz(String jdyz) {
        this.jdyz = jdyz;
    }

    public String getJdlxr() {
        return jdlxr;
    }

    public void setJdlxr(String jdlxr) {
        this.jdlxr = jdlxr;
    }

    public String getJdphone() {
        return jdphone;
    }

    public void setJdphone(String jdphone) {
        this.jdphone = jdphone;
    }

    public Integer getJddqid() {
        return jddqid;
    }

    public void setJddqid(Integer jddqid) {
        this.jddqid = jddqid;
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
        Jdunit other = (Jdunit) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getJdname() == null ? other.getJdname() == null : this.getJdname().equals(other.getJdname()))
            && (this.getJdaddr() == null ? other.getJdaddr() == null : this.getJdaddr().equals(other.getJdaddr()))
            && (this.getJdyz() == null ? other.getJdyz() == null : this.getJdyz().equals(other.getJdyz()))
            && (this.getJdlxr() == null ? other.getJdlxr() == null : this.getJdlxr().equals(other.getJdlxr()))
            && (this.getJdphone() == null ? other.getJdphone() == null : this.getJdphone().equals(other.getJdphone()))
            && (this.getJddqid() == null ? other.getJddqid() == null : this.getJddqid().equals(other.getJddqid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getJdname() == null) ? 0 : getJdname().hashCode());
        result = prime * result + ((getJdaddr() == null) ? 0 : getJdaddr().hashCode());
        result = prime * result + ((getJdyz() == null) ? 0 : getJdyz().hashCode());
        result = prime * result + ((getJdlxr() == null) ? 0 : getJdlxr().hashCode());
        result = prime * result + ((getJdphone() == null) ? 0 : getJdphone().hashCode());
        result = prime * result + ((getJddqid() == null) ? 0 : getJddqid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", jdname=").append(jdname);
        sb.append(", jdaddr=").append(jdaddr);
        sb.append(", jdyz=").append(jdyz);
        sb.append(", jdlxr=").append(jdlxr);
        sb.append(", jdphone=").append(jdphone);
        sb.append(", jddqid=").append(jddqid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}