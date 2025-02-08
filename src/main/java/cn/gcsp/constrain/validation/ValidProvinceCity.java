package cn.gcsp.constrain.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;

@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ProvinceCityValidator.class)
@Documented
public @interface ValidProvinceCity {
    String message() default "provence and city not meet";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}