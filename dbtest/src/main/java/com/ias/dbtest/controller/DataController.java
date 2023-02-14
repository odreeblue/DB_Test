package com.ias.dbtest.controller;

import com.ias.dbtest.domain.TempData;
import com.ias.dbtest.service.DataService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class DataController {
    private final DataService dataService;

    @GetMapping("/")
    public String data(Model model){
        List<TempData> data = dataService.findTempData();
        for(TempData temp :data){
            System.out.println("id: "+temp.getId());
        }
        model.addAttribute("data",data);
        return "dataList";
    }
}
