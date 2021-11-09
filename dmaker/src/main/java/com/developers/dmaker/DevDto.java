package com.developers.dmaker;

import lombok.*;
import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

@Setter
@Getter
@Builder //디자인패턴 (막상구현하려면 상당히 까다로움)
@ToString //개인정보담을때 사용하면 에러메시지 같은데 원치않은 개인정보 찍힐수있음
@NoArgsConstructor //아무 아규먼트가없는 기본생성자 생성
@AllArgsConstructor //모든 아규먼트생성자 생성
@RequiredArgsConstructor // 필수적인 아규먼트생성자 생성
@Data // 이거 하나있으면 위에거 대부분이 필요없어짐(실무에선 잘사용하지않음)
@Slf4j // 간편하게 logger를 쓸수있음
//@UtilityClass
public class DevDto {
    //우클릭 generate setter/getter;
    @NonNull
    String name;
    @NonNull
    Integer age; //shift F6누르면 같은이름 변경가능
    LocalDateTime startAt;

    public void printLog(){
        log.info(getName());
    }
}
