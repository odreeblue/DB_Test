package com.ias.dbtest.domain;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
//@Setter //Entity에서는 지양한다
@Table(name="VSD_M1")
public class M22_VsdM1 {
    @Id
    @GeneratedValue
    @Column
    private Long ID;
    private String UTC;
    private int SYSTEMID;

    private String VSDM1AUXSUPPLY ;
    private String VSDM1WATERLEAKAGECABINET ;
    private String VSDM1TRANSISTORTEMPHIGH ;
    private String VSDM1DRIVEREFSIGNAL ;
    private String VSDM1EMERGENCYSTOPACTIVATED ;
    private String VSDM1MOTORCOOLWATERLEAKAGE ;
    private String VSDM1COOLINGWATERFLOWALARMCABINET1 ;
    private String VSDM1BREAKEROPEN ;
    private String VSDM1GATEDRIVERTEMPHIGH ;
    private String VSDM1TEMPDIODEMODULEHIGH ;
    private String VSDM1TEMPDIODEMODULEHIGHHIGH ;
    private String VSDM1REMOTEIOCOM ;
    private String VSDM1UTFACTOR ;
    private String VSDM1SYSTEMALARM ;
    private String VSDM1SYSTEMFAULT ;
    private String VSDM1PROPULSIONMOTORMINISPEED ;
    private String VSDM1FANCOMMONFAILURE ;



}
