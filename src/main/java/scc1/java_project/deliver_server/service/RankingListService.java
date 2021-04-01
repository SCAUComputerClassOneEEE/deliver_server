package scc1.java_project.deliver_server.service;

import scc1.java_project.deliver_server.POJO.ConsumptionOfLastYear;
import scc1.java_project.deliver_server.POJO.NumberOfLastYear;

import java.util.List;
import java.util.Map;

public interface RankingListService {
    List<NumberOfLastYear> totalList();

    List<ConsumptionOfLastYear> consumeList();

    Map<String, Integer> mostStreets();
}
