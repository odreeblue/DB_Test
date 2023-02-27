package com.ias.dbtest.domain;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
//@Setter //Entity에서는 지양한다
@Table(name="CABINET_CWATER1")
public class M09_CabinetCWater1 {
    @Id
    @GeneratedValue
    @Column
    private Long ID;
    private String UTC;
    private int SYSTEMID;
    private String CABINET1COOLINGWATERTEMP ;
    private String CABINET1COOLINGWATERFLOW ;





}
