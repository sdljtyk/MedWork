package com.tyk.pojo;

import java.io.Serializable;

/**
 * @author 
 */
public class Menu implements Serializable {
    private Integer id;

    private String menuname;

    private Integer menuparent;

    private String menulevel;

    private Integer menuplace;

    private String menuurl;

    private Integer isused;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname;
    }

    public Integer getMenuparent() {
        return menuparent;
    }

    public void setMenuparent(Integer menuparent) {
        this.menuparent = menuparent;
    }

    public String getMenulevel() {
        return menulevel;
    }

    public void setMenulevel(String menulevel) {
        this.menulevel = menulevel;
    }

    public Integer getMenuplace() {
        return menuplace;
    }

    public void setMenuplace(Integer menuplace) {
        this.menuplace = menuplace;
    }

    public String getMenuurl() {
        return menuurl;
    }

    public void setMenuurl(String menuurl) {
        this.menuurl = menuurl;
    }

    public Integer getIsused() {
        return isused;
    }

    public void setIsused(Integer isused) {
        this.isused = isused;
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
        Menu other = (Menu) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMenuname() == null ? other.getMenuname() == null : this.getMenuname().equals(other.getMenuname()))
            && (this.getMenuparent() == null ? other.getMenuparent() == null : this.getMenuparent().equals(other.getMenuparent()))
            && (this.getMenulevel() == null ? other.getMenulevel() == null : this.getMenulevel().equals(other.getMenulevel()))
            && (this.getMenuplace() == null ? other.getMenuplace() == null : this.getMenuplace().equals(other.getMenuplace()))
            && (this.getMenuurl() == null ? other.getMenuurl() == null : this.getMenuurl().equals(other.getMenuurl()))
            && (this.getIsused() == null ? other.getIsused() == null : this.getIsused().equals(other.getIsused()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMenuname() == null) ? 0 : getMenuname().hashCode());
        result = prime * result + ((getMenuparent() == null) ? 0 : getMenuparent().hashCode());
        result = prime * result + ((getMenulevel() == null) ? 0 : getMenulevel().hashCode());
        result = prime * result + ((getMenuplace() == null) ? 0 : getMenuplace().hashCode());
        result = prime * result + ((getMenuurl() == null) ? 0 : getMenuurl().hashCode());
        result = prime * result + ((getIsused() == null) ? 0 : getIsused().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", menuname=").append(menuname);
        sb.append(", menuparent=").append(menuparent);
        sb.append(", menulevel=").append(menulevel);
        sb.append(", menuplace=").append(menuplace);
        sb.append(", menuurl=").append(menuurl);
        sb.append(", isused=").append(isused);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}