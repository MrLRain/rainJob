package rainJob.com.util;

import rainJob.com.controller.vo.UserVo;
import rainJob.com.util.enumCodes.CodeEnum;

import java.lang.reflect.Field;
import java.util.*;
import java.util.regex.Pattern;

public class TestMap {
    public static void main(String[] args) {
        /* *//*Map<String,Object> map = new HashMap<>();
        map.put("brandName","2017-05-27 11:32:21");
        map.put("createDate","2017-05-27");
        map.put("product","车窗");
        map.put("num","11");
        map.put("price","1.901");
         Pattern timePattern = Pattern.compile("\\d{4}[-]{1}\\d{2}[-]{1}\\d{2} \\d{2}:\\d{2}:\\d{2}");
         Pattern datePattern = Pattern.compile("\\d{4}[-]{1}\\d{2}[-]{1}\\d{2}");
         Pattern digitalPattern = Pattern.compile("^\\d*[.]{1}\\d*$");
         Pattern numPattern = Pattern.compile("^\\d*");
         Pattern stringPattern = Pattern.compile(".*");

        Set<String> strings = map.keySet();
        Iterator<String> iterator = strings.iterator();
        while(iterator.hasNext()){
            Object o = map.get(iterator.next());
            if(timePattern.matcher(o.toString()).matches()) {
                System.out.println("o = 时间 " + o);
            }else if(datePattern.matcher(o.toString()).matches()) {
                System.out.println("o = 日期 " + o);
            }else if(digitalPattern.matcher(o.toString()).matches()) {
                System.out.println("o = 浮点型 " + o);
            }else if(numPattern.matcher(o.toString()).matches()) {
                System.out.println("o = 整型 " + o);
            }else if(stringPattern.matcher(o.toString()).matches()) {
                System.out.println("o = 字符串 " + o);
            }
        }

        System.out.println("new Date() = " + new Date());*//*
//        boolean b = x + 2*y <1000&&x + 2 * y > 100;
        List<Integer> resultList = new ArrayList<>();
        for(int y=0;y<1000;y++){
            for(int i=0;i<(1000-2*y)&&i>(100-2*y);i++){
                if(11*i+4*y>10000&&11*i+4*y<100000){
                    resultList.add(y);
                }
            }
        }
        resultList.sort(new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println("resultList = " + resultList);
        Integer integer = resultList.get(0);
        System.out.println("integer = " + integer);*/
    //测试 pageUtils 工具类
        /*
        PageUtils<UserVo> pageUtils = new PageUtils<UserVo>(0, 5, 5l);
        PageUtils<UserVo> pageUtils1 = new PageUtils<UserVo>(1, 5, 5l);
        PageUtils<UserVo> pageUtils2 = new PageUtils<UserVo>(2, 7, 15l);
        PageUtils<UserVo> pageUtils3 = new PageUtils<UserVo>(3, 7, 15l);
        System.out.println("pageUtils = " + pageUtils);
        System.out.println("pageUtils1 = " + pageUtils1);
        System.out.println("pageUtils2 = " + pageUtils2);
       System.out.println("pageUtils3 = " + pageUtils3);
        */
        generatorEnum(CodeEnum.class);

    }
    public static void generatorEnum(Class clazz){
        if(clazz.isEnum()){
            Field[] declaredFields = clazz.getDeclaredFields();

            System.out.println("declaredFields = " + declaredFields[0]);
        }
    }
}
