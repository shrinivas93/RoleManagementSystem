package com.shri.rolemanagementsystem.controller;

import com.shri.rolemanagementsystem.entity.Action;
import com.shri.rolemanagementsystem.service.ActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/actions")
@RestController
public class ActionController {

    @Autowired
    private ActionService actionService;

    @GetMapping
    public List<Action> listActions() {
        return actionService.listActions();
    }

    @PostMapping
    public Action createAction(@RequestBody Action action) {
        return actionService.createAction(action);
    }

}
