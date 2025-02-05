package dto;

import lombok.*;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MemberRequestDto {
    private Long memberId;
    private String memberEmail;
    private String memberUserName;
    private String password;

    public UsernamePasswordAuthenticationToken forAuthentication(){
        return new UsernamePasswordAuthenticationToken(memberUserName, password);
    }
}
