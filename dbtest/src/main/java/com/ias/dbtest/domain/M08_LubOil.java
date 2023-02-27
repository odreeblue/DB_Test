package com.ias.dbtest.domain;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
//@Setter //Entity에서는 지양한다
@Table(name="LUB_OIL")
public class M08_LubOil {
    @Id
    @GeneratedValue
    @Column
    private Long ID;
    private String UTC;
    private int SYSTEMID;
    private String LOINLETPRESS ;
    private String MAINLOSUMPTANKLEVEL ;
    private String LOINLETTEMP ;
    private String NO1TCLOPRESS ;
    private String NO1TCLOOUTTEMP ;
    private String CYLLOINLETTEMP ;
    private String MAINLOSUMPTKVOLUME ;



}
