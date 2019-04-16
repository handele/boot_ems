package com.baizhi.hlp.service;

import com.baizhi.hlp.entity.Ems;

import java.util.List;

public interface EmsService {

    //展示所有员工
    public List<Ems> queryAll();

    //修改员工信息
    public void updateEms(Ems ems);

    //添加员工信息
    public void insertEms(Ems ems);

    //删除员工信息
    public void deleteEms(String id);

    //根据员工id查询信息
    public Ems queryEms(String id);
}
