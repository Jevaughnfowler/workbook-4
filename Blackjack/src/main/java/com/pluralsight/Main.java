package com.pluralsight;



public class Main {
    public static Deck d = new Deck();

    public static void main(String[] args) {
        Console console = new Console();

        System.out.println("***************\n" +
                "   Welcome   \n" +
                "***************\n");

        int player = 0;
        do {
            player = console.promptForInt("Enter number of players \n");
            if(player > 2){
                System.out.println("invalid input");  }
        }while(player != 2);

        console.promptForString("Please Enter your name \n");
        console.promptForString("Please Enter your name \n");
        player1();
        player2();


    }

    public static void player1(){

        d.shuffle();

        Hand h1 = new Hand();

        Card c1 = d.deal();

        c1.flip();

        display(c1);

        System.out.println(c1.getPointValue());

        Card c2 = d.deal();
        c2.flip();

        display(c2);
        System.out.println(c2.getPointValue());

        h1.deal(c1);
        h1.deal(c2);

        System.out.println();
        System.out.println(h1.getValue());

    }

    public static void player2(){
        d.shuffle();

        Hand h1 = new Hand();

        Card c1 = d.deal();

        c1.flip();

        display(c1);

        System.out.println(c1.getPointValue());

        Card c2 = d.deal();
        c2.flip();

        display(c2);
        System.out.println(c2.getPointValue());

        h1.deal(c1);
        h1.deal(c2);

        System.out.println();
        System.out.println(h1.getValue());

    }


    public static void display(Card c){
        if(c.getSuit().equalsIgnoreCase("Hearts") || c.getSuit().equalsIgnoreCase("Diamonds") ){
            System.out.println(ColorCodes.RED + c.getValue() + " " + c.getSuit() + ColorCodes.RESET );
        }
        else{
            System.out.println(c.getValue() + " " + c.getSuit());
        }

    }


}