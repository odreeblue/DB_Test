package com.ias.dbtest.repository;


import com.ias.dbtest.domain.TempData;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class DataRepository {
    private final EntityManager em;
    public List<TempData> findAll() {
        return em.createQuery("select d from TempData d", TempData.class).getResultList();
    }
}
