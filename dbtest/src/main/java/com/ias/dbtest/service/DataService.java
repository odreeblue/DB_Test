package com.ias.dbtest.service;

import com.ias.dbtest.domain.TempData;
import com.ias.dbtest.repository.DataRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class DataService {

    private final DataRepository dataRepository;

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
}
