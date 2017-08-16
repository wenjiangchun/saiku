package org.saiku.web.controller;

import org.saiku.service.PlatformUtilsService;
import org.saiku.service.util.dto.Plugin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/saiku")
public class InfoController {

    @Autowired
    private PlatformUtilsService platformService;

    @RequestMapping("/getPlugins")
    public List<Plugin> getAvailablePlugins() {
        return platformService.getAvailablePlugins();
    }
}
