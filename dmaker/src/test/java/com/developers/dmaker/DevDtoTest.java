package com.developers.dmaker;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class DevDtoTest {
    @Test
    void test(){
        DevDto devdto = new DevDto("snow",25);
        //builder 사용할경우
//        DevDto devDto = DevDto.builder()
//                        .name("snow")
//                        .age(22)
//                        .startAt(LocalDateTime.now())
//                        .build();

//        System.out.println(devDto);


        devdto.setName("snow");
        devdto.setAge(25);
        devdto.setStartAt(LocalDateTime.now());
        System.out.println(devdto.toString());
        devdto.printLog();
    }

}