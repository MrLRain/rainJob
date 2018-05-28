package rainJob.com.exercise;

import java.util.*;

public class ExerciseSort {


    public static void main(String[] args) throws Exception {
        List<Map<String, String>> mapList = new ArrayList<>();
        Map<String, String> aMap = new HashMap<>();
        aMap.put("aList", "abc");
        aMap.put("bList", "bbc");
        aMap.put("cList", "cbc");
        aMap.put("dList", "cbc");
        mapList.add(aMap);
        Map<String, String> bMap = new HashMap<>();
        bMap.put("aList", "ccbc");
        bMap.put("eList", "bbv");
        mapList.add(bMap);
        Map<String, String> cMap = new HashMap<>();
        cMap.put("aList", "c11cbc");
        cMap.put("fList", "bbv");
        mapList.add(cMap);
        Map<String, String> dMap = new HashMap<>();
        dMap.put("vList", "abcc");
        dMap.put("QList", "bbv");
        mapList.add(dMap);

        for (int i = 0; i < mapList.size(); i++) {
            Map<String, String> aMapSort = mapList.get(i);
            int countKey = 0;
            for (int j = i + 1; j <= mapList.size() - 1; j++) {
                Map<String, String> bMapSort = mapList.get(j);
                Iterator<String> iterator = bMapSort.keySet().iterator();
                List<Boolean> booleans = new ArrayList<>();
                while (iterator.hasNext()) {
                    String next = iterator.next();
                    boolean containsKey = aMapSort.containsKey(next);
                    booleans.add(containsKey);
                    if (containsKey) {
                        String aValue = aMapSort.get(next);
                        String bValue = bMapSort.get(next);
                        if (aValue.equals(bValue)) {
                            throw new Exception("键位已经被关联");
                        }
                        countKey=countKey+2;
                    }else{
                        countKey=1;
                    }
                }
                if (countKey%2==0) {
                    throw new Exception("任意两个数据模板间不可存在多组关联字段");
                }
            }
        }
        System.out.println("成功了");

    }
}
