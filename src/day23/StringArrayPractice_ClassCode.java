package day23;

public class StringArrayPractice_ClassCode {

    public static void main(String[] args) {

        // we created array in short way just by opening up { }
        // we put them in different line since white space does not matter
        String[] shows = {"Orville", "Gifted", "Game of Throne", "Flash", "Arrow", "Super girl"};

        String myFavoriteShow = "Orville";
//        System.out.println("myFavoriteShow = " + myFavoriteShow);
//        System.out.println("my favorite show character count is : "  +  myFavoriteShow.length() );
//
//        System.out.println("myFavoriteShow =" + myFavoriteShow + " char count is :" + myFavoriteShow.length());
//
//
        int showsCount = shows.length;
//        System.out.println("shows Count = " + showsCount);


        //  System.out.print(" and it has character count : " + shows[x].length());
        for (int x = 0; x < showsCount; x++) {
            System.out.println("The show is " + shows[x] + " and it has character count of " + shows[x].length());
        }
        // OR
        for (String show : shows) {
            System.out.println("The show is " + show + " and it has character count of " + show.length());
        }
        //String currentShow =  shows[x] ;
        //System.out.println(  currentShow  + " has character count : " +  currentShow.length()  );

    }


}