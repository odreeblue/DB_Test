package com.ias.dbtest.domain;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
//@Setter //Entity에서는 지양한다
@Table(name="GEN_STATUS")
public class M24_GenStatus {
    @Id
    @GeneratedValue
    @Column
    private Long ID;
    private String UTC;
    private int SYSTEMID;
    private String GENREADYTOSTART ;
    private String GENENGINERUNNING ;
    private String GENCURRENTR ;
    private String GENCURRENTS ;
    private String GENCURRENTT ;
    private String GENVOLTAGE ;
    private String GENFREQ ;
    private String GENPOWER ;




}
