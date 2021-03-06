package com.example.educationcenter.service;

import com.example.educationcenter.model.HomeWork;

import java.util.List;
import java.util.Optional;

public interface HomeWorkService {

    void save(HomeWork homeWork);

    Optional<HomeWork> findHomeWorkById(int id);

    List<HomeWork> findByCourse_id(int id);

}
