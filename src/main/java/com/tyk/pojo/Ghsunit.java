package com.tyk.pojo;

import java.io.Serializable;

/**
 * @author 
 */
public class Ghsunit implements Serializable {
    private Integer id;

    private String ghsname;

    private String ghslb;

    private String ghslxr;

    private String ghsphone;

    private String ghsxkz;

    private String ghsjyfw;

    private String ghshome;

    private String ghsaddr;

    private String ghszzc;

    private String ghsfr;

    private String ghszczj;

    private String ghsjj;

    private String ghsother;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGhsname() {
        return ghsname;
    }

    public void setGhsname(String ghsname) {
        this.ghsname = ghsname;
    }

    public String getGhslb() {
        return ghslb;
    }

    public void setGhslb(String ghslb) {
        this.ghslb = ghslb;
    }

    public String getGhslxr() {
        return ghslxr;
    }

    public void setGhslxr(String ghslxr) {
        this.ghslxr = ghslxr;
    }

    public String getGhsphone() {
        return ghsphone;
    }

    public void setGhsphone(String ghsphone) {
        this.ghsphone = ghsphone;
    }

    public String getGhsxkz() {
        return ghsxkz;
    }

    public void setGhsxkz(String ghsxkz) {
        this.ghsxkz = ghsxkz;
    }

    public String getGhsjyfw() {
        return ghsjyfw;
    }

    public void setGhsjyfw(String ghsjyfw) {
        this.ghsjyfw = ghsjyfw;
    }

    public String getGhshome() {
        return ghshome;
    }

    public void setGhshome(String ghshome) {
        this.ghshome = ghshome;
    }

    public String getGhsaddr() {
        return ghsaddr;
    }

    public void setGhsaddr(String ghsaddr) {
        this.ghsaddr = ghsaddr;
    }

    public String getGhszzc() {
        return ghszzc;
    }

    public void setGhszzc(String ghszzc) {
        this.ghszzc = ghszzc;
    }

    public String getGhsfr() {
        return ghsfr;
    }

    public void setGhsfr(String ghsfr) {
        this.ghsfr = ghsfr;
    }

    public String getGhszczj() {
        return ghszczj;
    }

    public void setGhszczj(String ghszczj) {
        this.ghszczj = ghszczj;
    }

    public String getGhsjj() {
        return ghsjj;
    }

    public void setGhsjj(String ghsjj) {
        this.ghsjj = ghsjj;
    }

    public String getGhsother() {
        return ghsother;
    }

    public void setGhsother(String ghsother) {
        this.ghsother = ghsother;
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
        Ghsunit other = (Ghsunit) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getGhsname() == null ? other.getGhsname() == null : this.getGhsname().equals(other.getGhsname()))
            && (this.getGhslb() == null ? other.getGhslb() == null : this.getGhslb().equals(other.getGhslb()))
            && (this.getGhslxr() == null ? other.getGhslxr() == null : this.getGhslxr().equals(other.getGhslxr()))
            && (this.getGhsphone() == null ? other.getGhsphone() == null : this.getGhsphone().equals(other.getGhsphone()))
            && (this.getGhsxkz() == null ? other.getGhsxkz() == null : this.getGhsxkz().equals(other.getGhsxkz()))
            && (this.getGhsjyfw() == null ? other.getGhsjyfw() == null : this.getGhsjyfw().equals(other.getGhsjyfw()))
            && (this.getGhshome() == null ? other.getGhshome() == null : this.getGhshome().equals(other.getGhshome()))
            && (this.getGhsaddr() == null ? other.getGhsaddr() == null : this.getGhsaddr().equals(other.getGhsaddr()))
            && (this.getGhszzc() == null ? other.getGhszzc() == null : this.getGhszzc().equals(other.getGhszzc()))
            && (this.getGhsfr() == null ? other.getGhsfr() == null : this.getGhsfr().equals(other.getGhsfr()))
            && (this.getGhszczj() == null ? other.getGhszczj() == null : this.getGhszczj().equals(other.getGhszczj()))
            && (this.getGhsjj() == null ? other.getGhsjj() == null : this.getGhsjj().equals(other.getGhsjj()))
            && (this.getGhsother() == null ? other.getGhsother() == null : this.getGhsother().equals(other.getGhsother()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getGhsname() == null) ? 0 : getGhsname().hashCode());
        result = prime * result + ((getGhslb() == null) ? 0 : getGhslb().hashCode());
        result = prime * result + ((getGhslxr() == null) ? 0 : getGhslxr().hashCode());
        result = prime * result + ((getGhsphone() == null) ? 0 : getGhsphone().hashCode());
        result = prime * result + ((getGhsxkz() == null) ? 0 : getGhsxkz().hashCode());
        result = prime * result + ((getGhsjyfw() == null) ? 0 : getGhsjyfw().hashCode());
        result = prime * result + ((getGhshome() == null) ? 0 : getGhshome().hashCode());
        result = prime * result + ((getGhsaddr() == null) ? 0 : getGhsaddr().hashCode());
        result = prime * result + ((getGhszzc() == null) ? 0 : getGhszzc().hashCode());
        result = prime * result + ((getGhsfr() == null) ? 0 : getGhsfr().hashCode());
        result = prime * result + ((getGhszczj() == null) ? 0 : getGhszczj().hashCode());
        result = prime * result + ((getGhsjj() == null) ? 0 : getGhsjj().hashCode());
        result = prime * result + ((getGhsother() == null) ? 0 : getGhsother().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", ghsname=").append(ghsname);
        sb.append(", ghslb=").append(ghslb);
        sb.append(", ghslxr=").append(ghslxr);
        sb.append(", ghsphone=").append(ghsphone);
        sb.append(", ghsxkz=").append(ghsxkz);
        sb.append(", ghsjyfw=").append(ghsjyfw);
        sb.append(", ghshome=").append(ghshome);
        sb.append(", ghsaddr=").append(ghsaddr);
        sb.append(", ghszzc=").append(ghszzc);
        sb.append(", ghsfr=").append(ghsfr);
        sb.append(", ghszczj=").append(ghszczj);
        sb.append(", ghsjj=").append(ghsjj);
        sb.append(", ghsother=").append(ghsother);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}