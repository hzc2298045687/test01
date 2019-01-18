package com.jk.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.bean.Region;
import com.jk.bean.Tree;
import com.jk.util.ResultPage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QueryServiceImpl implements QueryService {

    @Reference
    RegionService regionService;

    @Reference
    TreeService treeService;

    @Override
    public List<Region> getRegion(Integer id) {
        return regionService.getRegion(id);
    }

    @Override
    public List<Tree> getTreeAll() {
        List<Tree> treeAll = treeService.getTreeAll();
        return treeAll;
    }

    @Override
    public ResultPage queryList(Integer rows, Integer page) {
        return treeService.queryList(rows,page);
    }
}
