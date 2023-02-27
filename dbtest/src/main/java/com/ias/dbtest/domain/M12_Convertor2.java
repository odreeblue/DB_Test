package com.ias.dbtest.domain;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
//@Setter //Entity에서는 지양한다
@Table(name="CONVERTOR2")
public class M12_Convertor2 {
    @Id
    @GeneratedValue
    @Column
    private Long ID;
    private String UTC;
    private int SYSTEMID;
    private String CONVERTER1TRANSISTORTEMP ;
    private String CONVERTER1GATEDRIVERHIGHESTTEMP ;




}
