import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //(a)
        Delimiters exampleA1 = new Delimiters("(", ")");
        String[] tokensA1 = {"(", "x + y", ")", " + 5"};
        System.out.println(exampleA1.getDelimitersList(tokensA1));
        
        Delimiters exampleA2 = new Delimiters("<q>", "</q>");
        String[] tokensA2 = {"<q>", "yy", "</q>", "zz", "</q>"};
        System.out.println(exampleA2.getDelimitersList(tokensA2));

        //(b)
        Delimiters exampleB1 = new Delimiters("<sup>", "</sup>");
        String[] tokensB1 = {"<sup>", "<sup>", "</sup>", "<sup>", "</sup>", "</sup>"};
        System.out.println(exampleB1.isBalanced(exampleB1.getDelimitersList(tokensB1)));

        Delimiters exampleB2 = new Delimiters("<sup>", "</sup>");
        String[] tokensB2 = {"<sup>", "</sup>", "</sup>", "<sup>"};
        System.out.println(exampleB1.isBalanced(exampleB2.getDelimitersList(tokensB2)));

        Delimiters exampleB3 = new Delimiters("<sup>", "</sup>");
        String[] tokensB3 = {"</sup>"};
        System.out.println(exampleB3.isBalanced(exampleB3.getDelimitersList(tokensB3)));

        Delimiters exampleB4 = new Delimiters("<sup>", "</sup>");
        String[] tokensB4 = {"<sup>", "<sup>", "</sup>"};
        System.out.println(exampleB4.isBalanced(exampleB4.getDelimitersList(tokensB4)));
    }
}