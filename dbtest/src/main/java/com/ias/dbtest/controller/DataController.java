package com.ias.dbtest.controller;

import com.ias.dbtest.dto.AjaxDTO;

import com.ias.dbtest.dto.DataDTO;
import com.ias.dbtest.service.DataService;
import lombok.RequiredArgsConstructor;
//import org.json.JSONObject;


import org.json.JSONObject;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.Arrays;

@Controller
@RequiredArgsConstructor
public class DataController {
     private final DataService data_service;

   @PostMapping("/data2")
   //public @ResponseBody List<M01_CoolingWater> data2(@RequestBody String jsonStr){
   public @ResponseBody DataDTO data2(@RequestBody String jsonStr){
        JSONObject jsonObject = new JSONObject(jsonStr);
        AjaxDTO ajaxDTO = new AjaxDTO(jsonObject);

        ArrayList<String[]> md_list = ajaxDTO.getMd_list();
        System.out.println("md_list: "+md_list);
        for(String[] md: md_list){
            System.out.println("md[0]: "+md[0]+" md[1]: "+md[1]);
            if (md[1].equals("true")){
                System.out.println(md[1]+"는 true이다.");
            }
            else{
                System.out.println(md[1]+"는 false이다.");
            }
        }

        DataDTO dataDTO = data_service.findAll(md_list);

        // m01데이터만 가져와보기
        //List<M01_CoolingWater> M01s = module_service.find_m01();
        //System.out.println("반환된 객체의 사이즈: "+M01s.size());

        //m01, m02 데이터 가져와보기
        //List<M01_CoolingWater> m01 = module_service.find_m01();
        //List<M02_Engine> m02 = module_service.find_m02();
        //DataDTO dataDTO = new DataDTO();
        //dataDTO.setM01(m01);
        //dataDTO.setM02(m02);

        return dataDTO;
   }
//    @GetMapping("/data")
    //@RequestMapping(value="/data", method=RequestMethod.POST)
 //   @PostMapping("/data")
//    public @ResponseBody AjaxDTO data(@RequestBody String jsonStr){
        //AjaxDTO ajaxDTO = new AjaxDTO(jsonObject);
//        JSONObject jsonObject = JSONObject.from

//        JSONObject jsonObject = new JSONObject(jsonStr);
//
//        AjaxDTO ajaxDTO = new AjaxDTO(jsonObject);
//
//        for(String li : ajaxDTO.getMd_list()){
//            System.out.println(li);
//        }
//        //System.out.println(jsonStr);
//
//        System.out.println("-------");
//
//        return ajaxDTO;
//}
    @GetMapping("/")
    public String initial_page(Model model){

        String[] module = {"Cooling Water", "Engine", "Cylinders","Exhaust Gas", "Fuel Oil",
                "Gearbox Oil", "Generator", "Lub.Oil","Cabinet C.Water1", "Cabinet C.Water2",
                "Convertor1","Convertor2","Main Shaft", "Motor1", "Motor2",
                "VSD M1 Status","VSD M2 Status","Cooling","Eng. and Gen.","Exhaust",
                "Lub. and Gear","VSD M1","VSD M2","Gen. Status","BUS Status",
                "MP Status","Generator Bus","MP Power","Common","Gen Alarm",
                "Blackout","Emergency Stop","Bus Alarm"};

        Arrays.asList(module);

        model.addAttribute("module_list",module);
        return "initialPage";
    }
}

