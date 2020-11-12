package com.example;

import java.util.HashMap;

public class StringReplace {
    public static void main(String[] args) {
        final HashMap<String, Object> dto = new HashMap<>();
        dto.put("name", "%>我了   歌曲</x x\\哈 哈|&呵呵");
        System.out.println("修改前: " + dto);
        dto.put("name", String.valueOf(dto.get("name")).replaceAll("[%></\\\\ |&]", ""));
        System.out.println("修改后: " + dto);
    }
}
