package hellojpa;

import jakarta.persistence.*;

import java.util.List;

public class JpaMain {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
/*
            Member member = new Member();
            member.setId(1L);
            member.setName("HelloA");
            em.persist(member);
*/

/*
            Member findMember = em.find(Member.class, 1L);
            findMember.setName("HelloJPA");
            System.out.println("findMember = " + findMember.getId());
            System.out.println("findMember = " + findMember.getName());
*/

/*            List<Member> result = em.createQuery("select m from Member m", Member.class)
                    .setFirstResult(5)
                    .setMaxResults(8)
                    .getResultList();

            for (Member member : result) {
                System.out.println("member.name = " + member.getName());

            }
*/
/*            //비영속
            Member member = new Member();
            member.setId(101L);
            member.setName("HelloA");

            //영속
            System.out.println("=== BEFORE ===");
            em.persist(member);
            System.out.println("=== AFTER ===");

            Member findMember1 = em.find(Member.class, 101L);
            System.out.println("findMember.getId() = " + findMember1.getId());
            System.out.println("findMember.getName() = " + findMember1.getName());

            Member findMember2 = em.find(Member.class, 101L);
            System.out.println("result = " + (findMember1 == findMember2));*/

/*
            //영속
            Member member1 = new Member(150L, "A");
            Member member2 = new Member(160L, "B");

            em.persist(member1);
            em.persist(member2);

            System.out.println("====================");
*/
/*
            Member member = em.find(Member.class, 150L);
            member.setName("ZZZZZ");

            System.out.println("====================");
*/
/*
            Member member = new Member(200L, "member200");
            em.persist(member);

            em.flush();

            System.out.println("======================");
*/

/*
            //영속
            Member member = em.find(Member.class, 150L);
            member.setName("AAAAA");

            em.detach(member);

            System.out.println("====================");
*/
/*
            Member member = new Member();
            member.setId(2L);
            member.setUsername("BBB");
            member.setRoleType(RoleType.ADMIN);
*/
            Member member = new Member();
            member.setUsername("Cc");

            em.persist(member);

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }

        emf.close();
    }
}
