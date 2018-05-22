package com.lz.fastjson;

import com.alibaba.fastjson.JSON;

import java.math.BigDecimal;
import java.util.List;

public class FastjsonSample {
    private static class User {
        private String name;

        private int age;

        private BigDecimal salary;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public BigDecimal getSalary() {
            return salary;
        }

        public void setSalary(BigDecimal salary) {
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age='" + age + '\'' +
                    ", salary=" + salary +
                    '}';
        }
    }

    public static void main(String[] args) {
        User user = new User();
        user.setName("校长");
        user.setAge(45);
        user.setSalary(new BigDecimal("123456789.0123"));
        System.out.println(user);
        String jsonstr = JSON.toJSONString(user);
        System.out.println(jsonstr);
        User user1 = JSON.parseObject(jsonstr, User.class);
        System.out.println(user1);
        System.out.println(user == user1);
        jsonstr = "[" + jsonstr + "]";
        List<User> users = JSON.parseArray(jsonstr, User.class);
        System.out.println(users);
    }
}
