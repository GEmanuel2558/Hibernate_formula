package models;

import org.hibernate.annotations.Formula;

import javax.persistence.*;

@Entity
@Table(name = "salaries")
public class Salaries {

    @Id
    @Column(name = "empid")
    private long empId;
    @Column(name = "empname")
    private String empName;
    @Column(name = "basic")
    private int basic;
    @Column(name = "conveyance")
    private int conveyance;
    @Column(name = "hra")
    private int hra;

    @Formula("UPPER(empname)")
    private String upperCaseEmpName;

    @Formula(" basic + conveyance + hra ")
    private int total;

    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getBasic() {
        return basic;
    }

    public void setBasic(int basic) {
        this.basic = basic;
    }

    public int getConveyance() {
        return conveyance;
    }

    public void setConveyance(int conveyance) {
        this.conveyance = conveyance;
    }

    public int getHra() {
        return hra;
    }

    public void setHra(int hra) {
        this.hra = hra;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getUpperCaseEmpName() {
        return upperCaseEmpName;
    }

    public void setUpperCaseEmpName(String upperCaseEmpName) {
        this.upperCaseEmpName = upperCaseEmpName;
    }


    @Override
    public String toString() {
        return "Salaries{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", basic=" + basic +
                ", conveyance=" + conveyance +
                ", hra=" + hra +
                ", upperCaseEmpName='" + upperCaseEmpName + '\'' +
                ", total=" + total +
                '}';
    }
}