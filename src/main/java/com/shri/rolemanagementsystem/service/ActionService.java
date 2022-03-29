package com.shri.rolemanagementsystem.service;

import com.shri.rolemanagementsystem.entity.Action;
import com.shri.rolemanagementsystem.repository.ActionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActionService {

    @Autowired
    private ActionRepository actionRepository;

    public List<Action> listActions() {
        return actionRepository.findAll();
    }

    public Action createAction(Action action) {
        return actionRepository.save(action);
    }

}
