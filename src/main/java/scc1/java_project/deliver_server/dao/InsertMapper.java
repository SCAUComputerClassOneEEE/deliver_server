package scc1.java_project.deliver_server.dao;

import scc1.java_project.deliver_server.POJO.*;
import scc1.java_project.deliver_server.dbEntity.*;
import scc1.java_project.deliver_server.dbEntity.Package;

public interface InsertMapper {
    /**
     * 插入包裹
     * （package_id
     * package_type
     * package_weight
     * is_dangerous
     * is_international
     * detail_message）
     */
    long insertPackage(Package packaged);

    /**
     * 插入订单
     * （order_id
     * package_id
     * send_name
     * send_phone_number
     * send_detail_address
     * receive_name
     * receive_phone_number
     * receive_detail_address
     * order_create_time
     * commit_arrive_time
     * actual_arrive_time
     * order_status
     * is_returned）
     */
    long insertOrder(Order order);

    /**
     * 插入账单
     * (order_id
     * customer_id
     * charge
     * batch_number
     * pay_type
     * is_paid)
     */
    void insertBill(Bill bill);

    /**
     * 插入物流信息
     * (transport_id
     * order_id
     * carrier_id
     * carrier_type
     * transport_times_of_carrier
     * input_time
     * output_time
     * next_carrier_id
     * next_carrier_type
     * status
     * detail_massage)
     */
    int insertTransport(Transport transport);

    /**
     * 插入出事载体
     * (carrier_id
     * carrier_type
     * damage_record_time)
     */
    int insertDamageRecord(DamageRecord damageRecord);

}
