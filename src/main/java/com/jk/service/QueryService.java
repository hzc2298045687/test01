package com.jk.service;

import com.jk.bean.Region;
import com.jk.bean.Tree;
import com.jk.util.ResultPage;

import java.util.List;

public interface QueryService {

    List<Region> getRegion(Integer id);

    List<Tree> getTreeAll();

    ResultPage queryList(Integer rows, Integer page);
}
