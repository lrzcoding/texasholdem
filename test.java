//import java.util.Arrays;
//
//public class test {
//    public static void main(String[] args){
//        String black="2H 3D 5S 9C KD";
//        String[] blackArray=black.split("");
//        System.out.println(blackArray[13]);
//        int[] number=new int[5];
//        int i;
//        for(i=0;i<5;i++){
//            String c=blackArray[i*3];
//            switch (c) {
//                case "T":
//                    number[i] = 10;
//                    break;
//                case "J":
//                    number[i] = 11;
//                    break;
//                case "Q":
//                    number[i] = 12;
//                    break;
//                case "K":
//                    number[i] = 13;
//                    break;
//                case "A":
//                    number[i] = 14;
//                    break;
//                default:
//                    number[i] = Integer.valueOf(c);
//                    break;
//            }
//        }
//        Arrays.sort(number);
//        for(i=0;i<5;i++){
//            System.out.println(number[i]);
//        }
//
//    }
//}
import java.util.*;

public class test {

    public static void main(String[] args) {
        int[] strArr = {5,6,7,9,9};
//        Arrays.sort(strArr);
//        int[] renumber=new int[strArr.length];
//        for(int i=0;i<strArr.length;i++){
//            renumber[i]=strArr[strArr.length-i-1];
//        }
//        System.out.println("_____________");
//        for(int i=0;i<renumber.length;i++){
//            System.out.println(renumber[i]);
//            System.out.println("***********");
//        }
//
//        int[] re=arraySort(renumber);
//        System.out.println("_____________");
//        System.out.println(re.length);
//        System.out.println("_____________");
//        for(int i=0;i<re.length;i++){
//            System.out.println(re[i]);
//        }
        int[] aa = noOrRepeatNumber(strArr,1);
        for(int i=0;i<aa.length;i++){
            System.out.println("_____________");
            System.out.println(aa[i]);
        }

       // System.out.println(arraySort(strArr));
//        for(int i=0;i<re.length;i++){
//            System.out.println(re[i]);
//        }
//        String[] str = {"a","b","c","c","a","c"};
//        System.out.println(str);
//        System.out.println(arraySort(strArr));

    }

    public static int[] noOrRepeatNumber(int[] number,int flag) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < number.length; i++) {
            if (map.get(number[i]) != null) {
                map.put(number[i], map.get(number[i]) + 1);
            } else {
                map.put(number[i], 1);
            }
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>();
        list.addAll(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> arg0, Map.Entry<Integer, Integer> arg1) {
                return arg1.getValue().compareTo(arg0.getValue());
            }
        });
        System.out.println(list);
        int[] repeatnumber = new int[list.size()];
        int[] norepeatnumber = new int[list.size()];
        int i = 0;
        if (flag == 0) {
            for (Map.Entry<Integer, Integer> entry : list) {
                if (entry.getValue() > 1) {
                    repeatnumber[i] = entry.getKey();
                    i++;
                }
            }
            for(i=0;i<repeatnumber.length;i++){
                System.out.println("*****");
                System.out.println(repeatnumber[i]);
            }
        } else {
            for (Map.Entry<Integer, Integer> entry : list) {
                if (entry.getValue() == 1) {
                    norepeatnumber[i] = entry.getKey();
                    i++;
                }
            }
            for(i=0;i<norepeatnumber.length;i++){
                System.out.println("^^^^^");
                System.out.println(norepeatnumber[i]);
            }
        }
        HashSet<Integer> hashSet = new HashSet<Integer>();
        if(flag==0){
            for(i=0;i<repeatnumber.length;i++){
                hashSet.add(repeatnumber[i]);
            }
        }else{
            for(i=0;i<norepeatnumber.length;i++){
                hashSet.add(norepeatnumber[i]);
            }
        }
        System.out.println(hashSet);
        hashSet.remove(0);
        System.out.println(hashSet);
        int[] result = new int[hashSet.size()];
        i=0;
        Iterator<Integer> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            result[i]=iterator.next();
            i++;
        }
        int[] reResult=new int[result.length];
        for(i=0;i<result.length;i++){
            reResult[i]=result[result.length-i-1];
        }
        return reResult;
    }

    public static int[] arraySort(int[] number) {
        // 定义map，存放数组中的字符及出现次数
//        Map<String, Integer> map = new HashMap<String, Integer>();
//
//        // 遍历数组，将字符及出现次数存放map中
//        for (String str : arr) {
//            Integer count = map.get(str);
//            if (null != count) {
//                map.put(str, count + 1);
//            } else {
//                map.put(str, 1);
//            }
//        }
//
//        // 定义list，存放map中的entry
//        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>();
//        list.addAll(map.entrySet());
//
//        // 对list中的entry，按照value值进行降序排列
//        Collections.sort(list, new Comparator<Entry<String, Integer>>(){
//            public int compare(Entry<String, Integer> arg0, Entry<String, Integer> arg1) {
//                return arg1.getValue().compareTo(arg0.getValue());
//            }
//        });
//
//        // 定义StringBuffer，存放返回的字符串
//        StringBuffer retStr = new StringBuffer();
//        for (Entry<String, Integer> entry : list) {
//            retStr.append(entry.getKey()).append(",");
//        }
//        String aa = retStr.delete(retStr.length()-1, retStr.length()).toString();
//        System.out.println(aa);
//        System.out.println(aa.length());
//        String[] cc = aa.split(",");
//        for(int i=0;i<cc.length;i++){
//            System.out.println(cc[i]);
//        }
//        // 将字符串组装为需要的格式返回
//        return "{" + retStr.delete(retStr.length()-1, retStr.length()).toString() + "}";


        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<number.length;i++){
            if(map.get(number[i])!=null){
                map.put(number[i],map.get(number[i])+1);
            }else{
                map.put(number[i],1);
            }
        }
        System.out.println(map);
        List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>();
        list.addAll(map.entrySet());
        System.out.println(list.getClass().getName());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>(){
            public int compare(Map.Entry<Integer, Integer> arg0, Map.Entry<Integer, Integer> arg1) {
                return arg1.getValue().compareTo(arg0.getValue());
            }
        });
        System.out.println(list);
        int[] arrayresult=new int[list.size()];
        System.out.println(arrayresult.getClass().getName());
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : list) {
            System.out.println(entry.getKey().getClass().getName());
            arrayresult[i]=entry.getKey();
            i++;
        }
        for(i=0;i<arrayresult.length;i++){
            System.out.println(arrayresult[i]);
        }
        System.out.println(arrayresult.getClass().getName());
        return arrayresult;
    }

}
