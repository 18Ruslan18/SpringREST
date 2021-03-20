package com.company.transfer;

import com.company.models.Token;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TokenDto {
    private String value;
    public static TokenDto from(Token token){
        return new TokenDto(token.getValue());
    }
}
