package com.ias.dbtest.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class ModuleData {
    @Id
    @GeneratedValue
    @Column
    public Long ID;
    public String UTC;
    public int SYSTEMID;
}
