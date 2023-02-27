package com.ias.dbtest.domain;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
//@Setter //Entity에서는 지양한다
@Table(name="MOTOR2")
public class M15_Motor2 {
    @Id
    @GeneratedValue
    @Column
    private Long ID;
    private String UTC;
    private int SYSTEMID;


    private String MOTOR2BEARINGTEMPDE ;
    private String MOTOR2BEARINGTEMPNDE ;
    private String MOTOR2WINDINGTEMPL1 ;
    private String MOTOR2WINDINGTEMPL2 ;
    private String MOTOR2WINDINGTEMPL3 ;
    private String MOTOR2AIRTEMPCOLDSIDEDE ;
    private String MOTOR2AIRTEMPHOTSIDE ;
    private String MOTOR2VIBRATION ;
    private String MOTOR2GEARBOXAXIALVIBRATION ;
    private String MOTOR2GEARBOXHORIZONTALVIBRATION ;
    private String MOTOR2GEARBOXVERTICALVIBRATION ;
    private String MOTOR2SHAFTTE ;
    private String MOTOR2SHAFTTEMP2 ;
    private String MOTOR2M1DEBEARINGOILLEVEL ;
    private String MOTOR2M2DEBEARINGOILLEVEL ;
    private String MOTOR2LOAD ;
    private String MOTOR2SPEED ;
    private String LUBOILPUMP2 ;


}
