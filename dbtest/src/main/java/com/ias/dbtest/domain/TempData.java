package com.ias.dbtest.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Date;
import java.sql.Timestamp;


@Entity
@Getter @Setter
@ToString
@Table(name="NOTICE")
public class TempData {
    @Id
    @GeneratedValue
    @Column
    private Long id;

    private String title;
    private String writer_id;
    private String content;
    private Timestamp regdate;
    private Long hit;
    private String files;

}
