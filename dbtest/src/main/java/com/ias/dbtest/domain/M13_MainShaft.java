package com.ias.dbtest.domain;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
//@Setter //Entity에서는 지양한다
@Table(name="MAIN_SHAFT")
public class M13_MainShaft {
    @Id
    @GeneratedValue
    @Column
    private Long ID;
    private String UTC;
    private int SYSTEMID;

    private String SHAFTSPEED ;
    private String PITCH ;
    private String NO1INTERSHAFTBEARINGTEMP ;
    private String NO2INTERSHAFTBEARINGTEMP ;
    private String NO3INTERSHAFTBEARINGTEMP ;
    private String NO4INTERSHAFTBEARINGTEMP ;
    private String PROPULSIONEFFICIENCY ;



}
