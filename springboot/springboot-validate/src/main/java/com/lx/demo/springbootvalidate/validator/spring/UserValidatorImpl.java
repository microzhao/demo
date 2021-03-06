package com.lx.demo.springbootvalidate.validator.spring;


import com.lx.demo.springbootvalidate.domain.User;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * 通过spring的方式校验属性
 * 不需要在bean里写任何注解,耦合读很低, 如果注解方式能力不够，不想写大量自定义注解，这个更靠谱
 * 注解写出来是大家用，这个是自己用，看取舍
 *
 * 参考: https://phoenixnap.com/kb/spring-boot-validation-for-rest-services
 */
@Component
public class UserValidatorImpl implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        User user = User.class.cast(target);

        if(StringUtils.isEmpty(user.getName())){
            System.out.println("Spring给卡住了, 你给了个空串儿!");
        }
    }
}
