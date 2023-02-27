package com.ias.dbtest.domain;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
//@Setter //Entity에서는 지양한다
@Table(name="GEN_ALARM")
public class M30_GenAlarm {
    @Id
    @GeneratedValue
    @Column
    private Long ID;
    private String UTC;
    private int SYSTEMID;


    private String GENENGINESHUTDOWN ;
    private String GENACKNOWLEDGEALLALARMS ;
    private String GENLIGHTLOADCANCEL ;
    private String GENGOVERNORRAISE ;
    private String GENGOVERNORLOWER ;
    private String PMSWARNING ;


}
