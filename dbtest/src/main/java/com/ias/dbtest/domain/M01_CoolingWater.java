package com.ias.dbtest.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@Table(name="COOLING_WATER")
public class M01_CoolingWater {
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
}
