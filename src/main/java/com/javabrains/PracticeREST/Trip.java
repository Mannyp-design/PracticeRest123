package com.javabrains.PracticeREST;

import com.javabrains.PracticeREST.enums.FareTypeEnum;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;
import java.util.Date;

@RestController
@RequestMapping("/v3")
public class Trip {

    private int id ;

    private String name ;

    private Date estimatedPickup ;

    private Date estimatedDropOff;


    private double salaryEmp;

    private FareTypeEnum fareType ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @GetMapping("/get")
    public ResponseEntity<String> getNameforTrip(){

         return ResponseEntity.ok(getName());

    }

    public String getName() {
        return name;
    }
    @Value("${trip.name}")
    public void setName(String name) {
        this.name = name;
    }

    public Date getEstimatedPickup() {
        return estimatedPickup;
    }

    public void setEstimatedPickup(Date estimatedPickup) {
        this.estimatedPickup = estimatedPickup;
    }

    public Date getEstimatedDropOff() {
        return estimatedDropOff;
    }

    public void setEstimatedDropOff(Date estimatedDropOff) {
        this.estimatedDropOff = estimatedDropOff;
    }

    public FareTypeEnum getFareType() {
        return fareType;
    }

    public void setFareType(FareTypeEnum fareType) {
        this.fareType = fareType;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", estimatedPickup=" + estimatedPickup +
                ", estimatedDropOff=" + estimatedDropOff +
                ", fareType=" + fareType +
                '}';
    }
}
