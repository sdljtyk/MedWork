package com.tyk.pojo;

import java.io.Serializable;

/**
 * @author 
 */
public class Backs implements Serializable {
    private Integer id;

    private Integer yyid;

    private String yylxr;

    private String backcreat;

    private String backalter;

    private String backsub;

    private String backother;

    private Integer backstate;

    private String backname;

    private String backphone;

    private String backnumber;

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

    public String getBackname() {
        return backname;
    }

    public void setBackname(String backname) {
        this.backname = backname;
    }

    public String getBackphone() {
        return backphone;
    }

    public void setBackphone(String backphone) {
        this.backphone = backphone;
    }

    public String getBacknumber() {
        return backnumber;
    }

    public void setBacknumber(String backnumber) {
        this.backnumber = backnumber;
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
            && (this.getBackcreat() == null ? other.getBackcreat() == null : this.getBackcreat().equals(other.getBackcreat()))
            && (this.getBackalter() == null ? other.getBackalter() == null : this.getBackalter().equals(other.getBackalter()))
            && (this.getBacksub() == null ? other.getBacksub() == null : this.getBacksub().equals(other.getBacksub()))
            && (this.getBackother() == null ? other.getBackother() == null : this.getBackother().equals(other.getBackother()))
            && (this.getBackstate() == null ? other.getBackstate() == null : this.getBackstate().equals(other.getBackstate()))
            && (this.getBackname() == null ? other.getBackname() == null : this.getBackname().equals(other.getBackname()))
            && (this.getBackphone() == null ? other.getBackphone() == null : this.getBackphone().equals(other.getBackphone()))
            && (this.getBacknumber() == null ? other.getBacknumber() == null : this.getBacknumber().equals(other.getBacknumber()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getYyid() == null) ? 0 : getYyid().hashCode());
        result = prime * result + ((getYylxr() == null) ? 0 : getYylxr().hashCode());
        result = prime * result + ((getBackcreat() == null) ? 0 : getBackcreat().hashCode());
        result = prime * result + ((getBackalter() == null) ? 0 : getBackalter().hashCode());
        result = prime * result + ((getBacksub() == null) ? 0 : getBacksub().hashCode());
        result = prime * result + ((getBackother() == null) ? 0 : getBackother().hashCode());
        result = prime * result + ((getBackstate() == null) ? 0 : getBackstate().hashCode());
        result = prime * result + ((getBackname() == null) ? 0 : getBackname().hashCode());
        result = prime * result + ((getBackphone() == null) ? 0 : getBackphone().hashCode());
        result = prime * result + ((getBacknumber() == null) ? 0 : getBacknumber().hashCode());
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
        sb.append(", backcreat=").append(backcreat);
        sb.append(", backalter=").append(backalter);
        sb.append(", backsub=").append(backsub);
        sb.append(", backother=").append(backother);
        sb.append(", backstate=").append(backstate);
        sb.append(", backname=").append(backname);
        sb.append(", backphone=").append(backphone);
        sb.append(", backnumber=").append(backnumber);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}