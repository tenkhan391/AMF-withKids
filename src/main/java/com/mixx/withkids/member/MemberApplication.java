package com.mixx.withkids.member;

import com.mixx.withkids.member.domain.Category;
import com.mixx.withkids.member.domain.Member;
import com.mixx.withkids.member.domain.Repository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MemberApplication {

	static ApplicationContext applicationContext;
	public static ApplicationContext getApplicationContext(){
		return applicationContext;
	}

	public static void main(String[] args) {
		applicationContext = SpringApplication.run(MemberApplication.class, args);
		Repository repository = applicationContext.getBean(Repository.class);

		Member member = new Member();
		member.setPasswd("123456");
		member.setName("주헌정");
		member.setCategory(Category.키즈카페);
		
		repository.save(member);

		System.out.println(member.toString());
	}

}