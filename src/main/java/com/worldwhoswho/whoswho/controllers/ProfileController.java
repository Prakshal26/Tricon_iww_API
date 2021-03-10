package com.worldwhoswho.whoswho.controllers;

import com.worldwhoswho.whoswho.model.Profile;
import com.worldwhoswho.whoswho.services.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProfileController  {

    ProfileService profileService;

    @Autowired
    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @GetMapping("/{id}")
    public Profile findProfileByXmlId(@PathVariable("id") String id) {

        return profileService.findByXmlId(id);
    }

    @GetMapping("/browse")
    public List<String> findByLetter(@RequestParam("letter") String letter) {


        //List<Profile> profileList = profileService.findByIndexedNameStartsWith(letter.toUpperCase());
        List<Profile> profileList = profileService.findByIndexedNameStartsWithOrderByIndexedName(letter.toUpperCase());

        List <String> indexName = new ArrayList<>();

        for (Profile profile : profileList) {
            indexName.add(profile.getIndexedName());
        }

        return indexName;
    }

}
