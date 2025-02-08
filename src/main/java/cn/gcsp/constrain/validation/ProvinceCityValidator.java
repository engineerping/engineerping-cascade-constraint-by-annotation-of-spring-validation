package cn.gcsp.constrain.validation;


import cn.gcsp.constrain.dto.ProvinceCityDTO;
import cn.gcsp.constrain.util.ProvinceCityDictionary;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.List;

public class ProvinceCityValidator implements ConstraintValidator<ValidProvinceCity, ProvinceCityDTO> {

    @Override
    public void initialize(ValidProvinceCity constraintAnnotation) {
        // Do something
    }

    @Override
    public boolean isValid(ProvinceCityDTO dto, ConstraintValidatorContext context) {
        if (dto == null) {
            return true; // 其他注解（如 @NotNull）负责空值检查
        }
        String province = dto.getProvince();
        String city = dto.getCity();
        if (province == null || city == null) {
            return true; // 空值校验由 @NotBlank 等处理
        }
        List<String> validCities = ProvinceCityDictionary.getCities(province);
        return validCities != null && validCities.contains(city);
    }
}
