package com.jk.controller;

import com.jk.bean.Region;
import com.jk.bean.Tree;
import com.jk.service.QueryService;
import com.jk.util.ResultPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author cuizhonghui
 */
@Controller
@RequestMapping("region")
public class RegionController {

    @Autowired
    QueryService queryService;

    @ResponseBody
    @RequestMapping("/getRegion")
    public List<Region> getRegion(Integer id){
        return queryService.getRegion(id);
    }

    @ResponseBody
    @RequestMapping("/getTreeAll")
    public List<Tree> getTreeAll(){
        return queryService.getTreeAll();
    }

    @RequestMapping("/toIndex")
    public String toIndex(){
        return "index";
    }

    @RequestMapping("/toRegionList")
    public String toRegionList(){
        return "regionList";
    }

    @ResponseBody
    @RequestMapping("queryRegionList")
    public ResultPage queryRegionList(Integer rows,Integer page){
        return queryService.queryList(rows,page);
    }
}
