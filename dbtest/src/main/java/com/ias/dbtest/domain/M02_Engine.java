package com.ias.dbtest.domain;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
//@Setter //Entity에서는 지양한다
@Table(name="ENGINE")
public class M02_Engine{
    @Id
    @GeneratedValue
    @Column
    private Long ID;
    private String UTC;
    private int SYSTEMID;
    private String RPM ;
    private String DIRECTION ;
    private String ENGINERUN ;
    private String ENGINESTARTRELAY ;
    private String FUELCUTVALVE ;
    private String EMERGENCYALARMBUZZER ;
    private String SMARTKEYLEDLAMP ;
    private String CAMCHANNELRELAY ;
    private String IGNITIONCHECKING ;
    private String ENGINESTARTMODE ;
    private String ENGINESTOPMODE ;
    private String LOADS ;
    private String STARTINGAIRPRESS ;
    private String CONTROLAIRPRESS ;
    private String VIBRATION ;
    private String EXHVVSPRINGAIRPRESS ;
    private String CAMCHAINWHEELBRGTEMPFWD ;
    private String HORSEPOWERMETERTORQUE ;
    private String HORSEPOWERMETERSHAFTSPEED ;
    private String HORSEPOWERMETERSHAFTPOWERX10 ;
    private String BRIDGECOMMANDRPM ;
    private String SCAVAIRPRESS ;
    private String NO1SCAVAIRINTEMP ;
    private String NO2SCAVAIRINTEMP ;
    private String NO3SCAVAIRINTEMP ;
    private String NO4SCAVAIRINTEMP ;
    private String NO5SCAVAIRINTEMP ;
    private String NO6SCAVAIRINTEMP ;



}
