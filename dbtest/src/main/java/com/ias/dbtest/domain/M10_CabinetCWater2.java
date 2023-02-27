package com.ias.dbtest.domain;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
//@Setter //Entity에서는 지양한다
@Table(name="CABINET_CWATER2")
public class M10_CabinetCWater2 {
    @Id
    @GeneratedValue
    @Column
    private Long ID;
    private String UTC;
    private int SYSTEMID;

    private String CABINET2COOLINGWATERTEMP ;
    private String CABINET2COOLINGWATERFLOW ;



}
