package com.subash;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

//@Component
public class doctor implements staff {
//    @Autowired
//    private Qualification qualification;
    private String qualification;

    @Override
    public String toString() {
        return "doctor{" +
                "qualification='" + qualification + '\'' +
                '}';
    }
    @PostConstruct
    public void postconstruct(){
        System.out.println("post construct was called");
    }
    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void assist(){
        System.out.println("doctor has a qualifiaction " );
    }
}
