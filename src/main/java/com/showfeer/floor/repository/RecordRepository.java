package com.showfeer.floor.repository;

import com.showfeer.floor.pojo.Record;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordRepository extends JpaRepository<Record,Integer> {
}
