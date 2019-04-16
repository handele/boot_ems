package com.baizhi.hlp.service;

import com.baizhi.hlp.dao.EmsDAO;
import com.baizhi.hlp.entity.Ems;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class EmsServiceImpl implements EmsService{

    @Resource
    private EmsDAO emsDAO;

    @Override
    public List<Ems> queryAll() {
        return emsDAO.queryAll();
    }

    @Override
    public void updateEms(Ems ems) {
        emsDAO.updateEms(ems);
    }

    @Override
    public void insertEms(Ems ems) {
        ems.setId(UUID.randomUUID().toString());
        emsDAO.insertEms(ems);
    }

    @Override
    public void deleteEms(String id) {
        emsDAO.deleteEms(id);
    }

    @Override
    public Ems queryEms(String id) {
        return emsDAO.queryEms(id);
    }
}
