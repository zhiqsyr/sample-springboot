package net.iclassmate.sample.springboot.web.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author zhiqsyr
 * @since 2017/5/10
 */
@RestController
@RequestMapping("sample")
@Api("sample")
public class SampleController {

    @ApiOperation("Say Hello")
    @GetMapping("hello")
    public Object sample(@ApiParam(value = "somebody's name", required = true) @RequestParam("name") String name) {
        return String.format("Hello %s", name);
    }

}
