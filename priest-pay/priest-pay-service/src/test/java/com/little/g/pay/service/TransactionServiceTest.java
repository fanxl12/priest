package com.little.g.pay.service;

import com.little.g.pay.BaseTest;
import com.little.g.pay.api.TransactionService;
import com.little.g.pay.dto.NormalUserAccount;
import com.little.g.pay.dto.TransactionRecordDTO;
import com.little.g.pay.enums.BusinessType;
import com.little.g.pay.enums.FixAccount;
import com.little.g.pay.utils.TransactionNumUtil;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lengligang on 2019/4/15.
 */
public class TransactionServiceTest extends BaseTest {

    @Resource
    private TransactionService transactionService;

    @Test
    public void testAdd(){
        List<TransactionRecordDTO> list = transactionService.transfer(FixAccount.LITTLE_G.getAccount(),new NormalUserAccount(10007L),1000l, TransactionNumUtil.generateChageNum(), BusinessType.RECHARGE,"this is a test");
        System.out.print(list);
    }
}
