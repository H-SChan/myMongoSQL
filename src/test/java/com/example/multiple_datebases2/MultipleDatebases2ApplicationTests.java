package com.example.multiple_datebases2;

import com.example.multiple_datebases2.model.mongo.Log;
import com.example.multiple_datebases2.model.mysql.User;
import com.example.multiple_datebases2.repository.mongo.LogRepository;
import com.example.multiple_datebases2.repository.mysql.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class MultipleDatebases2ApplicationTests {

    @Autowired
    private LogRepository logRepository;

    @Autowired
    private UserRepository userRepository;

    @Commit
    @Test
    void 데이터_추가() {
        Random random = new Random();
        String[] name = {"김갑철", "최종희", "조수민", "이종유", "주민철", "주영하", "홍진철", "조만제", "김희애"};

        User user = new User(name[random.nextInt(9)], "full_of_bluffing");
        User savedUser = userRepository.save(user);
        Log log = new Log(user.getName() + " 유저 생성", "유저가 한명 생성됨");
        Log savedLog = logRepository.save(log);

        assertThat(savedUser.getName()).isEqualTo(user.getName());
        assertThat(savedLog.getTitle()).isEqualTo(log.getTitle());
    }

}
