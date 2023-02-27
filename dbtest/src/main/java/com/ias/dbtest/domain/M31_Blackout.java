package com.ias.dbtest.domain;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
//@Setter //Entity에서는 지양한다
@Table(name="BLACKOUT")
public class M31_Blackout {
    @Id
    @GeneratedValue
    @Column
    private Long ID;
    private String UTC;
    private int SYSTEMID;


    private String BUSBLACKOUT ;


}
