package cn.gcsp.constrain.dto;


import cn.gcsp.constrain.validation.ValidProvinceCity;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@ValidProvinceCity
@Data
public class ProvinceCityDTO {
    @NotBlank(message = "province should not null")
    private String province;

    @NotBlank(message = "city should not null")
    private String city;

    public @NotBlank(message = "city should not null") String getCity() {
        return city;
    }

    public void setCity(@NotBlank(message = "city should not null") String city) {
        this.city = city;
    }

    public @NotBlank(message = "province should not null") String getProvince() {
        return province;
    }

    public void setProvince(@NotBlank(message = "province should not null") String province) {
        this.province = province;
    }
}