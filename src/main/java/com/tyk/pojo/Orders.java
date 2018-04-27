package com.tyk.pojo;

import java.io.Serializable;

/**
 * @author 
 */
public class Orders implements Serializable {
    private Integer id;

    private Integer yyid;

    private String ordercreatep;

    private String orderctime;

    private String ordersub;

    private String orderother;

    private Integer orderstate;

    private String orderadvice;

    private String orderwatime;

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

    public String getOrdercreatep() {
        return ordercreatep;
    }

    public void setOrdercreatep(String ordercreatep) {
        this.ordercreatep = ordercreatep;
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
            && (this.getOrdercreatep() == null ? other.getOrdercreatep() == null : this.getOrdercreatep().equals(other.getOrdercreatep()))
            && (this.getOrderctime() == null ? other.getOrderctime() == null : this.getOrderctime().equals(other.getOrderctime()))
            && (this.getOrdersub() == null ? other.getOrdersub() == null : this.getOrdersub().equals(other.getOrdersub()))
            && (this.getOrderother() == null ? other.getOrderother() == null : this.getOrderother().equals(other.getOrderother()))
            && (this.getOrderstate() == null ? other.getOrderstate() == null : this.getOrderstate().equals(other.getOrderstate()))
            && (this.getOrderadvice() == null ? other.getOrderadvice() == null : this.getOrderadvice().equals(other.getOrderadvice()))
            && (this.getOrderwatime() == null ? other.getOrderwatime() == null : this.getOrderwatime().equals(other.getOrderwatime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getYyid() == null) ? 0 : getYyid().hashCode());
        result = prime * result + ((getOrdercreatep() == null) ? 0 : getOrdercreatep().hashCode());
        result = prime * result + ((getOrderctime() == null) ? 0 : getOrderctime().hashCode());
        result = prime * result + ((getOrdersub() == null) ? 0 : getOrdersub().hashCode());
        result = prime * result + ((getOrderother() == null) ? 0 : getOrderother().hashCode());
        result = prime * result + ((getOrderstate() == null) ? 0 : getOrderstate().hashCode());
        result = prime * result + ((getOrderadvice() == null) ? 0 : getOrderadvice().hashCode());
        result = prime * result + ((getOrderwatime() == null) ? 0 : getOrderwatime().hashCode());
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
        sb.append(", ordercreatep=").append(ordercreatep);
        sb.append(", orderctime=").append(orderctime);
        sb.append(", ordersub=").append(ordersub);
        sb.append(", orderother=").append(orderother);
        sb.append(", orderstate=").append(orderstate);
        sb.append(", orderadvice=").append(orderadvice);
        sb.append(", orderwatime=").append(orderwatime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}