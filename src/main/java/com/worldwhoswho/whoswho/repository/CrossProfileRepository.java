package com.worldwhoswho.whoswho.repository;

import com.worldwhoswho.whoswho.model.CrossProfile;
import com.worldwhoswho.whoswho.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CrossProfileRepository extends JpaRepository<CrossProfile,Long> {

    public CrossProfile findByXmlId(String xmlId);
}
