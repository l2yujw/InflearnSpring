package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//@RequiredArgsConstructor //final 붙은 변수로 생성자를 만들어 줌
public class OrderServiceImpl implements OrderService {

/*
    //필드 주입 (사용하지 말자)
    @Autowired private MemberRepository memberRepository;
    @Autowired private DiscountPolicy discountPolicy;

    public void setMemberRepository(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public void setDiscountPolicy(DiscountPolicy discountPolicy) {
        this.discountPolicy = discountPolicy;
    }
*/

/*

    private MemberRepository memberRepository;
    private DiscountPolicy discountPolicy;

    //수정자 주입
    @Autowired
    public
    void setMemberRepository(MemberRepository memberRepository) {
        System.out.println("memberRepository = " + memberRepository);
        this.memberRepository = memberRepository;
    }

    @Autowired
    public void setDiscountPolicy(DiscountPolicy discountPolicy) {
        System.out.println("discountPolicy = " + discountPolicy);
        this.discountPolicy = discountPolicy;
    }
*/

//lombok
/*
    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;


//    @Autowired //생략 가능
    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
//        System.out.println("memberRepository = " + memberRepository + ", discountPolicy = " + discountPolicy);
    }
*/

/*
    //일반 메서드 주입
    private MemberRepository memberRepository;
    private DiscountPolicy discountPolicy;

    @Autowired
    public void init(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }
*/

/*
//@Autowired로 변수명 변경해서 매핑 해주는 방식인데 gradle로 컴파일 방식을 변경해도 인식이 안됌
//spring 3.2x 부터는 @primary나 @Qualifier를 사용해야 할거 같음
*/
    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;


    @Autowired //생략 가능
    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy rateDiscountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = rateDiscountPolicy;
//        System.out.println("memberRepository = " + memberRepository + ", discountPolicy = " + discountPolicy);
    }

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }

    //테스트 용도
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}
