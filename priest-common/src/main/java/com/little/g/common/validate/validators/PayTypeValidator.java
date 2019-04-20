package com.little.g.common.validate.validators;

import com.little.g.common.validate.annatations.PayType;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PayTypeValidator implements ConstraintValidator<PayType, String> {
   public void initialize(PayType constraint) {
   }

   public boolean isValid(String obj, ConstraintValidatorContext context) {
      return com.little.g.common.enums.PayType.ALIPAY.equals(obj) ||  com.little.g.common.enums.PayType.WEXINPAY.equals(obj);
   }
}
