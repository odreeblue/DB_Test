package com.ias.dbtest.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
//@Setter //Entity에서는 지양한다
@Table(name="COOLING_WATER")
public class M01_CoolingWater{
    @Id
    @GeneratedValue
    @Column
    private Long ID;
    private String UTC;
    private int SYSTEMID;
    private String COOLINGWATERTEMP;
    private String COOLINGWATERTANKLEVEL;
    private String HTCFWINLETTEMP;
    private String LTCFWINLETTEMP;
    private String HTCFWOUTLETTEMP;
    private String LTCFWOUTLETTEMP;
    private String HTCFWINLETPRESS;
    private String LTCFWINLETPRESS;
    private String JACKETCFWINPRESS;
    private String JACKETCFWINTEMP;
    private String JCFWCOMMONOUTTEMP;
    private String NO1JCFWOUTTEMP;
    private String NO2JCFWOUTTEMP;
    private String NO3JCFWOUTTEMP;
    private String NO4JCFWOUTTEMP;
    private String NO5JCFWOUTTEMP;
    private String NO6JCFWOUTTEMP;
    private String CENTRALCFWINTEMP;
    private String NO1ACCWINPRESS;
    private String NO1ACCWINTEMP;
    private String NO1ACCWOUTTEMP;
    private String CSWPPOUTTEMP;
    private String CSWPPDISCHPRESS;
    private String NO3DBWBTKPORTLEVEL;
    private String NO3DBWBTKSTBDLEVEL;
    private String NO4DBWBTKPORTLEVEL;
    private String NO4DBWBTKSTBDLEVEL;
    private String NO5DBWBTKPORTLEVEL;
    private String NO5DBWBTKSTBDLEVEL;
//    private Long id;
//    private String utc;
//    private int systemid;
//    private String coolingwatertemp ;
//    private String coolingwatertanklevel ;
//    private String htcfwinlettemp ;
//    private String ltcfwinlettemp ;
//    private String htcfwoutlettemp ;
//    private String ltcfwoutlettemp ;
//    private String htcfwinletpress ;
//    private String ltcfwinletpress ;
//    private String jacketcfwinpress ;
//    private String jacketcfwintemp ;
//    private String jcfwcommonouttemp ;
//    private String no1jcfwouttemp ;
//    private String no2jcfwouttemp ;
//    private String no3jcfwouttemp ;
//    private String no4jcfwouttemp ;
//    private String no5jcfwouttemp ;
//    private String no6jcfwouttemp ;
//    private String centralcfwintemp ;
//    private String no1accwinpress ;
//    private String no1accwintemp ;
//    private String no1accwouttemp ;
//    private String cswppouttemp ;
//    private String cswppdischpress ;
//    private String no3dbwbtkportlevel ;
//    private String no3dbwbtkstbdlevel ;
//    private String no4dbwbtkportlevel ;
//    private String no4dbwbtkstbdlevel ;
//    private String no5dbwbtkportlevel ;
//    private String no5dbwbtkstbdlevel ;
}
