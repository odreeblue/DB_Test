package com.ias.dbtest.domain;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
//@Setter //Entity에서는 지양한다
@Table(name="EXHAUST")
public class M20_Exhaust {
    @Id
    @GeneratedValue
    @Column
    private Long ID;
    private String UTC;
    private int SYSTEMID;
    private String HIGHTEMPTURBINE ;
    private String DEVIATIONLARGE ;
    private String HIGHTEMPCYLINDEREXHAUSTGAS ;
    private String LOWPRESSSCAVENGINGAIR ;
    private String SCAVENGINGSPACEFIRE ;
    private String WATERSCAVENGINGRECEIVER ;




}
