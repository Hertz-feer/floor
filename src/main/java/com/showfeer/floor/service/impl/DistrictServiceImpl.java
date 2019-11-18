package com.showfeer.floor.service.impl;

import com.showfeer.floor.pojo.District;
import com.showfeer.floor.repository.DistrictRepository;
import com.showfeer.floor.service.DistrictService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DistrictServiceImpl implements DistrictService {

    @Resource
    private DistrictRepository districtRepository;

    @Override
    public District selectById(Integer id) {
        return districtRepository.findById(id).get();
    }

    @Override
    public List<District> selectByPid(Integer pid) {
        return districtRepository.findByPid(pid);
    }
}
