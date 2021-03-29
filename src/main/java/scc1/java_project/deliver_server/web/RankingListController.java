package scc1.java_project.deliver_server.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import scc1.java_project.deliver_server.service.RankingListService;

import javax.annotation.Resource;

/**
 * 排行榜
 */
@RestController
@RequestMapping({"/rankingList"})
public class RankingListController {
    @Resource
    private RankingListService rankingListService;

    /**
     * 去年寄件总数榜
     */
    @RequestMapping(value = {"/totalList"}, method = {RequestMethod.GET})
    public Object totalList() {return null;}

    /**
     * 去年消费榜
     */
    @RequestMapping(value = {"/consumeList"}, method = {RequestMethod.GET})
    public Object consumeList() {return null;}

    /**
     * 客户最多的街道
     */
    @RequestMapping(value = {"/mostStreets"}, method = {RequestMethod.GET})
    public Object mostStreets() {return null;}
}
