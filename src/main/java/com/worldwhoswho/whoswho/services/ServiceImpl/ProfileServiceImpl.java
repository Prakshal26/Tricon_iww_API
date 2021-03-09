package com.worldwhoswho.whoswho.services.ServiceImpl;

import com.worldwhoswho.whoswho.model.Profile;
import com.worldwhoswho.whoswho.repository.ProfileRepository;
import com.worldwhoswho.whoswho.services.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileServiceImpl implements ProfileService {

    ProfileRepository profileRepository;

    @Autowired
    public ProfileServiceImpl(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    @Override
    public List<Profile> findAll() {
        return null;
    }

    @Override
    public Profile save(Profile obj) {
        return null;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public Profile findByXmlId(String xmlId) {
        return profileRepository.findByXmlId(xmlId);
    }

    @Override
    public List<Profile> findByIndexedNameStartsWith(String letter) {
        return profileRepository.findByIndexedNameStartsWith(letter);
    }
}
