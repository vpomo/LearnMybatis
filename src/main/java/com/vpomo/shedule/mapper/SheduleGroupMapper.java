package com.vpomo.shedule.mapper;

import com.vpomo.shedule.model.SheduleGroup;
import java.util.List;

public interface SheduleGroupMapper {

    int deleteByPrimaryKey(Integer id_group);

    int insert(SheduleGroup record);

    int insertSelective(SheduleGroup record);

    SheduleGroup selectByPrimaryKey(Integer id_group);

    int updateByPrimaryKeySelective(SheduleGroup record);

    int updateByPrimaryKey(SheduleGroup record);
}