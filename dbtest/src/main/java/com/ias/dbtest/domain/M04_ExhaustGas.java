package com.ias.dbtest.domain;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
//@Setter //Entity에서는 지양한다
@Table(name="EXHAUST_GAS")
public class M04_ExhaustGas {
    @Id
    @GeneratedValue
    @Column
    private Long ID;
    private String UTC;
    private int SYSTEMID;

    private String EXHAUSTGASTEMP ;
    private String CYLEXHGASMEANTEMP ;
    private String NO1TCRPM ;
    private String TCAIRINLETPRESS ;
    private String TCAIRINLETTEMP ;
    private String NO1TCEXHGASINTEMP ;
    private String NO1TCEXHGASOUTTEMP ;
    private String EXHGASECONOOUTTEMP ;


}
