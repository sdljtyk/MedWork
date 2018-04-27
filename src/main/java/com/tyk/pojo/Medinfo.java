package com.tyk.pojo;

import java.io.Serializable;

/**
 * @author 
 */
public class Medinfo implements Serializable {
    private Integer id;

    private String mednumber;

    private String medmake;

    private String medname;

    private String medpic;

    private String medpz;

    private Integer medjk;

    private String medzl;

    private String medabout;

    private Integer medstate;

    private String meddw;

    private String medgg;

    private String medjx;

    private Integer medclass;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMednumber() {
        return mednumber;
    }

    public void setMednumber(String mednumber) {
        this.mednumber = mednumber;
    }

    public String getMedmake() {
        return medmake;
    }

    public void setMedmake(String medmake) {
        this.medmake = medmake;
    }

    public String getMedname() {
        return medname;
    }

    public void setMedname(String medname) {
        this.medname = medname;
    }

    public String getMedpic() {
        return medpic;
    }

    public void setMedpic(String medpic) {
        this.medpic = medpic;
    }

    public String getMedpz() {
        return medpz;
    }

    public void setMedpz(String medpz) {
        this.medpz = medpz;
    }

    public Integer getMedjk() {
        return medjk;
    }

    public void setMedjk(Integer medjk) {
        this.medjk = medjk;
    }

    public String getMedzl() {
        return medzl;
    }

    public void setMedzl(String medzl) {
        this.medzl = medzl;
    }

    public String getMedabout() {
        return medabout;
    }

    public void setMedabout(String medabout) {
        this.medabout = medabout;
    }

    public Integer getMedstate() {
        return medstate;
    }

    public void setMedstate(Integer medstate) {
        this.medstate = medstate;
    }

    public String getMeddw() {
        return meddw;
    }

    public void setMeddw(String meddw) {
        this.meddw = meddw;
    }

    public String getMedgg() {
        return medgg;
    }

    public void setMedgg(String medgg) {
        this.medgg = medgg;
    }

    public String getMedjx() {
        return medjx;
    }

    public void setMedjx(String medjx) {
        this.medjx = medjx;
    }

    public Integer getMedclass() {
        return medclass;
    }

    public void setMedclass(Integer medclass) {
        this.medclass = medclass;
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
        Medinfo other = (Medinfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMednumber() == null ? other.getMednumber() == null : this.getMednumber().equals(other.getMednumber()))
            && (this.getMedmake() == null ? other.getMedmake() == null : this.getMedmake().equals(other.getMedmake()))
            && (this.getMedname() == null ? other.getMedname() == null : this.getMedname().equals(other.getMedname()))
            && (this.getMedpic() == null ? other.getMedpic() == null : this.getMedpic().equals(other.getMedpic()))
            && (this.getMedpz() == null ? other.getMedpz() == null : this.getMedpz().equals(other.getMedpz()))
            && (this.getMedjk() == null ? other.getMedjk() == null : this.getMedjk().equals(other.getMedjk()))
            && (this.getMedzl() == null ? other.getMedzl() == null : this.getMedzl().equals(other.getMedzl()))
            && (this.getMedabout() == null ? other.getMedabout() == null : this.getMedabout().equals(other.getMedabout()))
            && (this.getMedstate() == null ? other.getMedstate() == null : this.getMedstate().equals(other.getMedstate()))
            && (this.getMeddw() == null ? other.getMeddw() == null : this.getMeddw().equals(other.getMeddw()))
            && (this.getMedgg() == null ? other.getMedgg() == null : this.getMedgg().equals(other.getMedgg()))
            && (this.getMedjx() == null ? other.getMedjx() == null : this.getMedjx().equals(other.getMedjx()))
            && (this.getMedclass() == null ? other.getMedclass() == null : this.getMedclass().equals(other.getMedclass()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMednumber() == null) ? 0 : getMednumber().hashCode());
        result = prime * result + ((getMedmake() == null) ? 0 : getMedmake().hashCode());
        result = prime * result + ((getMedname() == null) ? 0 : getMedname().hashCode());
        result = prime * result + ((getMedpic() == null) ? 0 : getMedpic().hashCode());
        result = prime * result + ((getMedpz() == null) ? 0 : getMedpz().hashCode());
        result = prime * result + ((getMedjk() == null) ? 0 : getMedjk().hashCode());
        result = prime * result + ((getMedzl() == null) ? 0 : getMedzl().hashCode());
        result = prime * result + ((getMedabout() == null) ? 0 : getMedabout().hashCode());
        result = prime * result + ((getMedstate() == null) ? 0 : getMedstate().hashCode());
        result = prime * result + ((getMeddw() == null) ? 0 : getMeddw().hashCode());
        result = prime * result + ((getMedgg() == null) ? 0 : getMedgg().hashCode());
        result = prime * result + ((getMedjx() == null) ? 0 : getMedjx().hashCode());
        result = prime * result + ((getMedclass() == null) ? 0 : getMedclass().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", mednumber=").append(mednumber);
        sb.append(", medmake=").append(medmake);
        sb.append(", medname=").append(medname);
        sb.append(", medpic=").append(medpic);
        sb.append(", medpz=").append(medpz);
        sb.append(", medjk=").append(medjk);
        sb.append(", medzl=").append(medzl);
        sb.append(", medabout=").append(medabout);
        sb.append(", medstate=").append(medstate);
        sb.append(", meddw=").append(meddw);
        sb.append(", medgg=").append(medgg);
        sb.append(", medjx=").append(medjx);
        sb.append(", medclass=").append(medclass);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}