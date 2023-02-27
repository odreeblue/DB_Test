package com.ias.dbtest.domain;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
//@Setter //Entity에서는 지양한다
@Table(name="VSD_M2")
public class M23_VsdM2 {
    @Id
    @GeneratedValue
    @Column
    private Long ID;
    private String UTC;
    private int SYSTEMID;
    private String VSDM2AUXSUPPLY ;
    private String VSDM2WATERLEAKAGECABINET ;
    private String VSDM2TRANSISTORTEMPHIGH ;
    private String VSDM2DRIVEREFSIGNAL ;
    private String VSDM2EMERGENCYSTOPACTIVATED ;
    private String VSDM2MOTORCOOLWATERLEAKAGE ;
    private String VSDM2COOLINGWATERFLOWALARMCABINET1 ;
    private String VSDM2BREAKEROPEN ;
    private String VSDM2GATEDRIVERTEMPHIGH ;
    private String VSDM2TEMPDIODEMODULEHIGH ;
    private String VSDM2TEMPDIODEMODULEHIGHHIGH ;
    private String VSDM2REMOTEIOCOM ;
    private String VSDM2UTFACTOR ;
    private String VSDM2SYSTEMALARM ;
    private String VSDM2SYSTEMFAULT ;
    private String VSDM2PROPULSIONMOTORMINISPEED ;
    private String VSDM2FANCOMMONFAILURE ;




}
