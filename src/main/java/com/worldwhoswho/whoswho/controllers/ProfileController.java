package com.worldwhoswho.whoswho.controllers;

import com.worldwhoswho.whoswho.model.CrossProfile;
import com.worldwhoswho.whoswho.model.Profile;
import com.worldwhoswho.whoswho.services.CrossProfileService;
import com.worldwhoswho.whoswho.services.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProfileController  {

    ProfileService profileService;
    CrossProfileService crossProfileService;

    @Autowired
    public ProfileController(ProfileService profileService, CrossProfileService crossProfileService) {
        this.profileService = profileService;
        this.crossProfileService = crossProfileService;
    }

    @GetMapping("/{id}")
    public Profile findProfileByXmlId(@PathVariable("id") String id) {

        return profileService.findByXmlId(id);
    }



    @GetMapping("/cross/{id}")
    public CrossProfile findCrossProfileByXmlId(@PathVariable("id") String id) {

        return crossProfileService.findByXmlId(id);
    }



    @GetMapping("/browse")
    public List<String> findByLetter(@RequestParam("letter") String letter) {


        List<Profile> profileList = profileService.findByIndexedNameStartsWith(letter.toUpperCase());

        List <String> indexName = new ArrayList<>();

        for (Profile profile : profileList) {
            indexName.add(profile.getIndexedName());
        }

        return indexName;
    }



}
