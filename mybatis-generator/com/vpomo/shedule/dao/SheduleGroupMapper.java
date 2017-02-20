package com.vpomo.shedule.dao;

import com.vpomo.shedule.model.SheduleGroup;
import com.vpomo.shedule.model.SheduleGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SheduleGroupMapper {
    int countByExample(SheduleGroupExample example);

    int deleteByExample(SheduleGroupExample example);

    int deleteByPrimaryKey(Integer id_group);

    int insert(SheduleGroup record);

    int insertSelective(SheduleGroup record);

    List<SheduleGroup> selectByExample(SheduleGroupExample example);

    SheduleGroup selectByPrimaryKey(Integer id_group);

    int updateByExampleSelective(@Param("record") SheduleGroup record, @Param("example") SheduleGroupExample example);

    int updateByExample(@Param("record") SheduleGroup record, @Param("example") SheduleGroupExample example);

    int updateByPrimaryKeySelective(SheduleGroup record);

    int updateByPrimaryKey(SheduleGroup record);
}