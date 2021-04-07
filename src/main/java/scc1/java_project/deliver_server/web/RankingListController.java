package scc1.java_project.deliver_server.web;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import scc1.java_project.deliver_server.POJO.ConsumptionOfLastYear;
import scc1.java_project.deliver_server.POJO.NumberOfLastYear;
import scc1.java_project.deliver_server.POJO.StreetStatistics;
import scc1.java_project.deliver_server.dao.UserMapper;
import scc1.java_project.deliver_server.service.RankingListService;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

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
    public List<NumberOfLastYear> totalList(@Param("offset") int offset, @Param("length") int length) {
        return rankingListService.getTopNumberOfLastYear(new RowBounds(offset, length));
    }

    /**
     * 去年消费榜
     */
    @RequestMapping(value = {"/consumeList"}, method = {RequestMethod.GET})
    public List<ConsumptionOfLastYear> consumeList(@Param("offset") int offset, @Param("length") int length) {
        return rankingListService.consumeList(new RowBounds(offset, length));
    }

}
