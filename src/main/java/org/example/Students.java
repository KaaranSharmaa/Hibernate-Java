package org.example;

import jakarta.persistence.*;

@Entity
//@Table(name = "KARAN") this for table name
public class Students {
    @Id
    private int Sid;
    @Column(name = "SRollno")
    private int RollNo;
    private String Sname;



    public int getRollNo(int i) {
        return RollNo;
    }

    public void setRollNo(int rollNo) {
        RollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Students{" +
                "Sname='" + Sname + '\'' +
                ", RollNo=" + RollNo +
                ", Sid=" + Sid +
                '}';
    }

    public int getSid(int i) {
        return Sid;
    }

    public void setSid(int sid) {
        Sid = sid;
    }

    public String getSname(String karansharma) {
        return Sname;
    }

    public void setSname(String sname) {
        Sname = sname;
    }

}

