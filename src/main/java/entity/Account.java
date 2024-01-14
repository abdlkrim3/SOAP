package entity;

import jakarta.xml.bind.annotation.*;

import java.util.Date;

@XmlRootElement(name="Account")
public class Account {



    private int code;

    private double sold;
    @XmlTransient
    private Date createdAt;

    public Account() {
    }
    public Account(int code, double sold) {
        this.code = code;
        this.sold = sold;
        this.createdAt = new Date();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSold() {
        return sold;
    }

    public void setSold(double sold) {
        this.sold = sold;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
