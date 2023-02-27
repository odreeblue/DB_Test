package com.ias.dbtest.domain;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
//@Setter //Entity에서는 지양한다
@Table(name="GENERATOR")
public class M07_Generator {
    @Id
    @GeneratedValue
    @Column
    private Long ID;
    private String UTC;
    private int SYSTEMID;
    private String WINDINGTEMPL1 ;
    private String WINDINGTEMPL2 ;
    private String WINDINGTEMPL3 ;
    private String AIRTEMPCOLDSIDEDE ;
    private String AIRTEMPHOTSIDE ;
    private String BEARINGTEMPNDE ;
    private String BEARINGTEMPDE ;
    private String OILLEVELDE ;
    private String NO1GELOINLETPRESS ;
    private String NO1GELTFWINLETPRESS ;
    private String NO1GEHTFWINLETPRESS ;
    private String NO1GEFOINLETPRESS ;
    private String NO1GESTARTINGAIRPRESS ;
    private String NO1GELOINLETTEMP ;
    private String NO1GEFOINTEMP ;
    private String NO1GEEXHGASTCOUTLETTEMP ;
    private String NO1GECYL1EXHGASTEMP ;
    private String NO1GECYL2EXHGASTEMP ;
    private String NO1GECYL3EXHGASTEMP ;
    private String NO1GECYL4EXHGASTEMP ;
    private String NO1GECYL5EXHGASTEMP ;
    private String NO1GECYL6EXHGASTEMP ;
    private String NO2GELOINLETPRESS ;
    private String NO2GELTFWINLETPRESS ;
    private String NO2GEHTFWINLETPRESS ;
    private String NO2GEFOINLETPRESS ;
    private String NO2GESTARTINGAIRPRESS ;
    private String NO2GELOINLETTEMP ;
    private String NO2GEFOINTEMP ;
    private String NO2GEEXHGASTCOUTLETTEMP ;
    private String NO2GECYL1EXHGASTEMP ;
    private String NO2GECYL2EXHGASTEMP ;
    private String NO2GECYL3EXHGASTEMP ;
    private String NO2GECYL4EXHGASTEMP ;
    private String NO2GECYL5EXHGASTEMP ;
    private String NO2GECYL6EXHGASTEMP ;
    private String NO3GELOINLETPRESS ;
    private String NO3GELTFWINLETPRESS ;
    private String NO3GEHTFWINLETPRESS ;
    private String NO3GEFOINLETPRESS ;
    private String NO3GESTARTINGAIRPRESS ;
    private String NO3GELOINLETTEMP ;
    private String NO3GEFOINTEMP ;
    private String NO3GEEXHGASTCOUTLETTEMP ;
    private String NO3GECYL1EXHGASTEMP ;
    private String NO3GECYL2EXHGASTEMP ;
    private String NO3GECYL3EXHGASTEMP ;
    private String NO3GECYL4EXHGASTEMP ;
    private String NO3GECYL5EXHGASTEMP ;
    private String NO3GECYL6EXHGASTEMP ;
    private String NO4GELOINLETPRESS ;
    private String NO4GELTFWINLETPRESS ;
    private String NO4GEHTFWINLETPRESS ;
    private String NO4GEFOINLETPRESS ;
    private String NO4GESTARTINGAIRPRESS ;
    private String NO4GELOINLETTEMP ;
    private String NO4GEFOINTEMP ;
    private String NO4GEEXHGASTCOUTLETTEMP ;
    private String NO4GECYL1EXHGASTEMP ;
    private String NO4GECYL2EXHGASTEMP ;
    private String NO4GECYL3EXHGASTEMP ;
    private String NO4GECYL4EXHGASTEMP ;
    private String NO4GECYL5EXHGASTEMP ;
    private String NO4GECYL6EXHGASTEMP ;
    private String NO1MAINBEARGTEMP ;
    private String NO2MAINBEARGTEMP ;
    private String NO3MAINBEARGTEMP ;
    private String NO4MAINBEARGTEMP ;
    private String NO5MAINBEARGTEMP ;
    private String NO6MAINBEARGTEMP ;
    private String THRUSTRADIALBEARTEMP ;
    private String THRUSTPADTEMP ;
    private String GEHFOCONSUMPTION ;




}
