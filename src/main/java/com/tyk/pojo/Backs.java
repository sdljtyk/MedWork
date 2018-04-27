package com.tyk.pojo;

import java.io.Serializable;

/**
 * @author 
 */
public class Backs implements Serializable {
    private Integer id;

    private Integer yyid;

    private String yylxr;

    private String backjdr;

    private String backcreat;

    private String backalter;

    private String backsub;

    private String backother;

    private Integer backstate;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getYyid() {
        return yyid;
    }

    public void setYyid(Integer yyid) {
        this.yyid = yyid;
    }

    public String getYylxr() {
        return yylxr;
    }

    public void setYylxr(String yylxr) {
        this.yylxr = yylxr;
    }

    public String getBackjdr() {
        return backjdr;
    }

    public void setBackjdr(String backjdr) {
        this.backjdr = backjdr;
    }

    public String getBackcreat() {
        return backcreat;
    }

    public void setBackcreat(String backcreat) {
        this.backcreat = backcreat;
    }

    public String getBackalter() {
        return backalter;
    }

    public void setBackalter(String backalter) {
        this.backalter = backalter;
    }

    public String getBacksub() {
        return backsub;
    }

    public void setBacksub(String backsub) {
        this.backsub = backsub;
    }

    public String getBackother() {
        return backother;
    }

    public void setBackother(String backother) {
        this.backother = backother;
    }

    public Integer getBackstate() {
        return backstate;
    }

    public void setBackstate(Integer backstate) {
        this.backstate = backstate;
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
        Backs other = (Backs) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getYyid() == null ? other.getYyid() == null : this.getYyid().equals(other.getYyid()))
            && (this.getYylxr() == null ? other.getYylxr() == null : this.getYylxr().equals(other.getYylxr()))
            && (this.getBackjdr() == null ? other.getBackjdr() == null : this.getBackjdr().equals(other.getBackjdr()))
            && (this.getBackcreat() == null ? other.getBackcreat() == null : this.getBackcreat().equals(other.getBackcreat()))
            && (this.getBackalter() == null ? other.getBackalter() == null : this.getBackalter().equals(other.getBackalter()))
            && (this.getBacksub() == null ? other.getBacksub() == null : this.getBacksub().equals(other.getBacksub()))
            && (this.getBackother() == null ? other.getBackother() == null : this.getBackother().equals(other.getBackother()))
            && (this.getBackstate() == null ? other.getBackstate() == null : this.getBackstate().equals(other.getBackstate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getYyid() == null) ? 0 : getYyid().hashCode());
        result = prime * result + ((getYylxr() == null) ? 0 : getYylxr().hashCode());
        result = prime * result + ((getBackjdr() == null) ? 0 : getBackjdr().hashCode());
        result = prime * result + ((getBackcreat() == null) ? 0 : getBackcreat().hashCode());
        result = prime * result + ((getBackalter() == null) ? 0 : getBackalter().hashCode());
        result = prime * result + ((getBacksub() == null) ? 0 : getBacksub().hashCode());
        result = prime * result + ((getBackother() == null) ? 0 : getBackother().hashCode());
        result = prime * result + ((getBackstate() == null) ? 0 : getBackstate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", yyid=").append(yyid);
        sb.append(", yylxr=").append(yylxr);
        sb.append(", backjdr=").append(backjdr);
        sb.append(", backcreat=").append(backcreat);
        sb.append(", backalter=").append(backalter);
        sb.append(", backsub=").append(backsub);
        sb.append(", backother=").append(backother);
        sb.append(", backstate=").append(backstate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}