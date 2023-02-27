package com.ias.dbtest.domain;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
//@Setter //Entity에서는 지양한다
@Table(name="ENG_AND_GEN")
public class M19_EngAndGen {
    @Id
    @GeneratedValue
    @Column
    private Long ID;
    private String UTC;
    private int SYSTEMID;

    private String WATERTEMPHIGH ;
    private String LUBOILPRESSLOW ;
    private String GEAROILPRESSLOW ;
    private String WATERLEVELLOW ;
    private String EXHAUSTGASTEMPHIGH ;
    private String BATTERYCHARGELOW ;
    private String OVERSPEED ;
    private String OVERLOAD ;
    private String REVERSEFAILED ;
    private String STARTFAILED ;
    private String SLOWDOWN ;
    private String SHUTDOWN ;
    private String LOWPRESSURECONTROLAIR ;
    private String LOWPRESSURESTARTAIR ;
    private String BATTERYCHARGE ;
    private String BATTERYVOLTAGE ;
    private String FUELLEAKAGE ;
    private String FUELTANKLEVEL ;



}
