package oauth2.controller;

import oauth2.model.UserInfo;
import oauth2.service.UserInfoService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {


	private UserInfoService userService;

	public UserController(UserInfoService userService) {
		this.userService = userService;
	}


	//todo - odkomentowac metode getUser

//	@GetMapping("/user")
//	public Object getAllUser(@RequestHeader HttpHeaders requestHeader) {
//
//		List<UserInfo> userInfos = userService.getAllActiveUserInfo();
//		if (userInfos == null || userInfos.isEmpty()) {
//			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
//		}
//		return userInfos;
//	}



}
