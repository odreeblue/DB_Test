package com.ias.dbtest.service;

import com.ias.dbtest.domain.*;
import com.ias.dbtest.dto.DataDTO;
import com.ias.dbtest.repository.DataRepository;
import com.ias.dbtest.repository.M01_Repository;
import com.ias.dbtest.repository.M02_Repository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class DataService {

    private final DataRepository data_repository;

    public DataDTO findAll(ArrayList<String[]> md_list){
        DataDTO dataDTO = new DataDTO();
        for(String[] md : md_list){
            switch(md[0]){
                case "1":
                    List<M01_CoolingWater> m01_data = data_repository.findAll_m01(md[1]);
                    dataDTO.setM01(m01_data);
                    break;
                case "2":
                    List<M02_Engine> m02_data = data_repository.findAll_m02(md[1]);
                    dataDTO.setM02(m02_data);
                    break;
                case "3":
                    List<M03_Cylinders> m03_data = data_repository.findAll_m03(md[1]);
                    dataDTO.setM03(m03_data);
                    break;
                case "4":
                    List<M04_ExhaustGas> m04_data = data_repository.findAll_m04(md[1]);
                    dataDTO.setM04(m04_data);
                    break;
                case "5":
                    List<M05_FuelOil> m05_data = data_repository.findAll_m05(md[1]);
                    dataDTO.setM05(m05_data);
                    break;
                case "6":
                    List<M06_GearboxOil> m06_data = data_repository.findAll_m06(md[1]);
                    dataDTO.setM06(m06_data);
                    break;
                case "7":
                    List<M07_Generator> m07_data = data_repository.findAll_m07(md[1]);
                    dataDTO.setM07(m07_data);
                    break;
                case "8":
                    List<M08_LubOil> m08_data = data_repository.findAll_m08(md[1]);
                    dataDTO.setM08(m08_data);
                    break;
                case "9":
                    List<M09_CabinetCWater1> m09_data = data_repository.findAll_m09(md[1]);
                    dataDTO.setM09(m09_data);
                    break;
                case "10":
                    List<M10_CabinetCWater2> m10_data = data_repository.findAll_m10(md[1]);
                    dataDTO.setM10(m10_data);
                    break;
                case "11":
                    List<M11_Convertor1> m11_data = data_repository.findAll_m11(md[1]);
                    dataDTO.setM11(m11_data);
                    break;
                case "12":
                    List<M12_Convertor2> m12_data = data_repository.findAll_m12(md[1]);
                    dataDTO.setM12(m12_data);
                    break;
                case "13":
                    List<M13_MainShaft> m13_data = data_repository.findAll_m13(md[1]);
                    dataDTO.setM13(m13_data);
                    break;
                case "14":
                    List<M14_Motor1> m14_data = data_repository.findAll_m14(md[1]);
                    dataDTO.setM14(m14_data);
                    break;
                case "15":
                    List<M15_Motor2> m15_data = data_repository.findAll_m15(md[1]);
                    dataDTO.setM15(m15_data);
                    break;
                case "16":
                    List<M16_VsdM1Status> m16_data = data_repository.findAll_m16(md[1]);
                    dataDTO.setM16(m16_data);
                    break;
                case "17":
                    List<M17_VsdM2Status> m17_data = data_repository.findAll_m17(md[1]);
                    dataDTO.setM17(m17_data);
                    break;
                case "18":
                    List<M18_Cooling> m18_data = data_repository.findAll_m18(md[1]);
                    dataDTO.setM18(m18_data);
                    break;
                case "19":
                    List<M19_EngAndGen> m19_data = data_repository.findAll_m19(md[1]);
                    dataDTO.setM19(m19_data);
                    break;
                case "20":
                    List<M20_Exhaust> m20_data = data_repository.findAll_m20(md[1]);
                    dataDTO.setM20(m20_data);
                    break;
                case "21":
                    List<M21_LubAndGear> m21_data = data_repository.findAll_m21(md[1]);
                    dataDTO.setM21(m21_data);
                    break;
                case "22":
                    List<M22_VsdM1> m22_data = data_repository.findAll_m22(md[1]);
                    dataDTO.setM22(m22_data);
                    break;
                case "23":
                    List<M23_VsdM2> m23_data = data_repository.findAll_m23(md[1]);
                    dataDTO.setM23(m23_data);
                    break;
                case "24":
                    List<M24_GenStatus> m24_data = data_repository.findAll_m24(md[1]);
                    dataDTO.setM24(m24_data);
                    break;
                case "25":
                    List<M25_BusStatus> m25_data = data_repository.findAll_m25(md[1]);
                    dataDTO.setM25(m25_data);
                    break;
                case "26":
                    List<M26_MpStatus> m26_data = data_repository.findAll_m26(md[1]);
                    dataDTO.setM26(m26_data);
                    break;
                case "27":
                    List<M27_GeneratorBus> m27_data = data_repository.findAll_m27(md[1]);
                    dataDTO.setM27(m27_data);
                    break;
                case "28":
                    List<M28_MpPower> m28_data = data_repository.findAll_m28(md[1]);
                    dataDTO.setM28(m28_data);
                    break;
                case "29":
                    List<M29_Common> m29_data = data_repository.findAll_m29(md[1]);
                    dataDTO.setM29(m29_data);
                    break;
                case "30":
                    List<M30_GenAlarm> m30_data = data_repository.findAll_m30(md[1]);
                    dataDTO.setM30(m30_data);
                    break;
                case "31":
                    List<M31_Blackout> m31_data = data_repository.findAll_m31(md[1]);
                    dataDTO.setM31(m31_data);
                    break;
                case "32":
                    List<M32_EmergencyStop> m32_data = data_repository.findAll_m32(md[1]);
                    dataDTO.setM32(m32_data);
                    break;
                case "33":
                    List<M33_BusAlarm> m33_data = data_repository.findAll_m33(md[1]);
                    dataDTO.setM33(m33_data);
                    break;
            }
        }

        return dataDTO;
    }
}
