package com.worldwhoswho.whoswho.services;

import com.worldwhoswho.whoswho.model.Profile;

import java.util.List;

public interface ProfileService extends CrudService<Profile, Long>{

    Profile findByXmlId(String xmlId);

    List<Profile> findByIndexedNameStartsWith(String letter);
}
