public class FormulaProcessor {

    public void formulaIsNull(String string){
        if (string.isBlank()) {
            throw new IllegalArgumentException();
        }
    }

    public String[] splitFormula(String string){
        String[] strList = string.split(" ");
        return strList;
    }

    public boolean operatorChecker(String string) {
        if("+-/*".contains(string)){
            return true;
        }

        throw new IllegalArgumentException();
    }
}
