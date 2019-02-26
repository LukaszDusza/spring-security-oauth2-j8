package oauth2.service;


import oauth2.model.UserInfo;
import oauth2.repository.UserDetailsRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class UserInfoService {

    private UserDetailsRepository userDetailsRepository;

    public UserInfoService(UserDetailsRepository userDetailsRepository) {
        this.userDetailsRepository = userDetailsRepository;
    }

    public UserInfo getUserInfoByUserName(String userName) {
        return userDetailsRepository.findByUserName(userName);
    }

    //todo - stworzyc metode serwisową findAll() - DONE
    public List<UserInfo> getAllActiveUserInfo() {
        return userDetailsRepository.findAll();
    }
}
