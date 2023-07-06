package com.judy.sessionclustering.controller;

import com.judy.sessionclustering.common.ApiResponse;
import com.judy.sessionclustering.common.SingleApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpSession;

@Slf4j
@RestController
public class SessionClusteringController {

    private static final String KEY = "id";

    @GetMapping("/test")
    public ApiResponse test(HttpSession session, @RequestParam String id) {
        log.info("id={}", session.getId());
        session.setAttribute(KEY, id);
        return new ApiResponse();
    }

    @GetMapping("/check")
    public ApiResponse check(HttpSession session) {
        String id = session.getAttribute(KEY).toString();
        return new SingleApiResponse(id);
    }

}
