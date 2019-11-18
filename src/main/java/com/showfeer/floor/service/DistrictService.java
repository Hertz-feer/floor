package com.showfeer.floor.service;

import com.showfeer.floor.pojo.District;

import java.util.List;

public interface DistrictService {

    District selectById(Integer id);

    List<District> selectByPid(Integer pid);
}
