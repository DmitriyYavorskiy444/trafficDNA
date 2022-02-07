package trafficDNA.testTask.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import trafficDNA.testTask.service.UserService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping()
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/levelinfo/{level_id}")
    public List<Map<String, Integer>> topResultsByLevel(@PathVariable Integer level_id) {
        return userService.getTopList(level_id, "level_id");
    }

    @GetMapping("/userinfo/{user_id}")
    public List<Map<String, Integer>> topResultsByUser(@PathVariable Integer user_id) {
        return userService.getTopList(user_id, "user_id");
    }

    @PutMapping("/setinfo")
    public Map<String, Integer> setInfo(@RequestBody Map<String, Integer> user) {
        userService.allUsers.removeIf(x -> x.get("user_id").equals(user.get("user_id"))
                && x.get("level_id").equals(user.get("level_id")));
        userService.allUsers.add(user);
        return user;
    }
}
