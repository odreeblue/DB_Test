package com.ias.dbtest.domain;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
//@Setter //Entity에서는 지양한다
@Table(name="VSD_M2_STATUS")
public class M17_VsdM2Status {
    @Id
    @GeneratedValue
    @Column
    private Long ID;
    private String UTC;
    private int SYSTEMID;

    private String MP1MOTOR2CONVERTERRUNNING ;
    private String MP1MOTOR2LOCALCONTROL ;
    private String MP1MOTOR2DRIVEREADY ;
    private String MP1MOTOR2DRIVELOCALREDUCED ;
    private String MP1VSD2ALIVECOUNTER ;



}
