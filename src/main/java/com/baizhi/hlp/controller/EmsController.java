package com.baizhi.hlp.controller;

import com.baizhi.hlp.entity.Ems;
import com.baizhi.hlp.service.EmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("ems")
@Controller
public class EmsController {

    @Autowired
    private EmsService emsService;


    /**
     * 查询所有员工信息
     * */
    @RequestMapping("queryAll")
    public String queryAll(Model model){
        List<Ems> ems = emsService.queryAll();
        model.addAttribute("ems",ems);
        return "emplist";
    }

    /**
     * 根据id查询员工
     * */
    @RequestMapping("updateEms")
    public String updateEms(String id,Model model){
        Ems ems = emsService.queryEms(id);
        model.addAttribute("emsId",ems);

        return "updateEmp";
    }

    /**
     *  修改员工信息
     * */
    @RequestMapping("update")
    public String update(Ems ems){
        System.out.println(ems);
        emsService.updateEms(ems);
        return "redirect:/ems/queryAll";
    }

    /**
     * 添加用户信息
     * */
    @RequestMapping("insertEms")
    public String insertEms(Ems ems){
        emsService.insertEms(ems);
        return "redirect:/ems/queryAll";
    }

    /**
     * 删除用户
     * */
    @RequestMapping("deleteEms")
    public String deleteEms(String id){
        emsService.deleteEms(id);
        return "redirect:/ems/queryAll";
    }

}
