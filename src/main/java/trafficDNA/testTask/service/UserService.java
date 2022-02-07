package trafficDNA.testTask.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class UserService {

    public Set<Map<String, Integer>> allUsers = new HashSet<>() {{
        add(new HashMap<>() {{put("user_id", 1); put("level_id", 1); put("result", 11);}});
        add(new HashMap<>() {{put("user_id", 1); put("level_id", 2); put("result", 17);}});
        add(new HashMap<>() {{put("user_id", 1); put("level_id", 3); put("result", 33);}});
        add(new HashMap<>() {{put("user_id", 2); put("level_id", 1); put("result", 21);}});
        add(new HashMap<>() {{put("user_id", 2); put("level_id", 2); put("result", 8);}});
        add(new HashMap<>() {{put("user_id", 2); put("level_id", 3); put("result", 31);}});
        add(new HashMap<>() {{put("user_id", 3); put("level_id", 1); put("result", 23);}});
        add(new HashMap<>() {{put("user_id", 3); put("level_id", 2); put("result", 19);}});
        add(new HashMap<>() {{put("user_id", 3); put("level_id", 3); put("result", 41);}});
    }};

    public List<Map<String, Integer>> getTopList(@PathVariable Integer request_id, String key) {
        return allUsers.stream()
                .filter(user -> user.get(key).equals(request_id))
                .sorted(Comparator.comparing(m -> m.get("result"),
                        Comparator.nullsLast(Comparator.reverseOrder())))
                .limit(20)
                .collect(Collectors.toList());
    }
}
