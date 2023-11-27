package kr.easw.lesson06.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

// @RestController 어노테이션을 사용하여 이 클래스가 REST 컨트롤러임을 선언합니다.
@RestController
// @RequestMapping 어노테이션을 사용하여 이 클래스의 기반 엔드포인트를 /api/v1/data로 설정합니다.
@RequestMapping("/api/v1/user")
// final로 지정된 모든 필드를 파라미터로 가지는 생성자를 생성합니다.
@RequiredArgsConstructor
public class UserDataEndpoint {
    // 원래대로라면 리스트를 통해 JSON에서 사용할 수 있는 형태로 변환해야 하지만, 이번 실습에서는 건너뜁니다.
    private final List<String> userList = new ArrayList<>();
    @GetMapping("/list")
    public List<String> listUsers() {
        return userList;
    }

    // 원래대로라면 리스트를 통해 JSON에서 사용할 수 있는 형태로 변환해야 하지만, 이번 실습에서는 건너뜁니다.
    @PostMapping("/remove")
    public ResponseEntity<String> removeUser(String userId) {
        // 여기에 유저를 실제로 삭제하는 로직을 구현해야 합니다.
        // userId를 받아서 userList에서 해당 유저를 삭제하는 등의 로직이 필요합니다.
        boolean removed = userList.remove(userId);
        if (removed) {
            return ResponseEntity.ok("User removed successfully");
        } else {
            return ResponseEntity.badRequest().body("User not found");
        }
    }


}
