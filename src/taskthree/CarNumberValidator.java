package taskthree;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CarNumberValidator {
    private  Map<Integer, String> carNumberMap; //^[АВЕКМНОРСТУХ]{1}\d{3}[АВЕКМНОРСТУХ]{2}\d{2,3}$
    private static final Pattern pattern = Pattern.compile("^[АВЕКМНОРСТУХавекмнорстух]{1}\s*\\d{3}\s*[АВЕКМНОРСТУХавекмнорстух]{2}\s*\\d{2,3}$");

    public CarNumberValidator() {
        carNumberMap = new HashMap<>();
        carNumberMap.put(77, "Москва");
        carNumberMap.put(99, "Москва");
        carNumberMap.put(97, "Москва");
        carNumberMap.put(177, "Москва");
        carNumberMap.put(199, "Москва");
        carNumberMap.put(197, "Москва");
        carNumberMap.put(777, "Москва");
        carNumberMap.put(799, "Москва");
        carNumberMap.put(797, "Москва");
        carNumberMap.put(977, "Москва");
        carNumberMap.put(78, "Санкт-Петербург");
        carNumberMap.put(98, "Санкт-Петербург");
        carNumberMap.put(178, "Санкт-Петербург");
        carNumberMap.put(198, "Санкт-Петербург");
        carNumberMap.put(59, "Пермский край");
        carNumberMap.put(81, "Пермский край");
        carNumberMap.put(159, "Пермский край");
    }

    public boolean isValid(String number) {
        return pattern.matcher(number).matches();
    }

    private int getRegion(String number) {
        try {
            Integer integer = Integer.valueOf(number.substring(number.length()-3, number.length()));
            return integer;
        } catch (Exception e) {
            return Integer.valueOf(number.substring(number.length()-2, number.length()));
        }
    }

    public String getRegionName(String number) {
        return carNumberMap.getOrDefault(getRegion(number), "я не знаю такого региона");
    }


}
