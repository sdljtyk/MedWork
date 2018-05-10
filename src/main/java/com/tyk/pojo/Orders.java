package com.tyk.pojo;

import java.io.Serializable;

/**
 * @author 
 */
public class Orders implements Serializable {
    private Integer id;

    private Integer yyid;

    private String ordercreateperson;

    private String orderctime;

    private String ordersub;

    private String orderother;

    private Integer orderstate;

    private String orderadvice;

    private String orderwatime;

    private String orderphone;

    private String ordername;

    private String ordernumber;

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

    public String getOrdercreateperson() {
        return ordercreateperson;
    }

    public void setOrdercreateperson(String ordercreateperson) {
        this.ordercreateperson = ordercreateperson;
    }

    public String getOrderctime() {
        return orderctime;
    }

    public void setOrderctime(String orderctime) {
        this.orderctime = orderctime;
    }

    public String getOrdersub() {
        return ordersub;
    }

    public void setOrdersub(String ordersub) {
        this.ordersub = ordersub;
    }

    public String getOrderother() {
        return orderother;
    }

    public void setOrderother(String orderother) {
        this.orderother = orderother;
    }

    public Integer getOrderstate() {
        return orderstate;
    }

    public void setOrderstate(Integer orderstate) {
        this.orderstate = orderstate;
    }

    public String getOrderadvice() {
        return orderadvice;
    }

    public void setOrderadvice(String orderadvice) {
        this.orderadvice = orderadvice;
    }

    public String getOrderwatime() {
        return orderwatime;
    }

    public void setOrderwatime(String orderwatime) {
        this.orderwatime = orderwatime;
    }

    public String getOrderphone() {
        return orderphone;
    }

    public void setOrderphone(String orderphone) {
        this.orderphone = orderphone;
    }

    public String getOrdername() {
        return ordername;
    }

    public void setOrdername(String ordername) {
        this.ordername = ordername;
    }

    public String getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(String ordernumber) {
        this.ordernumber = ordernumber;
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
        Orders other = (Orders) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getYyid() == null ? other.getYyid() == null : this.getYyid().equals(other.getYyid()))
            && (this.getOrdercreateperson() == null ? other.getOrdercreateperson() == null : this.getOrdercreateperson().equals(other.getOrdercreateperson()))
            && (this.getOrderctime() == null ? other.getOrderctime() == null : this.getOrderctime().equals(other.getOrderctime()))
            && (this.getOrdersub() == null ? other.getOrdersub() == null : this.getOrdersub().equals(other.getOrdersub()))
            && (this.getOrderother() == null ? other.getOrderother() == null : this.getOrderother().equals(other.getOrderother()))
            && (this.getOrderstate() == null ? other.getOrderstate() == null : this.getOrderstate().equals(other.getOrderstate()))
            && (this.getOrderadvice() == null ? other.getOrderadvice() == null : this.getOrderadvice().equals(other.getOrderadvice()))
            && (this.getOrderwatime() == null ? other.getOrderwatime() == null : this.getOrderwatime().equals(other.getOrderwatime()))
            && (this.getOrderphone() == null ? other.getOrderphone() == null : this.getOrderphone().equals(other.getOrderphone()))
            && (this.getOrdername() == null ? other.getOrdername() == null : this.getOrdername().equals(other.getOrdername()))
            && (this.getOrdernumber() == null ? other.getOrdernumber() == null : this.getOrdernumber().equals(other.getOrdernumber()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getYyid() == null) ? 0 : getYyid().hashCode());
        result = prime * result + ((getOrdercreateperson() == null) ? 0 : getOrdercreateperson().hashCode());
        result = prime * result + ((getOrderctime() == null) ? 0 : getOrderctime().hashCode());
        result = prime * result + ((getOrdersub() == null) ? 0 : getOrdersub().hashCode());
        result = prime * result + ((getOrderother() == null) ? 0 : getOrderother().hashCode());
        result = prime * result + ((getOrderstate() == null) ? 0 : getOrderstate().hashCode());
        result = prime * result + ((getOrderadvice() == null) ? 0 : getOrderadvice().hashCode());
        result = prime * result + ((getOrderwatime() == null) ? 0 : getOrderwatime().hashCode());
        result = prime * result + ((getOrderphone() == null) ? 0 : getOrderphone().hashCode());
        result = prime * result + ((getOrdername() == null) ? 0 : getOrdername().hashCode());
        result = prime * result + ((getOrdernumber() == null) ? 0 : getOrdernumber().hashCode());
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
        sb.append(", ordercreateperson=").append(ordercreateperson);
        sb.append(", orderctime=").append(orderctime);
        sb.append(", ordersub=").append(ordersub);
        sb.append(", orderother=").append(orderother);
        sb.append(", orderstate=").append(orderstate);
        sb.append(", orderadvice=").append(orderadvice);
        sb.append(", orderwatime=").append(orderwatime);
        sb.append(", orderphone=").append(orderphone);
        sb.append(", ordername=").append(ordername);
        sb.append(", ordernumber=").append(ordernumber);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}