package service;

import dto.MemberRequestDto;
import entity.Member;
import repository.MemberRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


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
