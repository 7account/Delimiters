import java.util.ArrayList;

public class Delimiters {
    private String openDel;
    private String closeDel;
    public Delimiters(String open, String close) {
        openDel = open;
        closeDel = close;
    }

    public ArrayList<String> getDelimitersList(String[] tokens) {
        ArrayList<String> result = new ArrayList<String>();
        for (int x = 0; x < tokens.length; x++) {
            if (tokens[x] == closeDel) result.add(tokens[x]);
            else if (tokens[x] == openDel) result.add(tokens[x]);
        }
        return result;
    }

    public boolean isBalanced(ArrayList<String> delimiters) {
        int openCount = 0;
        int closeCount = 0;
        for (int x = 0; x < delimiters.size(); x++) {
            if (delimiters.get(x) == openDel) openCount++;
            else if (delimiters.get(x) == closeDel) closeCount++;
            if (closeCount > openCount) return false;
        }
        if (openCount != closeCount) return false;
        return true;
    }
}