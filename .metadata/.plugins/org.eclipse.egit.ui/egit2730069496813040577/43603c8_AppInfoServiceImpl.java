package com.example.collegemanagement.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.collegemanagement.model.StudentAppInfo;
import com.example.collegemanagement.repository.AppInfoRepository;
import com.example.collegemanagement.service.AppInfoService;

@Service
public class AppInfoServiceImpl implements AppInfoService {
	
	@Autowired
	AppInfoRepository infoRepo;

	@Override
	public List<StudentAppInfo> getAllDetails() {
		return infoRepo.findAll();
	}

	@Override
	public StudentAppInfo getStudentDetail(Integer id) {
	Optional<StudentAppInfo> student = infoRepo.findByUser(id);
		
		if(student.isPresent())
			return student.get();
		else
		return null;
	}

	@Override
	public Boolean updateDetail(StudentAppInfo student) {
		Optional<StudentAppInfo> oldUser = infoRepo.findById(student.getId());
		if(oldUser.isPresent()) {
			StudentAppInfo old = oldUser.get();
			old.setCourse(student.getCourse());
			old.setUser(student.getUser());
			old.setPerTen(student.getPerTen());
			old.setPerTwelve(student.getPerTwelve());
			old.setJeeMarks(student.getJeeMarks());
			old.setAppComment(student.getAppComment());
			old.setAppStatus(student.getAppStatus());
			old.setUserName(student.getUserName());
			infoRepo.save(old);
			return true;
		}
		else
			return false;
	}

	@Override
	public Boolean saveDetail(StudentAppInfo student) {
		Optional<StudentAppInfo> newInfo = Optional.of(infoRepo.save(student));
		if(newInfo.isPresent())
			return true;
		else
			return false;
	}

}
