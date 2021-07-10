package com.atguigu.springcloud.config;

import cn.hutool.json.JSONUtil;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Stream;

/**
 * @author: hkp
 * @create: 2020/08/13/22:31
 * @Description: what is it !
 * @Param:
 */
public class Demo1 {
    public static void main(String[] args) {
        TreeSet<String> l1 = new TreeSet<>((s1, s2) -> s1.length() - s2.length());
        l1.add("12121");
        l1.add("22");
        for (String s : l1) {
            System.out.println(s);
        }
        System.out.println("-----------");
        Long c = l1.stream().filter((s) -> s.length() > 1).count();
        System.out.println(c);
        System.out.println("-------------------");

        Arrays.asList("aa", "ac", "ad").stream().map(String::toUpperCase).forEach(System.out::println);
        System.out.println("-------5454545-----");
        Stream<String> sorted = Arrays.asList("212", "133", "93").stream().sorted();
        sorted.forEach(System.out::println);
        System.out.println("---------------Lambda------------");
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("张三",23,878787));
        employees.add(new Employee("李四",18,44433));
        employees.add(new Employee("王五",55,99999));
        employees.add(new Employee("赵柳",55,45565));

        employees.stream().filter(e->e.getSalary()>50000).forEach(System.out::println);
        System.out.println("sort::res");

        employees.stream().map(Employee::getSalary).sorted().forEach(System.out::println);
        System.out.println("自定义排序规则");
        employees.stream().sorted((s1,s2)->{
            if(s1.getAge()==s2.getAge()){
                return   s1.getSalary()-s2.getSalary();
            }
            else{
                return  s2.getAge()-s1.getAge();
            }

        }).forEach(System.out::println);
        employees.stream().map(Employee::hashCode).forEach(System.out::println);
    }

}
