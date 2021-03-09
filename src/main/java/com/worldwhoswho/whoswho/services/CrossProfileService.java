package com.worldwhoswho.whoswho.services;

import com.worldwhoswho.whoswho.model.CrossProfile;
import com.worldwhoswho.whoswho.model.Profile;

import java.util.List;

public interface CrossProfileService extends CrudService<CrossProfile,Long> {

    CrossProfile findByXmlId(String xmlId);
}
