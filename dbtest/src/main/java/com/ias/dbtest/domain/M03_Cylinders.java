package com.ias.dbtest.domain;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
//@Setter //Entity에서는 지양한다
@Table(name="CYLINDERS")
public class M03_Cylinders {
    @Id
    @GeneratedValue
    @Column
    private Long ID;
    private String UTC;
    private int SYSTEMID;

    private String NO1CYLAVGTEMP ;
    private String NO2CYLAVGTEMP ;
    private String NO3CYLAVGTEMP ;
    private String NO4CYLAVGTEMP ;
    private String NO5CYLAVGTEMP ;
    private String NO6CYLAVGTEMP ;
    private String NO7CYLAVGTEMP ;
    private String NO8CYLAVGTEMP ;
    private String NO9CYLAVGTEMP ;
    private String NO10CYLAVGTEMP ;
    private String NO11CYLAVGTEMP ;
    private String NO12CYLAVGTEMP ;
    private String NO1CYLEXHGASOUTTEMP ;
    private String NO2CYLEXHGASOUTTEMP ;
    private String NO3CYLEXHGASOUTTEMP ;
    private String NO4CYLEXHGASOUTTEMP ;
    private String NO5CYLEXHGASOUTTEMP ;
    private String NO6CYLEXHGASOUTTEMP ;
    private String NO7CYLEXHGASOUTTEMP ;
    private String NO8CYLEXHGASOUTTEMP ;
    private String NO9CYLEXHGASOUTTEMP ;
    private String NO10CYLEXHGASOUTTEMP ;
    private String NO11CYLEXHGASOUTTEMP ;
    private String NO12CYLEXHGASOUTTEMP ;
    private String NO1CYLPRESSURE ;
    private String NO2CYLPRESSURE ;
    private String NO3CYLPRESSURE ;
    private String NO4CYLPRESSURE ;
    private String NO5CYLPRESSURE ;
    private String NO6CYLPRESSURE ;
    private String NO7CYLPRESSURE ;
    private String NO8CYLPRESSURE ;
    private String NO9CYLPRESSURE ;
    private String NO10CYLPRESSURE ;
    private String NO11CYLPRESSURE ;
    private String NO12CYLPRESSURE ;
    private String NO1CYLEXHGASDEVTEMP ;
    private String NO2CYLEXHGASDEVTEMP ;
    private String NO3CYLEXHGASDEVTEMP ;
    private String NO4CYLEXHGASDEVTEMP ;
    private String NO5CYLEXHGASDEVTEMP ;
    private String NO6CYLEXHGASDEVTEMP ;



}
