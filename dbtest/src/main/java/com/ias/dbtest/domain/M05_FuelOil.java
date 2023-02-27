package com.ias.dbtest.domain;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
//@Setter //Entity에서는 지양한다
@Table(name="FUEL_OIL")
public class M05_FuelOil {
    @Id
    @GeneratedValue
    @Column
    private Long ID;
    private String UTC;
    private int SYSTEMID;


    private String HFOSERVICETANKTEMP ;
    private String HFOSERVICETANKLEVEL ;
    private String LSFOTANKTEMP ;
    private String LSFOTANKLEVEL ;
    private String MDOSERVICETANKLEVEL ;
    private String MAINGASPRESSURE ;
    private String MAINGASPRESSDEVIATIONFROMREF ;
    private String FOINTEMP ;
    private String FOINPRESS ;
    private String PILOTFUELTEMPINLET ;
    private String PILOTFUELPRESSINLET ;
    private String PILOTFUELPRESSPUMPOUTLET ;
    private String BOILERFOINTEMP ;
    private String AUXBOILERSTEAMDRUMPRESS ;
    private String HFOSERVICETKVOLUME ;
    private String HFOSETTLINGTKTEMP ;
    private String HFOSETTINGTKVOLUME ;
    private String MDOSERVICETKVOLUME ;
    private String MDOSETTINGTKVOLUME ;
    private String HFOOVERFLOWTKVOLUME ;
    private String BOILERDOUSE ;
    private String LOINTEMP ;
    private String NO1LOAUTOFILTERDIFFP ;
    private String HFOCONSUMPTION ;
    private String SPECIFICFUELOILRATEISO ;
    private String HFOSETTINGTKLEVEL ;
    private String MDOSETTINGTKLEVEL ;
    private String HFOOVERFLOWTKLEVEL ;


}
