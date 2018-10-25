package exe;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Str2ArrOrMap {
    public static void main(String[] args) {
        //value可能为null，此时处理value为空串。
        String keyVal = "key1=val1#key2=val2#key3";
        Stream<String> stream = Arrays.stream(keyVal.split("#"));
        List<String[]> collect = stream.map(str -> str.split("="))
                .filter(str -> str.length <= 2)
                .map(string -> {
                            if (string.length == 1) {
                                string = new String[]{string[0], ""};
                            }
                            return string;
                        }

                )
                .peek(str -> System.out.println(str[0]+"="+str[1]))
                .collect(Collectors.toList());
//                .collect(Collectors.toMap(str -> str[0],val -> val[1]));


        Map<String, String> map = collect.stream().collect(Collectors.toMap(c -> c[0], c -> c[1]));
        System.out.println(map);
    }


}
