import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Spreadsheet {
    int[][] sheet;

    public Spreadsheet(int rows) {
        sheet = new int[rows][26];
    }

    public void setCell(String cell, int value) {
        char columnChar = cell.charAt(0);
        String rowString = cell.substring(1);
        int rowNo = Integer.parseInt(rowString) - 1;
        int columnNo = columnChar - 'A';
        if (rowNo < sheet.length && rowNo >= 0) {
            sheet[rowNo][columnNo] = value;
        }
    }

    public void resetCell(String cell) {
        char columnChar = cell.charAt(0);
        String rowString = cell.substring(1);
        int rowNo = Integer.parseInt(rowString) - 1;
        int columnNo = columnChar - 'A';

        if (rowNo < sheet.length && rowNo >= 0) {
            sheet[rowNo][columnNo] = 0;
        }
    }

    public int getValue(String formula) {
        if (formula.startsWith("=")) {
            formula = formula.substring(1);
        }
        String[] strArr = formula.split("\\+");
        int val1 = getTermValue(strArr[0]);
        int val2 = getTermValue(strArr[1]);

        return val1 + val2;
    }

    private int getTermValue(String term) {
        Pattern uppercasePattern = Pattern.compile("[A-Z]");
        Matcher matcher = uppercasePattern.matcher(term);

        if (matcher.find()) {
            char columnChar = term.charAt(0);
            String rowString = term.substring(1);

            int columnNo = columnChar - 'A';
            int rowNo = Integer.parseInt(rowString);
            return sheet[rowNo - 1][columnNo];
        } else {
            return Integer.parseInt(term);
        }
    }
}