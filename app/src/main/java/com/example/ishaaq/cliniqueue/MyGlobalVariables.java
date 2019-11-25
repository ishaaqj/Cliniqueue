package com.example.ishaaq.cliniqueue;

import android.app.Application;
import android.os.Bundle;

public class MyGlobalVariables extends Application {

    private String reasonForVisit;
    private String symptoms;
    private String allergies;
    private String history;
    private String age;
    private String weight;

    //String s;
    private static MyGlobalVariables ourInstance = new MyGlobalVariables();
    public static MyGlobalVariables getInstance() {
        return ourInstance;
    }

    public String getReasonForVisit(){
        return reasonForVisit;
    }
    public void setReasonForVisit(String reason){
        this.reasonForVisit = reason;
    }

    public String getSymptoms(){
        return symptoms;
    }
    public void setSymptoms(String symptoms){
        this.symptoms = symptoms;
    }

    public String getAllergies(){
        return allergies;
    }
    public void setAllergies(String allergies){
        this.allergies = allergies;
    }

    public String getHistory(){
        return history;
    }
    public void setHistory(String history){
        this.history = history;
    }

    public String getAge(){
        return age;
    }
    public void setAge(String age){
        this.age = age;
    }

    public String getWeight(){
        return weight;
    }
    public void setWeight(String weight){
        this.weight= weight;
    }

}
