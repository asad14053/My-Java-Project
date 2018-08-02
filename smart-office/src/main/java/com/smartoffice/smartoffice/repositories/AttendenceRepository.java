package com.smartoffice.smartoffice.repositories;


import com.smartoffice.smartoffice.models.Attendence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface AttendenceRepository extends JpaRepository<Attendence,Long> {
}
