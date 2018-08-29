package com.jenkins.gitauto.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <dl>
 * <dd>描述: ~节点业务逻辑实现</dd>
 * <dd>创建时间：  11:01 2018/8/29</dd>
 * <dd>创建人： guodong</dd>
 * <dt>版本历史: </dt>
 * <pre>
 * Date         Author      Version     Description
 * ------------------------------------------------------------------
 * 2018/8/29      guodong       1.0        1.0 Version
 * </pre>
 * </dl>
 */
@RestController
public class TestGitController {

    @GetMapping("/getGitHello")
    public String getGitHello(){
        return "git hello world";
    }
}
