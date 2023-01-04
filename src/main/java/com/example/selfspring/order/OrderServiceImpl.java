package com.example.selfspring.order;


import com.example.selfspring.discountpolicy.DisCountPolicy;
import com.example.selfspring.member.Member;
import com.example.selfspring.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService{

    private final MemberRepository memberRepository;
    private final DisCountPolicy disCountPolicy;


    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Optional<Member> member = memberRepository.finalById(memberId);
        int discountPrice = disCountPolicy.disCount(itemPrice, member);
        return new Order(memberId, itemName, itemPrice, discountPrice);

    }

}
