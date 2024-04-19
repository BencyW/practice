package com.whx;

import com.alibaba.fastjson.JSON;
import com.whx.entity.User;
import com.whx.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.google.common.base.Joiner;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.math.BigDecimal;
import java.security.Security;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author whx
 * @Date 2022/9/1 3:34 下午
 * @Version 1.0
 */


@SpringBootTest(classes = SpringbootRedisApplication.class)
public class TestUserService {
    @Autowired
    private IUserService UserService;

    @Test
    public void testDelete(){
        UserService.delete(2);
    }

    @Test
    public void testFindById(){
        System.out.println(UserService.findById(1));
    }

    @Test
    public void testFindAll(){
        List<User> all = UserService.findAll();
        System.out.println("1:" + all);
        System.out.println("=============");
        List<User> all1 = UserService.findAll();
        System.out.println("2:" + all1);
    }
    @Test
    public void test(){
        StringBuilder str = new StringBuilder();
        String[] s = {"123", "-", "ABC"};
        for(int i = 0; i < 3; i++){
            str.append(s[i]);
        }
        System.out.println(str);
        double d = 0.1;
        BigDecimal bigDecimal = new BigDecimal(Double.toString(d));


    }

    @Test
    public void testI(){
        List<Integer> mapList = new ArrayList<>();
        mapList.add(1);
        mapList.add(3);
        mapList.add(10);
        mapList.add(5);
        for (Integer integer : mapList) {
            System.out.println(integer);
        }
        Collections.sort(mapList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        for (Integer integer : mapList) {
            System.out.println(integer);
        }
    }


    @Test
    public void Test(){
        int [] abc = {1,2};
        for(int i = 0; i < 10; i++){
            try {
                if(i % 2 == 1){
//                    System.out.println(i / 0);
                    System.out.println(abc[2]);
                }else {
                    System.out.println(i);
                }
            } catch (Exception e) {
                e.printStackTrace();
                continue;
            }
        }

    }

    @Test
    public void testt(){
     /*   3a72eec3641f41c5a0d61db94e67cf8b
        Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());
        byte[] data = Base64.decodeBase64(context);
        SecretKeySpec key = createKey(encodeKey);
        Cipher cipher = Cipher.getInstance(AES_ECB_PKCS_7_PADDING);
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] content = cipher.doFinal(data);*/
    }
    @Test
    public void testtt(){
        User user = new User();
        user.setName("whx");
        System.out.println(user);
        System.out.println(user.getAge());
        System.out.println(JSON.toJSONString(user));
        List<Map<String,String>> accountCodes = new ArrayList<>();
        Map<String,String> airLineCorpFfp = new HashMap<>(2);
        airLineCorpFfp.put("airLine", "123");
        airLineCorpFfp.put("corpFfp", "312");
        accountCodes.add(airLineCorpFfp);
        Map<String,String> aaa = new HashMap<>(2);
        aaa.put("airLine", "aaa");
        aaa.put("corpFfp", "bbb");
        accountCodes.add(aaa);
        System.out.println(JSON.toJSONString(accountCodes));
    }

    @Test
    public void testStringJoiner(Integer s){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        String result = "avc"+ Joiner.on(",").join(list);
        System.out.println(result);
    }


    
        //自然排序顺序：
    @Test
    public void naturalSort(){
        //第一种情况：Integer对象
        TreeMap<Integer,String> treeMapFirst = new TreeMap<Integer, String>();
        treeMapFirst.put(1,"jiaboyan");
        treeMapFirst.put(6,"jiaboyan");
        treeMapFirst.put(3,"jiaboyan");
        treeMapFirst.put(10,"jiaboyan");
        treeMapFirst.put(7,"jiaboyan");
        treeMapFirst.put(13,"jiaboyan");
        System.out.println(treeMapFirst.toString());

        //第二种情况:SortedTest对象
       /* TreeMap<SortedTest,String> treeMapSecond = new TreeMap<SortedTest, String>();
        treeMapSecond.put(new SortedTest(10),"jiaboyan");
        treeMapSecond.put(new SortedTest(1),"jiaboyan");
        treeMapSecond.put(new SortedTest(13),"jiaboyan");
        treeMapSecond.put(new SortedTest(4),"jiaboyan");
        treeMapSecond.put(new SortedTest(0),"jiaboyan");
        treeMapSecond.put(new SortedTest(9),"jiaboyan");
        System.out.println(treeMapSecond.toString());*/
    }

    @Test
    public void listTest(){
        String str = "超级经济舱";

        boolean status = str.contains("经济");

        if(status){
            System.out.println("包含");

        }else{
            System.out.println("不包含");
        }

    }
    @Test
    public void addAllTest(){
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
        //给list1赋值
        list1.add("测");
        list1.add("试");
        list1.add("一");
        list1.add("下");
        //给list2赋值
        list2.add("合");
        list2.add("并");
        list2.add("列");
        list2.add("表");
        //将list1.list2合并
        list1.addAll(list2);
        //循环输出list1 看看结果
        System.out.println(list1);
//        for (String s : list1) {
//            System.out.print(s);
//        }
    }
    @Test
    public void queueTest(){
        Queue<User> q = new LinkedList<>();
    }
    public static String trim(String str)
    {
        return (str == null ? "" : str.trim());
    }
    @Test
    public void inStringIgnoreCase()
    {
        String str = "王鸿鑫";
        String[] strs = new String[]{"王鸿鑫","whx"};
        if (str != null && strs != null)
        {
            for (String s : strs)
            {
                if (str.equalsIgnoreCase(trim(s)))
                {
                    System.out.println("yes");
                }
            }
        }
        System.out.println("no");
    }
    @Test
    public void difference() {
        List<String> first = new ArrayList<>();
        first.add("1");
        first.add("2");
        first.add("3");
        first.add("4");
        first.add("5");
        String result = first.stream().map(String::valueOf).collect(Collectors.joining(","));

        System.out.println(result);
    }
    @Test
    public void exam(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0;i < n; i++){
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        int count = 0;
        int mid = nums.length/2;
        for(int i =0; i< nums.length; i++){
            if(nums[i] == nums[mid]){
                count++;
            }
        }
        if(count > mid){
            System.out.println(count);
        }else{
            System.out.println("不存在此数字！");
        }

    }

    @Test
    public void ArrayToList(){
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        String[] strings = list.toArray(new String[list.size()]);
        System.out.println(strings);

    }


}



