package com.ias.dbtest.domain;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
//@Setter //Entity에서는 지양한다
@Table(name="LUB_AND_GEAR")
public class M21_LubAndGear {
    @Id
    @GeneratedValue
    @Column
    private Long ID;
    private String UTC;
    private int SYSTEMID;
    private String FILTERDIRTY ;
    private String LEVELLUBTANK ;
    private String LUBOILLOWPRESSINLET ;
    private String LUBOILLOWTEMPINLET ;
    private String LUBOILLOWPRESSPISTON ;
    private String HIGHTEMPPISTONOUTLET ;
    private String NO1PISTONCLOOUTTEMP ;
    private String NO2PISTONCLOOUTTEMP ;
    private String NO3PISTONCLOOUTTEMP ;
    private String NO4PISTONCLOOUTTEMP ;
    private String NO5PISTONCLOOUTTEMP ;
    private String NO6PISTONCLOOUTTEMP ;
    private String LEVELCYLINDEROIL ;
    private String CAMPUMPASTART ;
    private String CAMFILTERDIRTY ;
    private String GEARBOXOILPRESS ;




}
