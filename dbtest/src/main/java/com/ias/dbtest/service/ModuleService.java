package com.ias.dbtest.service;

import com.ias.dbtest.domain.M01_CoolingWater;
import com.ias.dbtest.repository.M01_Repository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ModuleService {
    private final M01_Repository m01_repository;

    public List<M01_CoolingWater> find_m01(){
        List<M01_CoolingWater> data = m01_repository.findAll();

        return data;
    }
}
