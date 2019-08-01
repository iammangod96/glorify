package com.glorify.profile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.glorify.profile.entity.Profile;
import com.glorify.profile.service.ProfileService;

@CrossOrigin
@RestController
@RequestMapping("/profile")
public class ProfileController {
	
	@Autowired
	private ProfileService profileService;
	
	@GetMapping(value="/getprofile/{userId}")
	public Profile getProfileFromUserId(@PathVariable Long userId) {
		return profileService.getProfile(userId);
	}
	
	
	
}