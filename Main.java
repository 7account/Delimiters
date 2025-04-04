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
    }
}