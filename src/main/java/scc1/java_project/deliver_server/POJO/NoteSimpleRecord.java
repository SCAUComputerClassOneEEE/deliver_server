package scc1.java_project.deliver_server.POJO;

import lombok.Data;

import java.sql.Timestamp;

/**
 * @Author: Sky
 * @Date: 2021/4/20 15:24
 */
@Data
public class NoteSimpleRecord {
    private Long orderId;
    private Integer carrierId;
    private String carrierType;
    private Timestamp time;
    private Integer transportTimesOfCarrier;
}



