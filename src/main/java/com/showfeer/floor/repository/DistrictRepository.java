package com.showfeer.floor.repository;

import com.showfeer.floor.pojo.District;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DistrictRepository extends JpaRepository<District,Integer> {

    List<District> findByPid(Integer pid);
}
