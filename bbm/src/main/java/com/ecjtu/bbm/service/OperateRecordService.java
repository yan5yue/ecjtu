package com.ecjtu.bbm.service;

import com.ecjtu.bbm.orm.domain.OperateRecord;

import java.util.List;

/**
 * @description:
 * @author: xu_pf@suixingpay.com
 * @date: 2018/1/13
 */
public interface OperateRecordService {
    /**
     * 操作记录
     *
     * @param contentNo 内容编号
     * @return          OperateRecord
     */
    List<OperateRecord> findList(String contentNo);
}
