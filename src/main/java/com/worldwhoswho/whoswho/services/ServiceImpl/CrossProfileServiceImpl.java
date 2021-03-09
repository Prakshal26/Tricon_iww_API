package com.worldwhoswho.whoswho.services.ServiceImpl;

import com.worldwhoswho.whoswho.model.CrossProfile;
import com.worldwhoswho.whoswho.model.Profile;
import com.worldwhoswho.whoswho.repository.CrossProfileRepository;
import com.worldwhoswho.whoswho.services.CrossProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrossProfileServiceImpl implements CrossProfileService {


    CrossProfileRepository crossProfileRepository;

    @Autowired
    public CrossProfileServiceImpl(CrossProfileRepository crossProfileRepository) {
        this.crossProfileRepository = crossProfileRepository;
    }

    @Override
    public CrossProfile findByXmlId(String xmlId) {
        return crossProfileRepository.findByXmlId(xmlId);
    }

    @Override
    public List<CrossProfile> findAll() {
        return null;
    }

    @Override
    public CrossProfile save(CrossProfile obj) {
        return null;
    }

    @Override
    public void deleteById(Long aLong) {

    }
}
