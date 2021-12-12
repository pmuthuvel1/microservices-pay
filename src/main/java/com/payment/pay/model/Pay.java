package com.payment.pay.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author asus
 */
@Entity
@Table(name = "pay")
@NamedQueries({
    @NamedQuery(name = "Pay.findAll", query = "SELECT p FROM Pay p"),
    @NamedQuery(name = "Pay.findById", query = "SELECT p FROM Pay p WHERE p.id = :id"),
    @NamedQuery(name = "Pay.findByCustomerId", query = "SELECT p FROM Pay p WHERE p.customerId = :customerId"),
    @NamedQuery(name = "Pay.findByPayAmount", query = "SELECT p FROM Pay p WHERE p.payAmount = :payAmount"),
    @NamedQuery(name = "Pay.findByPayRemarks", query = "SELECT p FROM Pay p WHERE p.payRemarks = :payRemarks"),
    @NamedQuery(name = "Pay.findByCreatedUserId", query = "SELECT p FROM Pay p WHERE p.createdUserId = :createdUserId"),
    @NamedQuery(name = "Pay.findByCreatedDate", query = "SELECT p FROM Pay p WHERE p.createdDate = :createdDate"),
    @NamedQuery(name = "Pay.findByModifiedUserId", query = "SELECT p FROM Pay p WHERE p.modifiedUserId = :modifiedUserId"),
    @NamedQuery(name = "Pay.findByModifiedDate", query = "SELECT p FROM Pay p WHERE p.modifiedDate = :modifiedDate")})
public class Pay implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "customer_id")
    private int customerId;
    @Basic(optional = false)
    @Column(name = "pay_amount")
    private int payAmount;
    @Column(name = "pay_remarks")
    private String payRemarks;
    @Column(name = "created_user_id")
    private String createdUserId;
    @Column(name = "created_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @Column(name = "modified_user_id")
    private String modifiedUserId;
    @Column(name = "modified_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;

    public Pay() {
    }

    public Pay(Integer id) {
        this.id = id;
    }

    public Pay(Integer id, int customerId, int payAmount) {
        this.id = id;
        this.customerId = customerId;
        this.payAmount = payAmount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(int payAmount) {
        this.payAmount = payAmount;
    }

    public String getPayRemarks() {
        return payRemarks;
    }

    public void setPayRemarks(String payRemarks) {
        this.payRemarks = payRemarks;
    }

    public String getCreatedUserId() {
        return createdUserId;
    }

    public void setCreatedUserId(String createdUserId) {
        this.createdUserId = createdUserId;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getModifiedUserId() {
        return modifiedUserId;
    }

    public void setModifiedUserId(String modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pay)) {
            return false;
        }
        Pay other = (Pay) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.crm.customer.model.Pay[ id=" + id + " ]";
    }
    
}
