package com.example.learning.springpractice;

import java.util.List;

public class Question {

    private int qNo;
    private String qus;
    private List<String> asnwer;


    public Question() {
    }

    public Question(int qNo, String qus, List<String> asnwer) {
        this.qNo = qNo;
        this.qus = qus;
        this.asnwer = asnwer;
    }


    @Override
    public String toString() {
        return "Question{" +
                "qNo=" + qNo +
                ", qus='" + qus + '\'' +
                ", asnwer=" + asnwer +
                '}';
    }


    public int getqNo() {
        return qNo;
    }

    public void setqNo(int qNo) {
        this.qNo = qNo;
    }

    public String getQus() {
        return qus;
    }

    public void setQus(String qus) {
        this.qus = qus;
    }

    public List<String> getAsnwer() {
        return asnwer;
    }

    public void setAsnwer(List<String> asnwer) {
        this.asnwer = asnwer;
    }
}
