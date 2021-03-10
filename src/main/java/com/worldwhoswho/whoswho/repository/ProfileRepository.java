package com.worldwhoswho.whoswho.repository;

import com.worldwhoswho.whoswho.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long> {

    public List<Profile> findByIndexedNameStartsWith(String letter);

    Profile findByXmlId(String xmlId);
    public List<Profile> findByIndexedNameStartsWithOrderByIndexedName(String letter);
}
