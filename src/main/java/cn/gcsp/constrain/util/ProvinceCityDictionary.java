package cn.gcsp.constrain.util;

import java.util.*;

public class ProvinceCityDictionary {
    private static final Map<String, List<String>> provinceCityMap = new HashMap<>();

    static {

        provinceCityMap.put("广东省", Arrays.asList("广州市", "深圳市", "珠海市", "佛山市"));
        provinceCityMap.put("浙江省", Arrays.asList("杭州市", "宁波市", "温州市"));

    }

    public static List<String> getCities(String province) {
        return provinceCityMap.get(province);
    }
}