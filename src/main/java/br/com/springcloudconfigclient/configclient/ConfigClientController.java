package br.com.springcloudconfigclient.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config-client")
public class ConfigClientController {

    @Value("${user.username}")
    private String username;

    @Value("${user.role}")
    private String role;

    @GetMapping(value = "/username", produces = MediaType.TEXT_PLAIN_VALUE)
    public String getName() {
        return username;
    }

    @GetMapping(value = "/role", produces = MediaType.TEXT_PLAIN_VALUE)
    public String getRole() {
        return role;
    }
}
