package com.ias.dbtest.domain;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
//@Setter //Entity에서는 지양한다
@Table(name="BUS_ALARM")
public class M33_BusAlarm {
    @Id
    @GeneratedValue
    @Column
    private Long ID;
    private String UTC;
    private int SYSTEMID;


    private String BUSHIGHFREQUENCY ;
    private String LOWFREQUENCY ;
    private String BUSHIGHVOLTAGE ;
    private String BUSLOWVOLTAGE ;
    private String HIGHLOAD ;
    private String LIGHTLOAD ;
    private String PRETRIP ;


}
