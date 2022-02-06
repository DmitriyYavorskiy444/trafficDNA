package trafficDNA.testTask.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import trafficDNA.testTask.exceptions.NotFoundException;
import trafficDNA.testTask.service.UserService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("user")
public class UserController {
//    private int counter = 4;

    @Autowired
    private UserService userService;

    @PostMapping("setinfo")
    public Map<String, Integer> create(@RequestBody Map<String, Integer> user) {
        //        user.put("user_id", String.valueOf(counter++));
        userService.allUsers.add(user);
        return user;
    }

    @GetMapping("/levelinfo/{level_id}")
    public List<Map<String, Integer>> topResultsByLevel(@PathVariable Integer level_id) {
        return userService.getTopList(level_id, "level_id");
    }

    @GetMapping("/userinfo/{user_id}")
    public List<Map<String, Integer>> topResultsByUser(@PathVariable Integer user_id) {
        return userService.getTopList(user_id, "user_id");
    }
//-----------------

    @GetMapping
    public List<Map<String, Integer>> getAllUsers() {
        return userService.allUsers;
    }


}
