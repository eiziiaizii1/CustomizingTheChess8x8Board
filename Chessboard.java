package hw2;

import java.util.Scanner;

/**
 * @author Aziz Ã–nder 22050141021
 */
public class HW2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner inCh = new Scanner(System.in);

        StringBuffer rank1 = new StringBuffer("");
        StringBuffer rank2 = new StringBuffer("");
        StringBuffer rank3 = new StringBuffer("");
        StringBuffer rank4 = new StringBuffer("");
        StringBuffer rank5 = new StringBuffer("");
        StringBuffer rank6 = new StringBuffer("");
        StringBuffer rank7 = new StringBuffer("");
        StringBuffer rank8 = new StringBuffer("");
        
        int userInput;
        char userInputCh, firstCh = 0, secondCh = 0;
        String userInputStr;
        do {
            printMenu();
            do {
                System.out.print("Choose an option from menu: ");
                userInput = in.nextInt();
                if (userInput < 1 || userInput > 7) {
                    System.out.println("Not valid input!");
                }
            } while (userInput < 1 || userInput > 7);

            switch(userInput){
                case 1: allWhite(rank1, rank2, rank3, rank4, rank5, rank6, rank7, rank8); break;
                case 2: allBlack(rank1, rank2, rank3, rank4, rank5, rank6, rank7, rank8); break;
                case 3: System.out.println("Enter 1 or 0:");
                    userInputCh = inCh.nextLine().charAt(0);
                    changeDiagonals(rank1, rank2, rank3, rank4, rank5, rank6, rank7, rank8, userInputCh); break;
                case 4:System.out.println("Enter a column and row (a1,b3,d7 etc.):"); 
                    userInputStr = inCh.nextLine();
                    firstCh = userInputStr.charAt(0);
                    secondCh = userInputStr.charAt(1);
                    changeSquare(firstCh, secondCh, rank1, rank2, rank3, rank4, rank5, rank6, rank7, rank8); break;
                case 5: convertIntoProperChessBoard(rank1, rank2, rank3, rank4, rank5, rank6, rank7, rank8); break;
                case 6: drawVirtualCB(rank1, rank2, rank3, rank4, rank5, rank6, rank7, rank8);
                    deleteAllRanksSpaces(rank1, rank2, rank3, rank4, rank5, rank6, rank7, rank8);
            }            
        } while (userInput != 7);

    }

    public static void printMenu() {
        System.out.printf("%22s", "MENU");
        System.out.println("\n----------------------------------------"
                + "\n1- Initialize the board to all white"
                + "\n2- Initialize the board to all black"
                + "\n3- Change the minor and major diagonal to white or black (Enter 0 for white, 1 for black):"
                + "\n4- Enter a rank and file together and change the specific squares condition from one to another:"
                + "\n5- Initialize a proper chessboard"
                + "\n6- Draw the chessboard on the console"
                + "\n7- EXIT");
    }

    public static void allWhite(StringBuffer a, StringBuffer b, StringBuffer c, StringBuffer d, StringBuffer e, StringBuffer f, StringBuffer g, StringBuffer h) {

        a.replace(0, a.length(), "00000000");
        b.replace(0, b.length(), "00000000");
        c.replace(0, c.length(), "00000000");
        d.replace(0, d.length(), "00000000");
        e.replace(0, e.length(), "00000000");
        f.replace(0, f.length(), "00000000");
        g.replace(0, g.length(), "00000000");
        h.replace(0, h.length(), "00000000");

    }

    public static void allBlack(StringBuffer a, StringBuffer b, StringBuffer c, StringBuffer d, StringBuffer e, StringBuffer f, StringBuffer g, StringBuffer h) {
        a.replace(0, a.length(), "11111111");
        b.replace(0, b.length(), "11111111");
        c.replace(0, c.length(), "11111111");
        d.replace(0, d.length(), "11111111");
        e.replace(0, e.length(), "11111111");
        f.replace(0, f.length(), "11111111");
        g.replace(0, g.length(), "11111111");
        h.replace(0, h.length(), "11111111");
    }

    public static void drawVirtualCB(StringBuffer a, StringBuffer b, StringBuffer c, StringBuffer d, StringBuffer e, StringBuffer f, StringBuffer g, StringBuffer h) {
        addSpace(a);
        addSpace(b);
        addSpace(c);
        addSpace(d);
        addSpace(e);
        addSpace(f);
        addSpace(g);
        addSpace(h);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);

    }

    public static void addSpace(StringBuffer a) {
        for (int i = 1; i < 21; i += 3) {
            a.insert(i, "  ");
        }
    }
    
    public static void convertIntoProperChessBoard(StringBuffer a, StringBuffer b, StringBuffer c, StringBuffer d, StringBuffer e, StringBuffer f, StringBuffer g, StringBuffer h){
        a.replace(0, a.length(), "01010101");
        b.replace(0, b.length(), "10101010");
        c.replace(0, c.length(), "01010101");
        d.replace(0, d.length(), "10101010");
        e.replace(0, e.length(), "01010101");
        f.replace(0, f.length(), "10101010");
        g.replace(0, g.length(), "01010101");
        h.replace(0, h.length(), "10101010");
    }    
    
    public static void changeDiagonals(StringBuffer a, StringBuffer b, StringBuffer c, StringBuffer d, StringBuffer e, StringBuffer f, StringBuffer g, StringBuffer h, char x){
    
        a.setCharAt(7, x);
        b.setCharAt(6, x);
        c.setCharAt(5, x);
        d.setCharAt(4, x);
        e.setCharAt(3, x);
        f.setCharAt(2, x);
        g.setCharAt(1, x);
        h.setCharAt(0, x); 
        
        a.setCharAt(0, x);
        b.setCharAt(1, x);
        c.setCharAt(2, x);
        d.setCharAt(3, x);
        e.setCharAt(4, x);
        f.setCharAt(5, x);
        g.setCharAt(6, x);
        h.setCharAt(7, x);
    }
    public static void deleteSpaces(StringBuffer x){
        int y=3;
        for (int i = 1; i < x.length()-1; i++) {
            x.delete(i, y++);     
        }
    }    
    public static void deleteAllRanksSpaces(StringBuffer a, StringBuffer b, StringBuffer c, StringBuffer d, StringBuffer e, StringBuffer f, StringBuffer g, StringBuffer h){
        deleteSpaces(a);
        deleteSpaces(b);
        deleteSpaces(c);
        deleteSpaces(d);
        deleteSpaces(e);
        deleteSpaces(f);
        deleteSpaces(g);
        deleteSpaces(h);     
    }

    public static String swapSquareColor(char x){
        String y;
        if(x == '1')
            y = "0";        
        else if(x == '0')
            y = "1" ;        
        else
            y = "?";
        return y;
    }

    public static int convertFirstChToInt(char x){
    int y = 0;
        switch(x){
        case 'a': y = 0; break;
        case 'b': y = 1; break;
        case 'c': y = 2; break;
        case 'd': y = 3; break;
        case 'e': y = 4; break;
        case 'f': y = 5; break;
        case 'g': y = 6; break;
        case 'h': y = 7; 
    }
    return y;
    }
    
    public static void changeSquare(char x, char y,StringBuffer a, StringBuffer b, StringBuffer c, StringBuffer d, StringBuffer e, StringBuffer f, StringBuffer g, StringBuffer h){              
        
        if (y == '1'){
        h.replace(convertFirstChToInt(x), convertFirstChToInt(x)+1, swapSquareColor(h.charAt(convertFirstChToInt(x))));        
        }
        if (y == '2'){
        g.replace(convertFirstChToInt(x), convertFirstChToInt(x)+1, swapSquareColor(g.charAt(convertFirstChToInt(x))));  
        }
        if (y == '3'){
        f.replace(convertFirstChToInt(x), convertFirstChToInt(x)+1, swapSquareColor(f.charAt(convertFirstChToInt(x))));  
        }
        if (y == '4'){
        e.replace(convertFirstChToInt(x), convertFirstChToInt(x)+1, swapSquareColor(e.charAt(convertFirstChToInt(x))));  
        }
        if (y == '5'){
        d.replace(convertFirstChToInt(x), convertFirstChToInt(x)+1, swapSquareColor(d.charAt(convertFirstChToInt(x))));  
        }
        if (y == '6'){
        c.replace(convertFirstChToInt(x), convertFirstChToInt(x)+1, swapSquareColor(c.charAt(convertFirstChToInt(x))));  
        }
        if (y == '7'){
        b.replace(convertFirstChToInt(x), convertFirstChToInt(x)+1, swapSquareColor(b.charAt(convertFirstChToInt(x))));  
        }
        if (y == '8'){
        a.replace(convertFirstChToInt(x), convertFirstChToInt(x)+1, swapSquareColor(a.charAt(convertFirstChToInt(x))));  
        }        
    }
}
