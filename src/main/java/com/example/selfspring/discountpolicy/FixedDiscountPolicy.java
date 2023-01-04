package com.example.selfspring.discountpolicy;

import com.example.selfspring.member.Grade;
import com.example.selfspring.member.Member;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@RequiredArgsConstructor
public class FixedDiscountPolicy implements DisCountPolicy {

    private int discount = 1000;

    @Override
    public int disCount(int price, Optional<Member> member) {
        if(member.get().getGrade() == Grade.VIP) return price - discount;
        else return price;
    }
}
