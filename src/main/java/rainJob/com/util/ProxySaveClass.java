package rainJob.com.util;

import java.io.*;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 对应生成
 */
public class ProxySaveClass {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String s = System.getProperty("user.dir") + "\\src\\main\\java\\rainJob\\com" + "\\entity";
        File files = new File(s);
        String[] list = files.list();
        for (int i = 0; i < list.length ; i++) {
            String className = list[i];
            System.out.println("className = " + className.substring(0,className.lastIndexOf(".")));
            Class clazz = Class.forName("rainJob.com.entity."+className.substring(0,className.lastIndexOf(".")));

            String tableName = clazz.getSimpleName();
            System.out.println("tableName = " + tableName);
            Field[] fields = clazz.getDeclaredFields();

            Map<String,String[]> isolationField =new HashMap<>();

            Map<String, String> map = new HashMap<>();

            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("package rainJob.com.controller.vo;\n");
            stringBuffer.append("\n");

            for (Field field : fields) {
                String typeName = field.getGenericType().getTypeName();
                map.put(field.getName(), typeName);
                if(typeName.contains("java.lang.")){
                    map.put(field.getName(), typeName.substring(typeName.lastIndexOf('.') + 1));
                }else{
                    int index = typeName.indexOf("<");
                    if( index!=-1 ){
                        String substring = typeName.substring(0, index);
                        int index1 = substring.lastIndexOf(".");
                        String substring1 = substring.substring(index1+1);
                        String s1 = typeName.substring(index);
                        int index2 = s1.lastIndexOf(".");
                        int index3 = s1.lastIndexOf(">");
                        String s2="";
                        if(index2 != -1 && index3 != -1){
                            String substring2 = s1.substring(index2+ 1, index3);
                            s2 = substring1 + "<"+substring2+"Vo"+">";
                            System.out.println("substring2 = " + substring2);
                            System.out.println("s2 = " + s2);
                        }
                        map.put(field.getName(),s2);
                    }else {
                        int index1 = typeName.lastIndexOf(".");
                        String substring1 = typeName.substring(index1+1);
                        System.err.println("substring1"+substring1);
                        map.put(field.getName(),substring1);
                    }
                }
                if (!field.getType().getTypeName().contains("java.lang.")) {
                    int index = typeName.indexOf("<");
                    if(index != -1){
                        String substring = typeName.substring(0, index);
                        stringBuffer.append("import\t" + substring + ";\n");
                    }else{
                        stringBuffer.append("import\t" + field.getType().getTypeName() + ";\n");
                    }

                }
            }
                stringBuffer.append("\n");
                stringBuffer.append("public class " + tableName + "Vo\t{");
                stringBuffer.append("\n");
                Set<String> keySet = map.keySet();
                Iterator<String> iterator = keySet.iterator();
                while (iterator.hasNext()) {
                    String next = iterator.next();
                    String value = map.get(next);
                    System.out.println("value = " + value);
                    stringBuffer.append("\tprivate\t" + value + "\t" +next +";\n");
                }
                Iterator<String> iterator1 = keySet.iterator();
                while (iterator1.hasNext()) {
                    stringBuffer.append("\n");
                    String next = iterator1.next();
                    String value = map.get(next);
                    stringBuffer=saveSetAndGet(stringBuffer, next, value);
                }
                stringBuffer.append("}");
                File file = new File(System.getProperty("user.dir") + "\\src\\main\\java\\rainJob\\com" + "\\controller\\vo\\" + tableName+"Vo" + ".java");

                ByteArrayInputStream inputStream = new ByteArrayInputStream(new String(stringBuffer).getBytes());
                OutputStream outputStream = new FileOutputStream(file);
                int count = 0;
                while ((count = inputStream.read()) != -1) {
                    outputStream.write(count);
                }
                outputStream.flush();
                inputStream.close();
                outputStream.close();
            }
        }
   private synchronized static StringBuffer saveSetAndGet(StringBuffer stringBuffer, String fieldName, String fieldType){

       stringBuffer.append("\n");
       String lowFirst = fieldName.substring(0, 1);
       String upperFirst = lowFirst.toUpperCase();
       String afterStr = fieldName.substring(1);
       String tempFieldName = upperFirst + afterStr;
       stringBuffer.append("\t public\t"+"void"+"\tset"+tempFieldName+"("+fieldType+"\t"+fieldName+")"+"{\n");
       stringBuffer.append("\t\tthis."+fieldName + "=" +fieldName+";\n");
       stringBuffer.append("\t}\n");

       stringBuffer.append("\t public\t"+fieldType+"\tget"+tempFieldName+"()"+"{\n");
       stringBuffer.append("\t\treturn\t"+fieldName+";\n");
       stringBuffer.append("\t}\n");
        return stringBuffer;
   }

}
