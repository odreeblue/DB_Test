package com.ias.dbtest.service;

import com.ias.dbtest.domain.M01_CoolingWater;
import com.ias.dbtest.domain.TempData;
import com.ias.dbtest.repository.DataRepository;
import com.ias.dbtest.repository.M01_Repository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class DataService {

    private final DataRepository dataRepository;
    private final M01_Repository m01_repository;

    public List<TempData> findTempData(){
        List<TempData> data = dataRepository.findAll();
        for(TempData temp :data){
            System.out.println("------DataService-------");
            System.out.println("id: "+temp.getId());
            System.out.println("id: "+temp.getTitle());
        }
        //return dataRepository.findAll();
        return data;
    }
    public List<M01_CoolingWater> findM01(){
        List<M01_CoolingWater> data = m01_repository.findAll();
//        for(M01_CoolingWater temp :data){
//            System.out.println("------DataService-------");
//            System.out.println("id: "+temp.getId());
//            System.out.println("id: "+temp.getTitle());
//        }
        //return dataRepository.findAll();
        return data;
    }
}
