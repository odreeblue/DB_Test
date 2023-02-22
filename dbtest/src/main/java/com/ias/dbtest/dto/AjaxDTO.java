package com.ias.dbtest.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.tomcat.util.json.JSONParser;
import org.json.JSONArray;
import org.json.JSONObject;


import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
@Getter
@Setter
@ToString
@AllArgsConstructor
public class AjaxDTO {
//    String name;
//    int age;
    ArrayList<String> md_list = new ArrayList<>();
    public AjaxDTO(JSONObject itemJson){
        System.out.println("AjaxDTO 생성자 진입");
        // 첫번째 방법
        System.out.println(itemJson.toString());
        Iterator<String> str = itemJson.keys();
        while(str.hasNext()){
            md_list.add(str.next());
            //System.out.println(str.next());
        }
        // 두번째 방법
//        JSONArray keys = itemJson.names();
//        for(int i=0; i<keys.length();++i){
//            String key = keys.getString(i); // Here's your key
//            String value = itemJson.getString(key); // Here's your value
//            this.md_list.add(value);
//        }


        System.out.println("AjaxDTO 생성자 탈출");
    }

}