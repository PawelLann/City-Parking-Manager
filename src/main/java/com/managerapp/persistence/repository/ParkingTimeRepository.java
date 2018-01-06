package com.managerapp.persistence.repository;

import com.managerapp.persistence.entity.ParkingTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by pawel.langwerski@coi.gov.pl on 06.01.18.
 */
@Repository
public interface ParkingTimeRepository extends JpaRepository<ParkingTime,Long>{
}
