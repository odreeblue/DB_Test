package com.ias.dbtest.repository;

import com.ias.dbtest.domain.M01_CoolingWater;
import com.ias.dbtest.domain.TempData;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
@RequiredArgsConstructor
public class M01_Repository {
    private final EntityManager em;
    public List<M01_CoolingWater> findAll(){
        return em.createQuery("select m01 from M01_CoolingWater m01", M01_CoolingWater.class).getResultList();
    }
}
