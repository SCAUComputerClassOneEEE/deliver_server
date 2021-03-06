package scc1.java_project.deliver_server.POJO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PackOrderBillInsertInfo {
    // 发件人
    private String shipperName;
    private String shipperPhoneNumber;
    private String departure; // 省，市，详细地址
    // 收件人
    private String consiggeeName;
    private String consiggeePhoneNumber;
    private String address; // 省，市，详细地址
    private Timestamp commitArriveTime; // 约定到达时间，当前时间+一日或两日
    // package info
    private String packType; // 包裹类型
    private String detailMess; // 备注
    private Double packWeight; // 重量
    private Boolean dangerous; // 危险
    private Boolean inter; // 国际
    // bill info
    private String payType; // 立即付、月付。。。
    private Integer charge; // 计算得出的费用
    private Long customerId; // 支付的人的id
}
