package com.little.g.user.mapper;

import com.little.g.user.model.OAuthUser;
import com.little.g.user.model.OAuthUserExample;
import com.little.g.user.model.OAuthUserKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OAuthUserMapper {
    long countByExample(OAuthUserExample example);

    int deleteByExample(OAuthUserExample example);

    int deleteByPrimaryKey(OAuthUserKey key);

    int insert(OAuthUser record);

    int insertSelective(OAuthUser record);

    List<OAuthUser> selectByExample(OAuthUserExample example);

    OAuthUser selectByPrimaryKey(OAuthUserKey key);

    int updateByExampleSelective(@Param("record") OAuthUser record, @Param("example") OAuthUserExample example);

    int updateByExample(@Param("record") OAuthUser record, @Param("example") OAuthUserExample example);

    int updateByPrimaryKeySelective(OAuthUser record);

    int updateByPrimaryKey(OAuthUser record);
}