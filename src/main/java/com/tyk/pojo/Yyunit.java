package com.tyk.pojo;

import java.io.Serializable;

/**
 * @author 
 */
public class Yyunit implements Serializable {
    private Integer id;

    private String yyname;

    private String yyaddr;

    private Integer yydqid;

    private String yyjb;

    private Integer yycws;

    private String yylxr;

    private String yyphone;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getYyname() {
        return yyname;
    }

    public void setYyname(String yyname) {
        this.yyname = yyname;
    }

    public String getYyaddr() {
        return yyaddr;
    }

    public void setYyaddr(String yyaddr) {
        this.yyaddr = yyaddr;
    }

    public Integer getYydqid() {
        return yydqid;
    }

    public void setYydqid(Integer yydqid) {
        this.yydqid = yydqid;
    }

    public String getYyjb() {
        return yyjb;
    }

    public void setYyjb(String yyjb) {
        this.yyjb = yyjb;
    }

    public Integer getYycws() {
        return yycws;
    }

    public void setYycws(Integer yycws) {
        this.yycws = yycws;
    }

    public String getYylxr() {
        return yylxr;
    }

    public void setYylxr(String yylxr) {
        this.yylxr = yylxr;
    }

    public String getYyphone() {
        return yyphone;
    }

    public void setYyphone(String yyphone) {
        this.yyphone = yyphone;
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
        Yyunit other = (Yyunit) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getYyname() == null ? other.getYyname() == null : this.getYyname().equals(other.getYyname()))
            && (this.getYyaddr() == null ? other.getYyaddr() == null : this.getYyaddr().equals(other.getYyaddr()))
            && (this.getYydqid() == null ? other.getYydqid() == null : this.getYydqid().equals(other.getYydqid()))
            && (this.getYyjb() == null ? other.getYyjb() == null : this.getYyjb().equals(other.getYyjb()))
            && (this.getYycws() == null ? other.getYycws() == null : this.getYycws().equals(other.getYycws()))
            && (this.getYylxr() == null ? other.getYylxr() == null : this.getYylxr().equals(other.getYylxr()))
            && (this.getYyphone() == null ? other.getYyphone() == null : this.getYyphone().equals(other.getYyphone()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getYyname() == null) ? 0 : getYyname().hashCode());
        result = prime * result + ((getYyaddr() == null) ? 0 : getYyaddr().hashCode());
        result = prime * result + ((getYydqid() == null) ? 0 : getYydqid().hashCode());
        result = prime * result + ((getYyjb() == null) ? 0 : getYyjb().hashCode());
        result = prime * result + ((getYycws() == null) ? 0 : getYycws().hashCode());
        result = prime * result + ((getYylxr() == null) ? 0 : getYylxr().hashCode());
        result = prime * result + ((getYyphone() == null) ? 0 : getYyphone().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", yyname=").append(yyname);
        sb.append(", yyaddr=").append(yyaddr);
        sb.append(", yydqid=").append(yydqid);
        sb.append(", yyjb=").append(yyjb);
        sb.append(", yycws=").append(yycws);
        sb.append(", yylxr=").append(yylxr);
        sb.append(", yyphone=").append(yyphone);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}