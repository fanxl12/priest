package com.little.g.user.mapper;

import com.little.g.user.model.OAuthUser;
import com.little.g.user.model.OAuthUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OAuthUserMapper {
    long countByExample(OAuthUserExample example);

    int deleteByExample(OAuthUserExample example);

    int insert(OAuthUser record);

    int insertSelective(OAuthUser record);

    List<OAuthUser> selectByExample(OAuthUserExample example);

    int updateByExampleSelective(@Param("record") OAuthUser record, @Param("example") OAuthUserExample example);

    int updateByExample(@Param("record") OAuthUser record, @Param("example") OAuthUserExample example);
}