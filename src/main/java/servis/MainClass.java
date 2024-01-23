package servis;

import jdk.internal.foreign.SystemLookup;
import model.Book;
import model.enums.BookType;

public class MainClass {
    public static <MemberDitails> void main(String[] args) {
        Book javaInAction = new Book
                ("dfgf", "sd", "john doe", BookType.CRIME, null);

        //            .MemberDitailsBuilder(3L, "254231")
        //              .setMemberId(50L)
        //               .setAddress("vanak")
        //              .build();

//        BookDAO bookDAO = new BookDAO();
//        bookDAO.insert(javaInAction);
//        javaInAction.setMember(1L);
//        bookDAO.borrowBook(javaInAction);
//        bookDAO.returnBook(javaInAction);

//        System.out.println(bookDAO.GetListOfBorrowBookByMemberId(1l));

//        System.out.println(bookDAO.select(2L));

//        Member = new Member(1L,"fredric" , "gonzales" , 15 , new MemberDetails()
//                .setId(1L)
//                .setMemberId(1L)
//                .setPhoneNumber("09120896739").setAddress("tehran"), List.of(javaInAction));
//
//        MemberDAO memberDAO = new MemberDAO();
//        memberDAO.insert(member);
        //      SystemLookup LibraryAutomation = null;
        //       LibraryAutomation.getInstance().getAllInfoByPhoneNumber("09120896739");
        //     System.out.println(LibraryAutomation.getInstance().getMemberWhoBorrowBook("javaInAction"));
        //   LibraryAutomation.getInstance().borrowBook(javaInAction);

    }
}