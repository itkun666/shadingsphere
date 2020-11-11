package com.example.demo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.domain.TOrderDto;
import com.example.demo.domain.TOrder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TorderDAO extends BaseMapper<TOrder> {
    List<TOrderDto> selectOrderAndItemByOrderId(TOrderDto tOrder);

    List<TOrderDto> selectOrderListPage(@Param("pageNo") Integer pageNo, @Param("pageSize") Integer pageSize, @Param("orderId") Long orderId);

    List<TOrderDto> selectOrderListPage();
}
