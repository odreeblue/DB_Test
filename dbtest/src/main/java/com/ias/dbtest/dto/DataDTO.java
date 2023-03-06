package com.ias.dbtest.dto;

import com.ias.dbtest.domain.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
//@AllArgsConstructor
@NoArgsConstructor
public class DataDTO {
    List<M01_CoolingWater> m01=null;
    List<M02_Engine> m02=null;
    List<M03_Cylinders> m03=null;
    List<M04_ExhaustGas> m04=null;
    List<M05_FuelOil> m05=null;
    List<M06_GearboxOil> m06=null;
    List<M07_Generator> m07=null;
    List<M08_LubOil> m08=null;
    List<M09_CabinetCWater1> m09=null;
    List<M10_CabinetCWater2> m10=null;
    List<M11_Convertor1> m11=null;
    List<M12_Convertor2> m12=null;
    List<M13_MainShaft> m13=null;
    List<M14_Motor1> m14=null;
    List<M15_Motor2> m15=null;
    List<M16_VsdM1Status> m16=null;
    List<M17_VsdM2Status> m17=null;
    List<M18_Cooling> m18=null;
    List<M19_EngAndGen> m19=null;
    List<M20_Exhaust> m20=null;
    List<M21_LubAndGear> m21=null;
    List<M22_VsdM1> m22=null;
    List<M23_VsdM2> m23=null;
    List<M24_GenStatus> m24=null;
    List<M25_BusStatus> m25=null;
    List<M26_MpStatus> m26=null;
    List<M27_GeneratorBus> m27=null;
    List<M28_MpPower> m28=null;
    List<M29_Common> m29=null;
    List<M30_GenAlarm> m30=null;
    List<M31_Blackout> m31=null;
    List<M32_EmergencyStop> m32=null;
    List<M33_BusAlarm> m33=null;
}
