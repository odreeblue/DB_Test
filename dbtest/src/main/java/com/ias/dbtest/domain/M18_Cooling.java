package com.ias.dbtest.domain;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
//@Setter //Entity에서는 지양한다
@Table(name="COOLING")
public class M18_Cooling {
    @Id
    @GeneratedValue
    @Column
    private Long ID;
    private String UTC;
    private int SYSTEMID;

    private String CFWLOWTEMPINLET ;
    private String CFWHIGHTEMPOUTLET ;
    private String CFWHIGHTEMPCYLINDEROUTLET ;
    private String CFWLOWLEVELEXPANSIONTANK ;
    private String CFWHIGHLEVELEXPANSIONTANK ;
    private String CFWPUMPAUTOSTART ;
    private String LOWPRESSCOOLING ;



}
