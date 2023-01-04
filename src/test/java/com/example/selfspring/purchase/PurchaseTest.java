package com.example.selfspring.purchase;


import com.example.selfspring.AutoAppConfig;
import com.example.selfspring.member.Grade;
import com.example.selfspring.member.Member;
import com.example.selfspring.member.MemberRepository;
import com.example.selfspring.order.Order;
import com.example.selfspring.order.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import static org.assertj.core.api.Assertions.assertThat;

@Component
public class PurchaseTest {


    @Test
    public void purchaseTest() {
        ApplicationContext ac =
                new AnnotationConfigApplicationContext(AutoAppConfig.class);
        //given
        Member member = new Member("memberA", Grade.VIP);

        //when

        //then
        assertThat(member.getMemberName()).isEqualTo("memberA");

    }

    @Test
    public void orderTest() {
        ApplicationContext ac =
                new AnnotationConfigApplicationContext(AutoAppConfig.class);
        MemberRepository memberRepository = ac.getBean(MemberRepository.class);

        Member member = new Member("memberA", Grade.VIP);

        memberRepository.save(member);

        OrderService bean = ac.getBean(OrderService.class);

        Order order = bean.createOrder(1L, "itemA", 1000);
        assertThat(order.getDiscountPrice()).isEqualTo(900);
    
    }




}
