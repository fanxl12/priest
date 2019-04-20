package com.little.g.thirdpay.service;

import com.little.g.common.enums.PayType;
import com.little.g.pay.BaseTest;
import com.little.g.pay.utils.TransactionNumUtil;
import com.little.g.thirdpay.api.ThirdpayApi;
import com.little.g.thirdpay.dto.PayCallbackInfo;
import com.little.g.thirdpay.dto.PrePayResult;
import com.little.g.thirdpay.params.PrepayParams;
import com.little.g.thirdpay.params.QueryPayParams;
import org.junit.Test;

import javax.annotation.Resource;

public class ThirdpayApiTest extends BaseTest {
    @Resource
    private ThirdpayApi thirdpayApi;

    @Test
    public void testAdd(){
        PrepayParams params=new PrepayParams();
        params.setMoney(20l);
        params.setComment("这是个测试");
        params.setTradeno("1xxx2xxx");
        PrePayResult prePayResult=thirdpayApi.prepay(PayType.ALIPAY,params);
        System.out.println(prePayResult);
    }
    @Test
    public void testQuery(){
        QueryPayParams q=new QueryPayParams();
        q.setPayOrderId("1xxx2xxx");
        PayCallbackInfo callbackInfo = thirdpayApi.queryPay(PayType.ALIPAY,q);
        System.out.println(callbackInfo);

    }

    @Test
    public void testWechatPay(){

        PrepayParams params=new PrepayParams();
        params.setMoney(20l);
        params.setComment("这是个测试");
        params.setTradeno(TransactionNumUtil.generateTranNum());
        PrePayResult prePayResult=thirdpayApi.prepay(PayType.WEXINPAY,params);
        System.out.println(prePayResult);

    }

    @Test
    public void testWechatQuery(){

        QueryPayParams q=new QueryPayParams();
        q.setPayOrderId("KIN19042021382027434CCC2C661001");
        PayCallbackInfo callbackInfo = thirdpayApi.queryPay(PayType.WEXINPAY,q);
        System.out.println(callbackInfo);

    }


}
