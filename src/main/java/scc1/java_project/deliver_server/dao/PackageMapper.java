package scc1.java_project.deliver_server.dao;

import org.apache.ibatis.session.RowBounds;
import scc1.java_project.deliver_server.POJO.SimpleOrderInfoBar;

import java.util.List;

public interface PackageMapper {
    List<SimpleOrderInfoBar> getSimpleOrderInfoBars(int customerId, RowBounds rowBounds);
}
