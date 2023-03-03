package com.ias.dbtest.repository;


import com.ias.dbtest.domain.*;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@Repository
@RequiredArgsConstructor
public class DataRepository {
    private final EntityManager em;

    public List<M01_CoolingWater> findAll_m01(String TF) {
        String sql = null;
        if(TF.equals("true")){
            sql = "select d from M01_CoolingWater d where d.SYSTEMID='1' order by d.ID desc";
        }
        else{
            sql = "select d from M01_CoolingWater d where d.SYSTEMID='2' order by d.ID desc";
        }

        return em.createQuery(sql, M01_CoolingWater.class).setMaxResults(5).getResultList();
    }
    public List<M02_Engine> findAll_m02(String TF) {
        String sql = null;
        if(TF.equals("true")){
            sql = "select d from M02_Engine d where d.SYSTEMID='1' order by d.ID desc";
        }
        else{
            sql = "select d from M02_Engine d where d.SYSTEMID='2' order by d.ID desc";
        }
        return em.createQuery(sql, M02_Engine.class).setMaxResults(5).getResultList();
    }
    public List<M03_Cylinders> findAll_m03(String TF) {
        String sql = null;
        if(TF.equals("true")){
            sql = "select d from M03_Cylinders d where d.SYSTEMID='1' order by d.ID desc";
        }
        else{
            sql = "select d from M03_Cylinders d where d.SYSTEMID='2' order by d.ID desc";
        }
        return em.createQuery(sql, M03_Cylinders.class).setMaxResults(5).getResultList();
    }
    public List<M04_ExhaustGas> findAll_m04(String TF) {
        String sql = null;
        if(TF.equals("true")){
            sql = "select d from M04_ExhaustGas d where d.SYSTEMID='1' order by d.ID desc";
        }
        else{
            sql = "select d from M04_ExhaustGas d where d.SYSTEMID='2' order by d.ID desc";
        }
        return em.createQuery(sql, M04_ExhaustGas.class).setMaxResults(5).getResultList();
    }
    public List<M05_FuelOil> findAll_m05(String TF) {
        String sql = null;
        if(TF.equals("true")){
            sql = "select d from M05_FuelOil d where d.SYSTEMID='1' order by d.ID desc";
        }
        else{
            sql = "select d from M05_FuelOil d where d.SYSTEMID='2' order by d.ID desc";
        }
        return em.createQuery(sql, M05_FuelOil.class).setMaxResults(5).getResultList();
    }
    public List<M06_GearboxOil> findAll_m06(String TF) {
        String sql = null;
        if(TF.equals("true")){
            sql = "select d from M06_GearboxOil d where d.SYSTEMID='1' order by d.ID desc";
        }
        else{
            sql = "select d from M06_GearboxOil d where d.SYSTEMID='2' order by d.ID desc";
        }
        return em.createQuery(sql, M06_GearboxOil.class).setMaxResults(5).getResultList();
    }
    public List<M07_Generator> findAll_m07(String TF) {
        String sql = null;
        if(TF.equals("true")){
            sql = "select d from M07_Generator d where d.SYSTEMID='1' order by d.ID desc";
        }
        else{
            sql = "select d from M07_Generator d where d.SYSTEMID='2' order by d.ID desc";
        }
        return em.createQuery(sql, M07_Generator.class).setMaxResults(5).getResultList();
    }
    public List<M08_LubOil> findAll_m08(String TF) {
        String sql = null;
        if(TF.equals("true")){
            sql = "select d from M08_LubOil d where d.SYSTEMID='1' order by d.ID desc";
        }
        else{
            sql = "select d from M08_LubOil d where d.SYSTEMID='2' order by d.ID desc";
        }
        return em.createQuery(sql, M08_LubOil.class).setMaxResults(5).getResultList();
    }
    public List<M09_CabinetCWater1> findAll_m09(String TF) {
        String sql = null;
        if(TF.equals("true")){
            sql = "select d from M09_CabinetCWater1 d where d.SYSTEMID='1' order by d.ID desc";
        }
        else{
            sql = "select d from M09_CabinetCWater1 d where d.SYSTEMID='2' order by d.ID desc";
        }
        return em.createQuery(sql, M09_CabinetCWater1.class).setMaxResults(5).getResultList();
    }
    public List<M10_CabinetCWater2> findAll_m10(String TF) {
        String sql = null;
        if(TF.equals("true")){
            sql = "select d from M10_CabinetCWater2 d where d.SYSTEMID='1' order by d.ID desc";
        }
        else{
            sql = "select d from M10_CabinetCWater2 d where d.SYSTEMID='2' order by d.ID desc";
        }
        return em.createQuery(sql, M10_CabinetCWater2.class).setMaxResults(5).getResultList();
    }
    public List<M11_Convertor1> findAll_m11(String TF) {
        String sql = null;
        if(TF.equals("true")){
            sql = "select d from M11_Convertor1 d where d.SYSTEMID='1' order by d.ID desc";
        }
        else{
            sql = "select d from M11_Convertor1 d where d.SYSTEMID='2' order by d.ID desc";
        }
        return em.createQuery(sql, M11_Convertor1.class).setMaxResults(5).getResultList();
    }
    public List<M12_Convertor2> findAll_m12(String TF) {
        String sql = null;
        if(TF.equals("true")){
            sql = "select d from M12_Convertor2 d where d.SYSTEMID='1' order by d.ID desc";
        }
        else{
            sql = "select d from M12_Convertor2 d where d.SYSTEMID='2' order by d.ID desc";
        }
        return em.createQuery(sql, M12_Convertor2.class).setMaxResults(5).getResultList();
    }
    public List<M13_MainShaft> findAll_m13(String TF) {
        String sql = null;
        if(TF.equals("true")){
            sql = "select d from M13_MainShaft d where d.SYSTEMID='1' order by d.ID desc";
        }
        else{
            sql = "select d from M13_MainShaft d where d.SYSTEMID='2' order by d.ID desc";
        }
        return em.createQuery(sql, M13_MainShaft.class).setMaxResults(5).getResultList();
    }
    public List<M14_Motor1> findAll_m14(String TF) {
        String sql = null;
        if(TF.equals("true")){
            sql = "select d from M14_Motor1 d where d.SYSTEMID='1' order by d.ID desc";
        }
        else{
            sql = "select d from M14_Motor1 d where d.SYSTEMID='2' order by d.ID desc";
        }
        return em.createQuery(sql, M14_Motor1.class).setMaxResults(5).getResultList();
    }
    public List<M15_Motor2> findAll_m15(String TF) {
        String sql = null;
        if(TF.equals("true")){
            sql = "select d from M15_Motor2 d where d.SYSTEMID='1' order by d.ID desc";
        }
        else{
            sql = "select d from M15_Motor2 d where d.SYSTEMID='2' order by d.ID desc";
        }
        return em.createQuery(sql, M15_Motor2.class).setMaxResults(5).getResultList();
    }
    public List<M16_VsdM1Status> findAll_m16(String TF) {
        String sql = null;
        if(TF.equals("true")){
            sql = "select d from M16_VsdM1Status d where d.SYSTEMID='1' order by d.ID desc";
        }
        else{
            sql = "select d from M16_VsdM1Status d where d.SYSTEMID='2' order by d.ID desc";
        }
        return em.createQuery(sql, M16_VsdM1Status.class).setMaxResults(5).getResultList();
    }
    public List<M17_VsdM2Status> findAll_m17(String TF) {
        String sql = null;
        if(TF.equals("true")){
            sql = "select d from M17_VsdM2Status d where d.SYSTEMID='1' order by d.ID desc";
        }
        else{
            sql = "select d from M17_VsdM2Status d where d.SYSTEMID='2' order by d.ID desc";
        }
        return em.createQuery(sql, M17_VsdM2Status.class).setMaxResults(5).getResultList();
    }
    public List<M18_Cooling> findAll_m18(String TF) {
        String sql = null;
        if(TF.equals("true")){
            sql = "select d from M18_Cooling d where d.SYSTEMID='1' order by d.ID desc";
        }
        else{
            sql = "select d from M18_Cooling d where d.SYSTEMID='2' order by d.ID desc";
        }
        return em.createQuery(sql, M18_Cooling.class).setMaxResults(5).getResultList();
    }
    public List<M19_EngAndGen> findAll_m19(String TF) {
        String sql = null;
        if(TF.equals("true")){
            sql = "select d from M19_EngAndGen d where d.SYSTEMID='1' order by d.ID desc";
        }
        else{
            sql = "select d from M19_EngAndGen d where d.SYSTEMID='2' order by d.ID desc";
        }
        return em.createQuery(sql, M19_EngAndGen.class).setMaxResults(5).getResultList();
    }
    public List<M20_Exhaust> findAll_m20(String TF) {
        String sql = null;
        if(TF.equals("true")){
            sql = "select d from M20_Exhaust d where d.SYSTEMID='1' order by d.ID desc";
        }
        else{
            sql = "select d from M20_Exhaust d where d.SYSTEMID='2' order by d.ID desc";
        }
        return em.createQuery(sql, M20_Exhaust.class).setMaxResults(5).getResultList();
    }
    public List<M21_LubAndGear> findAll_m21(String TF) {
        String sql = null;
        if(TF.equals("true")){
            sql = "select d from M21_LubAndGear d where d.SYSTEMID='1' order by d.ID desc";
        }
        else{
            sql = "select d from M21_LubAndGear d where d.SYSTEMID='2' order by d.ID desc";
        }
        return em.createQuery(sql, M21_LubAndGear.class).setMaxResults(5).getResultList();
    }
    public List<M22_VsdM1> findAll_m22(String TF) {
        String sql = null;
        if(TF.equals("true")){
            sql = "select d from M22_VsdM1 d where d.SYSTEMID='1' order by d.ID desc";
        }
        else{
            sql = "select d from M22_VsdM1 d where d.SYSTEMID='2' order by d.ID desc";
        }
        return em.createQuery(sql, M22_VsdM1.class).setMaxResults(5).getResultList();
    }
    public List<M23_VsdM2> findAll_m23(String TF) {
        String sql = null;
        if(TF.equals("true")){
            sql = "select d from M23_VsdM2 d where d.SYSTEMID='1' order by d.ID desc";
        }
        else{
            sql = "select d from M23_VsdM2 d where d.SYSTEMID='2' order by d.ID desc";
        }
        return em.createQuery(sql, M23_VsdM2.class).setMaxResults(5).getResultList();
    }
    public List<M24_GenStatus> findAll_m24(String TF) {
        String sql = null;
        if(TF.equals("true")){
            sql = "select d from M24_GenStatus d where d.SYSTEMID='1' order by d.ID desc";
        }
        else{
            sql = "select d from M24_GenStatus d where d.SYSTEMID='2' order by d.ID desc";
        }
        return em.createQuery(sql, M24_GenStatus.class).setMaxResults(5).getResultList();
    }
    public List<M25_BusStatus> findAll_m25(String TF) {
        String sql = null;
        if(TF.equals("true")){
            sql = "select d from M25_BusStatus d where d.SYSTEMID='1' order by d.ID desc";
        }
        else{
            sql = "select d from M25_BusStatus d where d.SYSTEMID='2' order by d.ID desc";
        }
        return em.createQuery(sql, M25_BusStatus.class).setMaxResults(5).getResultList();
    }
    public List<M26_MpStatus> findAll_m26(String TF) {
        String sql = null;
        if(TF.equals("true")){
            sql = "select d from M26_MpStatus d where d.SYSTEMID='1' order by d.ID desc";
        }
        else{
            sql = "select d from M26_MpStatus d where d.SYSTEMID='2' order by d.ID desc";
        }
        return em.createQuery(sql, M26_MpStatus.class).setMaxResults(5).getResultList();
    }
    public List<M27_GeneratorBus> findAll_m27(String TF) {
        String sql = null;
        if(TF.equals("true")){
            sql = "select d from M27_GeneratorBus d where d.SYSTEMID='1' order by d.ID desc";
        }
        else{
            sql = "select d from M27_GeneratorBus d where d.SYSTEMID='2' order by d.ID desc";
        }
        return em.createQuery(sql, M27_GeneratorBus.class).setMaxResults(5).getResultList();
    }
    public List<M28_MpPower> findAll_m28(String TF) {
        String sql = null;
        if(TF.equals("true")){
            sql = "select d from M28_MpPower d where d.SYSTEMID='1' order by d.ID desc";
        }
        else{
            sql = "select d from M28_MpPower d where d.SYSTEMID='2' order by d.ID desc";
        }
        return em.createQuery(sql, M28_MpPower.class).setMaxResults(5).getResultList();
    }
    public List<M29_Common> findAll_m29(String TF) {
        String sql = null;
        if(TF.equals("true")){
            sql = "select d from M29_Common d where d.SYSTEMID='1' order by d.ID desc";
        }
        else{
            sql = "select d from M29_Common d where d.SYSTEMID='2' order by d.ID desc";
        }
        return em.createQuery(sql, M29_Common.class).setMaxResults(5).getResultList();
    }
    public List<M30_GenAlarm> findAll_m30(String TF) {
        String sql = null;
        if(TF.equals("true")){
            sql = "select d from M30_GenAlarm d where d.SYSTEMID='1' order by d.ID desc";
        }
        else{
            sql = "select d from M30_GenAlarm d where d.SYSTEMID='2' order by d.ID desc";
        }
        return em.createQuery(sql, M30_GenAlarm.class).setMaxResults(5).getResultList();
    }
    public List<M31_Blackout> findAll_m31(String TF) {
        String sql = null;
        if(TF.equals("true")){
            sql = "select d from M31_Blackout d where d.SYSTEMID='1' order by d.ID desc";
        }
        else{
            sql = "select d from M31_Blackout d where d.SYSTEMID='2' order by d.ID desc";
        }
        return em.createQuery(sql, M31_Blackout.class).setMaxResults(5).getResultList();
    }
    public List<M32_EmergencyStop> findAll_m32(String TF) {
        String sql = null;
        if(TF.equals("true")){
            sql = "select d from M32_EmergencyStop d where d.SYSTEMID='1' order by d.ID desc";
        }
        else{
            sql = "select d from M32_EmergencyStop d where d.SYSTEMID='2' order by d.ID desc";
        }
        return em.createQuery(sql, M32_EmergencyStop.class).setMaxResults(5).getResultList();
    }
    public List<M33_BusAlarm> findAll_m33(String TF) {
        return em.createQuery("select d from M33_BusAlarm d order by d.ID desc", M33_BusAlarm.class).setMaxResults(5).getResultList();
    }

}
