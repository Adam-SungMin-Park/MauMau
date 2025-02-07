package com.example.demo.service;

import com.example.demo.dto.MemberRequestDto;
import com.example.demo.entity.Member;
import com.example.demo.repository.MemberRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public ResponseEntity<?> signUp(MemberRequestDto memberRequestDto){
        Member member = Member.builder()
                .memberUserName(memberRequestDto.getMemberUserName())
                .memberEmail(memberRequestDto.getMemberEmail())
                .build();
        memberRepository.save(member);
    return new ResponseEntity<>("sign up completed", HttpStatus.CREATED);
    }
}
