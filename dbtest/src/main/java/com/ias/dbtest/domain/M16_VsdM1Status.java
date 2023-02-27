package com.ias.dbtest.domain;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
//@Setter //Entity에서는 지양한다
@Table(name="VSD_M1_STATUS")
public class M16_VsdM1Status {
    @Id
    @GeneratedValue
    @Column
    private Long ID;
    private String UTC;
    private int SYSTEMID;


    private String MOTOR1CONVERTERRUNNING ;
    private String MOTOR1LOCALCONTROL ;
    private String MOTOR1DRIVEREADY ;
    private String MOTOR1DRIVELOCALREDUCED ;
    private String VSD1ALIVECOUNTER ;


}
