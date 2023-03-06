package com.ias.dbtest.repository;

import com.ias.dbtest.domain.M01_CoolingWater;
import com.ias.dbtest.domain.M02_Engine;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class M02_Repository {
    private final EntityManager em;
    public List<M02_Engine> findAll(){
        return em.createQuery("select m from M02_Engine m", M02_Engine.class).getResultList();
    }
}
