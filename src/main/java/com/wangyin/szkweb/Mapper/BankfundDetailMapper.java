package com.wangyin.szkweb.Mapper;

import com.wangyin.szkweb.Domain.BankfundDetail;
import com.wangyin.szkweb.Domain.BankfundDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BankfundDetailMapper {
    int countByExample(BankfundDetailExample example);

    int deleteByExample(BankfundDetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BankfundDetail record);

    int insertSelective(BankfundDetail record);

    List<BankfundDetail> selectByExample(BankfundDetailExample example);

    BankfundDetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BankfundDetail record, @Param("example") BankfundDetailExample example);

    int updateByExample(@Param("record") BankfundDetail record, @Param("example") BankfundDetailExample example);

    int updateByPrimaryKeySelective(BankfundDetail record);

    int updateByPrimaryKey(BankfundDetail record);
}