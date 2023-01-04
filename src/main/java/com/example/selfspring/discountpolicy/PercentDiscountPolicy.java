package com.example.selfspring.discountpolicy;

import com.example.selfspring.member.Grade;
import com.example.selfspring.member.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class PercentDiscountPolicy implements DisCountPolicy{

    private int percentage = 10;
    @Override
    public int disCount(int price, Optional<Member> member) {
        if(member.get().getGrade() == Grade.VIP) return price - (price * percentage/100) ;
        else return price;

    }
}
