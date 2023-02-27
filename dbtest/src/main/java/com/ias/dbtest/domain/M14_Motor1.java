package com.ias.dbtest.domain;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
//@Setter //Entity에서는 지양한다
@Table(name="MOTOR1")
public class M14_Motor1 {
    @Id
    @GeneratedValue
    @Column
    private Long ID;
    private String UTC;
    private int SYSTEMID;
    private String MOTOR1BEARINGTEMPDE ;
    private String MOTOR1BEARINGTEMPNDE ;
    private String MOTOR1WINDINGTEMPL1 ;
    private String MOTOR1WINDINGTEMPL2 ;
    private String MOTOR1WINDINGTEMPL3 ;
    private String MOTOR1AIRTEMPCOLDSIDEDE ;
    private String MOTOR1AIRTEMPHOTSIDE ;
    private String MOTOR1VIBRATION ;
    private String MOTOR1GEARBOXAXIALVIBRATION ;
    private String MOTOR1GEARBOXHORIZONTALVIBRATION ;
    private String MOTOR1GEARBOXVERTICALVIBRATION ;
    private String MOTOR1SHAFTTE ;
    private String MOTOR1SHAFTTEMP2 ;
    private String MOTOR1M1DEBEARINGOILLEVEL ;
    private String MOTOR1M2DEBEARINGOILLEVEL ;
    private String MOTOR1LOAD ;
    private String MOTOR1SPEED ;
    private String LUBOILPU ;




}
