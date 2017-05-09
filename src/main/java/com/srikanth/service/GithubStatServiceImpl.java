package com.srikanth.service;


import com.srikanth.model.Stat;
import com.srikanth.repository.StatRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class GithubStatServiceImpl implements GithubStatService {

    @Autowired
    private StatRepository statRepository;

    @Override
    public void saveCommitNumber(Stat stat) {

        statRepository.save(stat);

    }
}
