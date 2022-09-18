package com.hnt;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.client.RestTemplate;

import com.hnt.entity.User;

@ExtendWith(MockitoExtension.class)
public class RestClientTest {

	@Mock
	RestTemplate restTemplate;
	
	@InjectMocks
	RestClient restClient;
	
	@Test
	void testMain() {
		//User user = getUserData();
		//when(restTemplate.postForObject(Mockito.anyString(),Mockito.anyInt(),Mockito.any())).thenReturn(user);
		RestClient.main(new String[] {});
	}
	
	private static User getUserData() {
		User user = new User();
		user.setId(1);
		user.setName("jayababu");
		user.setDob("02-05-1991");
		user.setAge(10);
		return user;
	}
}
