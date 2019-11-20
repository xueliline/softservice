package com.commont.service;

import com.commont.Dao.LabelMapper;
import com.commont.entity.Label;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class testservice {
    @Autowired
    private LabelMapper labelMapper;

    public Label get(String id) {
        Label label = labelMapper.findbyid(id);
        return label;
    }

    public List<Label> getall() {
        List<Label> list = labelMapper.findall();
        return list;
    }

    public int insert(Label label) {
        int res = labelMapper.insert(label);
        return res;
    }

    public int update(Label label) {
       // Label label1 = labelMapper.findbyid(label.getId());
        int res=labelMapper.update(label);
        return res;
    }
}
