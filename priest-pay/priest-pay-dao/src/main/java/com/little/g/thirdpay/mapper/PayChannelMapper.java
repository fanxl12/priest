package com.little.g.thirdpay.mapper;

import com.little.g.thirdpay.model.PayChannel;
import com.little.g.thirdpay.model.PayChannelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface PayChannelMapper {
    long countByExample(PayChannelExample example);

    int deleteByExample(PayChannelExample example);

    int deleteByPrimaryKey(Byte id);

    int insert(PayChannel record);

    int insertSelective(PayChannel record);

    List<PayChannel> selectByExampleWithRowbounds(PayChannelExample example, RowBounds rowBounds);

    List<PayChannel> selectByExample(PayChannelExample example);

    PayChannel selectByPrimaryKey(Byte id);

    int updateByExampleSelective(@Param("record") PayChannel record, @Param("example") PayChannelExample example);

    int updateByExample(@Param("record") PayChannel record, @Param("example") PayChannelExample example);

    int updateByPrimaryKeySelective(PayChannel record);

    int updateByPrimaryKey(PayChannel record);
}