package scc1.java_project.deliver_server.service.impl;

import org.springframework.stereotype.Repository;
import scc1.java_project.deliver_server.POJO.ConsumptionOfLastYear;
import scc1.java_project.deliver_server.POJO.NumberOfLastYear;
import scc1.java_project.deliver_server.service.RankingListService;

import java.util.List;
import java.util.Map;

@Repository
public class RankingListServiceImpl implements RankingListService {
    @Override
    public List<NumberOfLastYear> totalList() {
        return null;
    }

    @Override
    public List<ConsumptionOfLastYear> consumeList() {
        return null;
    }

    @Override
    public Map<String, Integer> mostStreets() {
        return null;
    }
}
